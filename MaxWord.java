import java.io.*;
import java.util.*;
class MaxWord
{
public static void main(String a[])
{
String s, rev = "";
int j=0;
Scanner sc = new Scanner(System.in);
s=sc.nextLine();
String words[]=s.split(" ");
int count=words.length;
for(int i=1;i<count;i++)
 {
int max=words[0].length;
if(words[i].length>max)
 {
max=words[i].length;
j=i;
 }
 }
System.out.print(words[j]);
}
}
