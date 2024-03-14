import java.util.Scanner;

//information of train by constructors

class train 
{
int train_num;
String source;
int cost;
String train_name;


void get_tra_det()
{
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
train_num=sc.nextInt();
source=s.nextLine();
cost=sc.nextInt();
train_name=s.nextLine();
}

void print_det()
{
System.out.println("train number is-"+train_num);
System.out.println("train source is-"+source);
System.out.println("train cost is-"+cost);
System.out.println("train name is-"+train_name);
}
}



class train_demo
{
public static void main(String [] args)
{
train t1=new train();
train t2=new train();
t1.get_tra_det();
t2.get_tra_det();
t1.print_det();
t2.print_det();
}
}




