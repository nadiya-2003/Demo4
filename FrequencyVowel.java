import java.util.Scanner;
public class FrequencyVowel
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
String str=scob.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='a')||(str.charAt(i)=='e')
    ||(str.charAt(i)=='i')||(str.charAt(i)=='o')
    ||(str.charAt(i)=='u')||(str.charAt(i)=='A')
    ||(str.charAt(i)=='E')||(str.charAt(i)=='I')
    ||(str.charAt(i)=='O')||(str.charAt(i)=='U'))
{
count++;
}
}
System.out.println(count);
}
}