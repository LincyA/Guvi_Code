import java.io.*;
import java.util.*;
class Minmax
{
public static void main(String[] a)
{ 
System.out.println("Enter the size of the array = ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr=new int [n]; 
System.out.println("Enter the elements : ");
 for(int i=0;i<arr.length;i++)
{
 arr[i]=sc.nextInt();
}
Arrays.sort(arr); 
int res=arr[0]+arr[arr.length-1];
System.out.println("Sum of the maximum and minimum elements:"+res);
}}
