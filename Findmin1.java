import java.util.Scanner;
class Findmin1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
int b=scob.nextInt();
int c=scob.nextInt();
int min;
int max;
if((a>b)&&(a>c))
{
System.out.println( a +"is maximum");
 if(b>c)
{
System.out.println("\n");
}
}
else
{
System.out.println(b +"is minimum");
}
if((b>a)&&(b>c))
{
System.out.println( b +"is maximum");

 if(a>c)
{
System.out.println("\n");
}
}
else
{
System.out.println(a +"is minimum");
}
if((c>b)&&(c>a))
{
System.out.println( c +"is maximum");
 if(a>b)
{
System.out.println("\n");}}
else
{
System.out.println(a+"is minimum");
}
}
}

