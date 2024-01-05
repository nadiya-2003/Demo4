import java.util.Scanner;
class Pattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
int x,y;
if(row%2==0)x=y=row/2;
else
{
x=row/2;y=row/2+1;
}
printPattern(ch,x);
printReversePattern(ch,y);
}
public static void printReversePattern(char c,int n)
{
for (int i=n;i>=1;i--)
{
printLine(c,i);
}
}
public static void printPattern(char c, int n)
{
for(int i=0;i<n;i++)
{
System.out.print("\n");
for(int j=0;j<=i;j++)
System.out.print(c);
}
}
public static void printLine(char c,int col)
{
System.out.print("\n");
for(int j=1;j<=col;j++)System.out.print(c);
}
}
