package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayStackTest
{
    private ArrayStack<String> stringArrayStack;

    @BeforeEach
    public void initializeArrayStack()
    {
        stringArrayStack = new ArrayStack<String>(10);
    }

    @Test
    public void testPushOperation()
    {
        stringArrayStack.push("Amit");
        stringArrayStack.push("Kohli");

        assertEquals("Amit, Kohli, ",stringArrayStack.toString());
    }

    @Test
    public void testPopOperation()
    {
        testPushOperation();
        stringArrayStack.pop();

        assertEquals("Amit, ", stringArrayStack.toString());
    }

    @Test
    public void testPeekOperation()
    {
        testPushOperation();

        assertEquals("Kohli", stringArrayStack.peek());

    }

}