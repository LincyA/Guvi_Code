import java.io.*;
import java.util.*;
class Wrdlength
{
public static void main(String[] a)
{ 
System.out.println("Enter the size of the array = ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String w[] = new String[n];
System.out.println("Enter the elements : ");
 for(int i=0;i<w.length;i++)
{
 w[i]=sc.nextLine();
}
System.out.println("Enter the word length= ");
int l = sc.nextInt();
System.out.println("The word(s) of length" + l+"is/are");
 for(int i=0;i<w.length;i++)
{
 if(w[i].length()==l)
 {
 System.out.println(w[i]);
 }
 }
}}
