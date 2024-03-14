class box_demo
{
void box(int p)
{
int l,b;
l=4;
b=10;
intvol=l*b*h;
}

void box()
{
int l,b,h;
l=100;
b=10;
h=50;
int vol=l*b*h;
}

void box(int a,int b,int c)
{
int vol;
vol=l*b*h;
}

void print_output()
{
System.out.println("vol of box:"+vol);
}

}

class vol_boxes
{
public static void main(Strings[] args)
{
box_demo b1=new box_demo();
box_demo b2=new box_demo();
b1.box();
b1.print_output();

}
}
