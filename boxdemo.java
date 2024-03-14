import java.util.Scanner;
class box
{
int l,b,h,v;
void input_data(int p,int q,int r)
{
l=p;
b=q;
h=r;
v=l*b*h;
System.out.println("volume of box:"+v);
}
}

class boxdemo
{
public static void main(String[] args)
{
box v1=new box();
box v2=new box();
v1.input_data(10,20,30);
v2.input_data(40,50,60);
}
}
