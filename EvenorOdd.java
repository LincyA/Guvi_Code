import java.io.*;
import java.util.*;
class Number
{
public static void main(String[] a)
{ 
System.out.println("Enter a number = ");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if(number%2==0)
{
System.out.println("Even number");
}
else 
{
System.out.println("Odd number");
}
}}
