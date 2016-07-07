import java.io.*;
import java.util.*;
class Fact
{
public static void main(String[] a)
{ 
int i,fact=1; 
System.out.println("Enter the  number = ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for(i=1;i<=num;i++)
{    
      fact=fact*i;    
}    
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  
