import java.io.*;
import java.util.*;
class RevString
{
public static void main(String a[])
{
 String s, rev = "";
 Scanner sc = new Scanner(System.in);
 s=sc.nextLine();
 int length = s.length();
 for( int i = length - 1 ; i >= 0 ; i-- )
{
 rev = rev + s.charAt(i)+"-";
}
  System.out.println(rev);
}
}
