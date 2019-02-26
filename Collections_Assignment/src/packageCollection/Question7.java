package packageCollection;

import java.util.Stack;

class NewStack
{
    Stack<Integer> stack;
    Integer minElement;


    NewStack() {
        stack = new Stack<>();
    }

    void getMin()
    {
        if (stack.isEmpty())
            System.out.println("Stack is empty");


        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + minElement);
    }

    void peek()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = stack.peek();

        System.out.print("Top Most Element is: ");

        if (t < minElement)
            System.out.println(minElement);
        else
            System.out.println(t);
    }

    void pop()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = stack.pop();

        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minElement)
        {
            System.out.println(minElement);
            minElement = 2*minElement - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x)
    {
        if (stack.isEmpty())
        {
            minElement = x;
            stack.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        if (x < minElement)
        {
            stack.push(2*x - minElement);
            minElement = x;
        }

        else
            stack.push(x);

        System.out.println("Number Inserted: " + x);
    }
}
public class Question7
{
    public static void main(String[] args)
    {
        NewStack s = new NewStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1); 
        s.push(0);
        s.push(-1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}