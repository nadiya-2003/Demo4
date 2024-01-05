import java.util.*;
class Findmax
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a=scob.nextInt();
int b=scob.nextInt();
int c=scob.nextInt();
int max;
if(a>b)
{ 
  if (a>c)max=a;
  else max=c; 
}
else
{
if(b>c)max=b;
else max=c;
}
System.out.println("maximum no is"+ max);
}
}
