package synchronization14;

class Sender 
{ 
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    Sender  sender; 
    ThreadedSend(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
} 

public class SyncDemo {
	
	class Sender 
	{ 
	    public void send(String msg) 
	    { 
	        System.out.println("Sending\t"  + msg ); 
	        try
	        { 
	            Thread.sleep(1000); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("Thread  interrupted."); 
	        } 
	        System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class ThreadedSend extends Thread 
	{ 
	    private String msg; 
	    private Thread t; 
	    Sender  sender; 
	    ThreadedSend(String m,  Sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 
	  
	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    } 
	} 

}
