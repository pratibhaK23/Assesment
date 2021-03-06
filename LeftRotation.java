package Assesments;

import java.util.Scanner;

public class LeftRotation
{		
		
    public void rotate(int rot, int num[], int n)
    {
        int[] Nnum = new int[rot];
		
		for(int i=0; i<rot; i++)
		{
			Nnum[i]=num[i];
		}
		
      
		for(int i=rot; i<n;i++)
		{
			num[i-rot]=num[i];
		}
		
		for(int i=0; i<rot;i++)
		{
			num[i+n-rot]=Nnum[i];

		}
    }
    
    public void printArray(int num[])
    {

		for(int i=0; i<num.length;i++)
		{
			System.out.print(num[i]+" ");

		}
    }
	
	public static void main(String[] args)
	{
		LeftRotation t = new LeftRotation();
		
        Scanner sc = new Scanner(System.in);
        
       // System.out.println("Enter the number of elements in the Array");
		int n = sc.nextInt();
		
		int[] num = new int[n];

		
		// System.out.println("Enter the number of rotations need to perform on the Array");
		int rot = sc.nextInt();
		
        
		//System.out.println("Enter the elements in the Array");
		
		for(int i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
		}


		t.rotate(rot, num, n);
		t.printArray(num);

		
	}

}
