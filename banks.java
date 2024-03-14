class bank
{
int ri;
}

class sbi extends bank
{
int get_R(int a)
{
ri=a;
return (ri);
}
};

class axis extends bank
{
int get_R(int a)
{
ri=a;
return (ri);
}
};

class canara extends bank
{
int get_R(int a)
{
ri=a;
return ri;
}
};

class banks
{
public static void main (String[] args)
{
sbi i=new sbi();
axis a=new axis();
canara c=new canara();
int RI=i.get_R(8);
System.out.println("rate of interest in sbi is"+RI);
int RI1=a.get_R(10);
System.out.println("rate of interest in axis is"+RI1);
int RI2=c.get_R(20);
System.out.println("rate of interest in canara is"+RI2);
}
}
