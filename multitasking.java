class hello extends Thread
{
public void run ()
{
for (int j=1;j<=5;j++)
System.out.println("hello");
}
}
class hi extends Thread
{
public void run()
{
for (int k=1;k<=5;k++)
System.out.println("hi");
}
}

class multitasking
{
public static void main(String [] args)
{
hello h1=new hello();
hi h2=new hi();
h1.start();
h2.start();
}
}
