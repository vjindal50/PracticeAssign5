//author : Vaibhav Jindal

package Assign5;

public class MultiThreading extends Thread implements Runnable   
{  
  public static void main (String[] args)  
  { // main thread 
    System.out.println("This is currently running on the main thread, " +  
            "the id is: " + Thread.currentThread().getId()); 
    // seperate thread 1
    MultiThreading worker = new MultiThreading();   
    Thread thread = new Thread(worker);  
    thread.start(); 
    //seperate thread 2
    MultiThreading worker2 = new MultiThreading();  
    worker2.start();
    
  }  
    
  @Override   // overriding run function
  public void run()   
  {  
    System.out.println("This is currently running on a separate thread, " +  
            "the id is: " + Thread.currentThread().getId() + 
            " the name is " + Thread.currentThread().getName() + 
            " and the priority is " + Thread.currentThread().getPriority());   
  }  
}  
