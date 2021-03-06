package Assesments;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
	
	public void checkAnagram(String str1, String str2)
	{
		
         boolean status=true;
		
		if(str1.length()!=str2.length())
		{
			status=false;
		}
			
		else	
		{
			char[] str1A=str1.toCharArray();
			char[] str2A=str1.toCharArray();
			Arrays.sort(str1A);
			Arrays.sort(str2A);
            
			status=Arrays.equals(str1A, str2A);
			
		}
		
		if(status)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

	public static void main(String[] args) 
	{
		Anagram t2 = new Anagram();
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
       
		t2.checkAnagram(str1, str2);
		
	}

}
