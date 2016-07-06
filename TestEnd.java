import java.io.*;
import java.util.*;
class TestEnd
{
public static void main(String[] a)
{ 
System.out.println("Enter a character =  or Enter q/Q to exit");
Scanner sc = new Scanner(System.in);
char letter= sc.next().charAt(0);
if(letter=='q' || letter=='Q')
{
System.exit(0);
}
else
{
System.out.println("YOU ENTERED"+letter);
}
}}
