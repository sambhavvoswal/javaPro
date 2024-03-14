class overloaddemo
{
void input()
{
System.out.println("no argument");
}

void input(int a)
{
System.out.println("the arguments are "+a);
}

void input(int p,int q)
{
System.out.println("two arguments"+(p+q));
}
}

class demomethod
{
public static void main(String[] args)
{
overloaddemo d=new overloaddemo();
d.input();
d.input(10);
}
}
