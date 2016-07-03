import java.io.*;
import java.util.*;
class Sum
{
public static void main(String[] a)
{ 
int sum=0;
System.out.println("Enter a number = ");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if(number<0)
{
 System.out.println("Enter a positive number");  
}
for(int i=1;i<=number;i++)
    {
        sum += i; 
    }
System.out.println("Sum of given"+number+"natural numbers = "+sum);
}}
