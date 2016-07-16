import java.io.*;
import java.util.*;
class SwapString
{
public static void main(String a[])
{
 System.out.println("Enter string");
 Scanner sc = new Scanner(System.in);
  String s=sc.nextLine();
 char[] stc = s.toCharArray();
 for(int i=0;i<stc.length;i+2)
{


String tmp = stc[i];
     stc[i] = stc[i+1];
     stc[i+1] = tmp;
}

System.out.println(stc[i]);
}

}}
