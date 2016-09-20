import java.io.*;
import java.util.*;
class wordRepeated
{
public static void main(String args[])
{
int i,j,k,index,count,max;
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
String words[]=s.split(" ");
int len=words.length;
int a[]=new int[len];
for(i=0;i<len;i++)
{
    count=0;
    for(j=0;j<len-1;j++)
    {
        for(k=j+1;k<len;k++)
        {
        if(words[i].charAt[j]==words.charAt[k])
        {
            count++;
        }
        }
    }
    a[i]=count;
}
max=a[0];
for(i=1;i<len;i++)
{
    if(max<a[j])
    {
        max=a[j];
        index=j;
    }
}
System.out.println(a[index]);
}}
