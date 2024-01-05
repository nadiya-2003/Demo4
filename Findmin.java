import java.util.Scanner;
class Findmin
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
int b=scob.nextInt();
int c=scob.nextInt();
int min;
int max;
if(a<b)
{
    if(a<c)min=a;
    else min=c;
}
else
{
   if(b<c)min=b;
   else min=c;
}
System.out.println("Minimum is"+min);
}
}
