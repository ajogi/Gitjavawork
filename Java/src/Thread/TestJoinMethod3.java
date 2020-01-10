package Thread;
class TestJoinMethod3 extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  TestJoinMethod3 t1=new TestJoinMethod3();  
  TestJoinMethod3 t2=new TestJoinMethod3(); 
  Thread t=Thread.currentThread();
  System.out.println("Current thread: " + t.getName());
  System.out.println("Name of t:"+t.getName());
  t.setName("Jogi");
  System.out.println("Name of sett:"+t.getName());
  System.out.println("Name of t1:"+t1.getName()); 
  t1.setName("a1");
  System.out.println("Name of sett1:"+t1.getName());
  System.out.println("Name of t2:"+t2.getName());  
  System.out.println("id of t1:"+t1.getId());  
  System.out.println("id of t:"+t.getId());  

  System.out.println("id of t2:"+t2.getId());
  t1.start();  
  t2.start();  
  
  t1.setName("Sonoo Jaiswal");  
  System.out.println("After changing name of t1:"+t1.getName());
  
 }  
}  