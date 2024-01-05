import java.util.Scanner;
class Loop4
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);

int n=scob.nextInt();
for(int i=n;i>=0;i=i-5)
{
System.out.print(i+" ");
}
}
}