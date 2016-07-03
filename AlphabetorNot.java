import java.io.*;
import java.util.*;
class Alpha
{
public static void main(String[] a)
{ 
System.out.println("Enter a character = ");
Scanner sc = new Scanner(System.in);
char letter= sc.next().charAt(0);
 if((letter>='a' && letter<='z') || (letter>='A' && letter<='Z'))
        {
            System.out.println(letter + " is an Alphabet");
        }
        else
        {
            System.out.println(letter + " is not an Alphabet");
        }
}}
