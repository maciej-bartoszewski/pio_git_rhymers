package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class IntLinkedListTest {
    private IntLinkedList list;

    @Before
    public void setUp(){
        list = new IntLinkedList();
    }

    @Test
    public void testPopWhenEmpty() {
        int result = list.pop();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testPopWhenNotEmpty() {
        int value = 3;
        list.push(value);
        int result = list.pop();
        Assert.assertEquals(value, result);
    }

    @Test
    public void testTopWhenEmpty() {
        int result = list.top();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testTopWhenNotEmpty() {
        int value = 3;
        list.push(value);
        int result = list.top();
        Assert.assertEquals(value, result);
    }

    @Test
    public void testPushAndTopMultipleTimes() {
        for(int i = 0; i < 100; i++){
            list.push(i);
            Assert.assertEquals(i, list.top());
        }
    }

    @Test
    public void testPushAndPopMultipleTimes() {
        int endValue = 100;
        for(int i = 0; i < endValue; i++){
            list.push(i);
        }

        for(int i = endValue - 1; i >= 0; i--){
            Assert.assertEquals(i, list.pop());
        }
    }
}
