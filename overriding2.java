class area
{
int ln,wd;

area()
{
ln=10;
wd=9;
}

area(int a,int b)
{
ln=a;
wd=b;
}

int calc()
{
int ar;
ar=ln*wd;
return(ar);
}
}

class overriding2
{
public static void main (String args[])
{
area a=new area();
area b=new area(10,10);
System.out.println("area is "+b.calc());
System.out.println("area is "+a.calc());
}
}