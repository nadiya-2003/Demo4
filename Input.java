import java.util.Scanner;
class Input
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
if(dn==0)
{
System.out.println("Sunday");
}
else if(dn==1)
{
System.out.println("Monday");
}
else if(dn==2)
{
System.out.println("Tuesday");
}
else if(dn==3)
{
System.out.println("Wednesday");
}
else if(dn==4)
{
System.out.println("Thursday");
}
else if(dn==5)
{
System.out.println("Friday");
}
else if(dn==6)
{
System.out.println("Saturday");
}
else
{
System.out.println("INVALID");
}
}
}

