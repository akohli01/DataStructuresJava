package stack;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Array Implementation of Stack data structure
 * @param <T>
 */
public class ArrayStack<T>
{
    private T [] array; //Holds objects for stack
    private int size = 0;   //Used to specify the # of elements that are presently in the stack
    private int top = -1;   //Maintains position of the top of the stack

    /**
     * Parameterized Constructor
     * @param initialCapacity the starting value for the capacity of the stack
     */
    public ArrayStack(int initialCapacity) //Constructor
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
            array = ArrayUtils.remove(array,top);
            top--;
            size--;
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
            top++;
            size++;
            array[top] = element;
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
        return size == 0;
    }

    /**
     * Checks if stack is full
     * @return boolean value indicating whether stack is full
     */
    private boolean isFull()
    {
        return array.length == size;
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
                tempElementHolder.append(element + ", ");
            }
            return tempElementHolder.toString();
        }
        return "";
    }

}