import java.util.Scanner;
public class FrequencyChar
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
String str=scob.nextLine();
char ch=scob.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if (str.charAt(i)==ch)
{
count++;
}
}

System.out.println(count);
}
}
