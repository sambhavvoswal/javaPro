import java.util.Scanner;
class one
{
int a,b;
void input_data(int p,int q)
{
a=p;
b=q;
System.out.println("a="+a);
System.out.println("b="+b);
}
}

class number
{
public static void main(String [] args)
{
one obj=new one();
one obj1=new one();
obj.input_data(10,20);
obj1.input_data(30,40);
}
}

