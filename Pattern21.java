import java.util.Scanner;
class Pattern21
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char ch=scob.next().charAt(0);
int row=scob.nextInt();
printPattern(ch,row);
}
public  static void printPattern(char c,int n)
{
for(int i=n;i>=1;i--)
{
printLine(c,i);
}
}
public static void printLine(char c,int col)
{
System.out.print("\n");
for(int j=1;j<=col;j++)System.out.print(c);
}
}