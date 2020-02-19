package cs108;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundedIntQueueTest {

    @Test
    public static void normalCapacityWorks(){
        BoundedIntQueue test = new BoundedIntQueueBuggy(4);
        assertEquals(4, test.capacity());
    }
    @Test
    public static void extremeCapacityWorks(){
        BoundedIntQueue test = new BoundedIntQueueBuggy(0);
        assertEquals(0, test.capacity());
    }

    public static void main(String[] args) {
        normalCapacityWorks();
        extremeCapacityWorks();
    }



}