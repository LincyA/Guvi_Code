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
 for(int i=0;i<stc.length;i+=2)
{
String[] =new tmp[stc.length];

 tmp[i] = stc[i];
     stc[i] = stc[i+1];
     stc[i+1] = tmp[i];


System.out.println(stc[i]);
}

}}
