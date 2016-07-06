import java.io.*;
import java.util.*;
class ReverseString
{
public static void main(String a[])
{
 String s, rev = "";
 System.out.println("Enter string to reverse");
 Scanner sc = new Scanner(System.in);
 s=sc.nextLine();
 int length = s.length();
 for( int i = length - 1 ; i >= 0 ; i-- )
{
 rev = rev + s.charAt(i);
}
  System.out.println("Reverse of entered string is: "+rev);
}
}
