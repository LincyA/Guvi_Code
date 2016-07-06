import java.io.*;
import java.util.*;
class Lcm
{
public static void main(String[] a)
{ 
System.out.println("Enter 2 no's = ");
Scanner sc = new Scanner(System.in);
int n1= sc.nextInt();
int n2= sc.nextInt();
if(n1>n2)
{
max=n1;
min=n2;
}
else
{
max=n2;
min=n1;
}
for(int i=1;i<=min;i++)
   {
    x=max*i; 
    if(x%min==0) 
     {
      lcm=x; 
      break; 
     }
    }
System.out.println("L.C.M. = "+lcm);
}
}
