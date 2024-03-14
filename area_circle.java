import java.util.Scanner;

class area_circle
{
public static void main(String [] args)
{
double r,a;
Scanner sc = new Scanner(System.in);
System.out.println("enter the radius of circle");
r=sc.nextFloat();
a=3.14*(r*r);
System.out.println("area of circle: "+a);
}
}