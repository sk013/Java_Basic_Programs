import java.util.Scanner;
class Dstudent{
public static void main(String [] agrs)
{
int a;
System.out.println("Enter the percentage of student");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(75<=a&&a<=100)
{
System.out.println("got 1st division");
}
else if(60<=a&&a<75)
{
System.out.println("Got 2nd division");
}
else if (33<=a&&a<60)
{
System.out.println("Got 3rd division");
}
else
{
System.out.println("failed");
}
}}