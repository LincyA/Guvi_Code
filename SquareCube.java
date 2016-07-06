import java.io.*;
import java.util.*;
class SquareCube
{
public static void main(String[] a)
{ 
int sum=0;
System.out.println("Enter the size of the array = ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr=new int [n]; 
int[] ar=new int [n]; 
System.out.println("Enter the elements : ");
 for(int i=0;i<arr.length;i++)
{
 arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
ar[i]=0;
}
if(arr[i]%2==0)
{
ar[i]=arr[i]*arr[i];
}
else
{
ar[i]=arr[i]*arr[i]*arr[i];
}
sum=sum+ar[i];
}
System.out.println("Sum of the even sqaures and odd cubes ="+sum);
}}

