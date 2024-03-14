import java.util.Scanner;

class person
{
String name;
int id;
void getdata(String a,int b)
{
name=a;
id=b;
}

void print()
{
System.out.println("name="+name);
System.out.println("id="+id);
}
}

class persons
{
public static void main(String[] args)
{
person p1=new person();
person p2=new person();
p1.getdata("mgk",28);
p2.getdata("sbk",4);
p1.print();
p2.print();

}
}