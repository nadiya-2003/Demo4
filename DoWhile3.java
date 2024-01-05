import java.util.Scanner;
class DoWhile3
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
do
{
System.out.print(i+" ");
i=i+5;
}while(i<=100);
}
}

