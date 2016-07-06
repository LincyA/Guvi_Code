import java.io.*;
import java.util.*;
class SumofNumbers
{
public static void main(String[] a)
{ 
int sum=0;
System.out.println("Enter a number = ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1 ;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Sum="+sum);
}}
