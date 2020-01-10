package Thread;
class TestCallRun1 extends Thread{  
 public void run(){  
	
		 try {
			 Thread.sleep(500);
		 }
		 catch(InterruptedException e)
		    {
		    	 System.out.println(e);
		    }
		 
		
	
   System.out.println("running...");  
 }
 public static void main(String args[]){  
  TestCallRun1 t1=new TestCallRun1();  
  t1.run();//fine, but does not start a separate call stack  
  t1.run();
 }  
}  