package PracticeProject28;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("Kolkata");
        		locationsQueue.add("Hyderabad");
        		locationsQueue.add("Chennai");
        		locationsQueue.add("Goa");
        		locationsQueue.add("Mumbai");
        		locationsQueue.add ("Pune");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}
