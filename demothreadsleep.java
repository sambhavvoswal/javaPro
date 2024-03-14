class A extends Thread
{
public void run()
{
try
{
sleep(20);
for(int j=1;j<=50;j++)
System.out.println("j="+j);
}
catch(Exception e)
{
System.out.println("there is an error"+e);
}
}
}
class B extends Thread
{
public void run()
{
for(int k=1;k<=50;k++)
{
System.out.println("k="+k);
}
}
}
class demothreadsleep
{
public static void main (String [] args)
{
A obj1=new A();
B obj2=new B();
obj1.start();
obj2.start();
}
}
