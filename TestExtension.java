import java.io.*;
import java.util.*;
class TestExtension
{
public static void main(String[] a)
{ 
System.out.println("Enter the filename with extension = ");
Scanner sc = new Scanner(System.in);
String fn=sc.nextLine();
System.out.println(fn);
String[] parts = fn.split("\\.");
System.out.println("The file extension is:"+parts[1]);
}}
