package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayStackTest
{
    private ArrayStack<String> stringArrayStack;

    @BeforeEach
    public void initializeArrayStack()
    {
        stringArrayStack = new ArrayStack<>(3);
    }

    @Test
    public void testPushOperation()
    {
        stringArrayStack.push("Amit");
        stringArrayStack.push("Kohli");
        stringArrayStack.push("King");

        assertEquals("Amit, Kohli, King, ", stringArrayStack.toString());
    }

    @Test
    public void testPopOperation()
    {
        testPushOperation();
        stringArrayStack.pop();

        assertEquals("Amit, Kohli, ", stringArrayStack.toString());
    }

    @Test
    public void testPeekOperation()
    {
        testPushOperation();

        assertEquals("King", stringArrayStack.peek());
    }

    @Test
    public void testAttemptToPopFromEmptyStack()
    {

        assertEquals(null, stringArrayStack.pop());
    }

    @Test
    public void testAttemptToPushToFullStack()
    {
        testPushOperation();
        stringArrayStack.push("Sam");

        assertEquals("Amit, Kohli, King, ", stringArrayStack.toString());
    }
}