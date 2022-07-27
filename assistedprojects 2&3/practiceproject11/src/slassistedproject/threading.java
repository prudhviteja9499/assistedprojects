package slassistedproject;

public class threading extends Thread 
{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}


	public static void main(String[] args)
	{
		threading mt = new  threading();
  		mt.start();


	}

}