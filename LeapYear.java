import java.io.*;
import java.util.*;
class LeapYear
{
public static void main(String[] a)
{ 
System.out.println("Enter year = ");
Scanner sc = new Scanner(System.in);
int yr = sc.nextInt();
if(yr%4==0)
{
System.out.println(yr+"is a leap year");
}
else
{
System.out.println(yr+"is not a leap year");
}
}}
