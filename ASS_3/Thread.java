class Multi extends Thread{
public void run(){ System.out.println("thread is running..."); }
public static void main(String args[]){
Multi t1=new Multi();
t1.start();
}
}
public class MyThread1
{  
// Main method
public static void main(String argvs[])
{
// creating an object of the Thread class using the constructor Thread(String name) Thread t= new Thread("My first thread");
// the start() method moves the thread to the active state t.start();
// getting the thread name by invoking the getName() method
String str = t.getName();
System.out.println(str);
}
}
class Multi3 implements Runnable{
public void run(){
System.out.println("thread is running..."); }
public static void main(String args[]){ Multi3 m1=new Multi3(); Thread t1 =new Thread(m1); 
// Using the constructor Thread(Runnable r) 
t1.start();
}
}
public class MyThread2 implements Runnable
{ public void run()
System.out.println("Now the thread is running"); }
// main method public static void main(String argvs[])
{
// creating an object of the class MyThread2
Runnable r1 = new MyThread2(0);
// creating an object of the class Thread using Thread(Runnable r, String name) Thread th1 = new Thread(r1, "My new thread");
// the start() method moves the thread to the active state th1.start();
// getting the thread name by invoking the getName() method String strth1.getName();
System.out.println(str);
}
