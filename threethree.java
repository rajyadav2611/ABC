import java.util.Stack;

class threethree
{
    static int evaluatePostfix(String exp)//Function to evaluate the postfix expression
    {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);

            if(c == ' ')
                continue;


            else if(Character.isDigit(c))
            {
                int n = 0;

                while(Character.isDigit(c))
                {
                    n = n*10 + (int)(c-'0');
                    i++;
                    c = exp.charAt(i);
                }
                i--;

                stack.push(n);
            }


            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)//taking in an operatar and then performing it in the last two values that were poped
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args)
    {
        String exp = "54     6    +    7    4    -    *    9    /    35    15    +    +";//Expression to be evaluated
        System.out.println(evaluatePostfix(exp));//Printing the evaluated value
    }
}