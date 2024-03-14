import java.util.Scanner;
class room 
{
int ln,wd;
room(int x,int y)
{
ln=x;
wd=y;
}

int area()
{
return(ln*wd);
}
}
class cseroom extends room
{
int ht;
cseroom (int x,int y,int z)
{
super(x,y);
ln=x;wd=y;
ht=z;
}
int volume()
{
return (ln*wd*ht);
}
}

class roomdemo{
public static void main(String [] args)
{
int a,v;
cseroom r=new cseroom(5,6,7);
a=r.area();
v=r.volume();
System.out.println("Area :"+a);
System.out.println("Volume :"+v);
}
}