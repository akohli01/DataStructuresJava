package stack;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Array Implementation of Stack data structure
 * @param <T>
 */
public class ArrayStack<T>
{
    public static final int EMPTY_STACK_VALUE = -1; // Indicates that stack is empty
    public static final int HELPS_DETERMINE_SIZE = 1; //Helps to determine the size of stack as compared to capacity
    private T [] array; //Holds objects for stack
    private int top = -1;   //Maintains position of the top of the stack

    /**
     * Parameterized Constructor
     * @param initialCapacity the starting value for the capacity of the stack
     */
    public ArrayStack(int initialCapacity)
    {
        this.array = (T[]) new Object[initialCapacity];
    }

    /**
     * Pop operation
     * @return returns the element at the top of the stack
     */
    public T pop()
    {
        if (!isEmpty())
        {
            T poppedObject = array[top];
            array = ArrayUtils.remove(array,top--);
            return poppedObject;
        }
        return null;
    }

    /**
     * Push operation
     * @param element to add to the top of stack
     */
    public void push(T element)
    {
        if(!isFull())
        {
            array[++top] = element;
        }
    }

    /** Peek operating
     * @return element at the top of stack without deleting it from the stack
     */
    public T peek()
    {
        if(!isEmpty())
        {
            return array[top];
        }
        return null;
    }

    /**
     * Checks if stack is empty
     * @return boolean value indicating whether stack is empty
     */
    private boolean isEmpty()
    {
        return top == EMPTY_STACK_VALUE;
    }

    /**
     * Checks if stack is full
     * @return boolean value indicating whether stack is full
     */
    private boolean isFull()
    {
        return array.length == top + HELPS_DETERMINE_SIZE;
    }

    /**
     * Overridden toString method
     * @return text representation of stack
     */
    @Override
    public String toString()
    {
        if(!isEmpty())
        {
            StringBuilder tempElementHolder = new StringBuilder();

            for (T element: array)
            {
                if(element != null)
                tempElementHolder.append(element).append(", ");
            }
            return tempElementHolder.toString();
        }
        return "";
    }

}