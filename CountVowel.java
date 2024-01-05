import java.util.Scanner;
class CountVowel
{
static boolean checkDigit(char c)
{
boolean b;
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
b=true;
}
else
{
b=false;
}
return b;
}

public static void main(String args[])
{
String str;
int count=0;
Scanner scob=new Scanner(System.in);
System.out.println(" ");
System.out.println("Enter a string:");
str=scob.nextLine();
System.out.println("");
for(int i=0;i<str.length();i++)
{
if(checkDigit(str.charAt(i)))
{
count++;
}
}

System.out.println("Number of digits ="+count);

}
}




