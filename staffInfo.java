import java.util.Scanner;

class staff
{
String name;
int staffid;
long pno;
double salary;

void input()
{
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("enter name: ");
name=sc.nextLine();
System.out.println("enter staff id:");
staffid=s.nextInt();
System.out.println("enter phone number:");
pno=s.nextLong();
System.out.println("enter salary:");
salary=s.nextDouble();
}
void output()
{
System.out.println("name is:"+name);
System.out.println("staff identity is:"+staffid);
System.out.println("phone number is:"+pno);
System.out.println("salary is:"+salary);
}
}

class teaching extends staff
{
String domain;
int no_pub;

void input()
{
super.input();
Scanner sc=new Scanner(System.in);
domain=sc.nextLine();
no_pub=sc.nextInt();
}
void output()
{super.output();
System.out.println("domain is:"+domain);
System.out.println("no of publication is:"+no_pub);
}
}
class staffInfo
{
public static void main(String args[])
{
teaching t=new teaching();
t.input();
t.output();
}
}

