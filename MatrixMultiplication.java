import java.io.*;
import java.util.*;

class Vipul
{	
	int sum[][] = new int[3][3];
	public void multi(int arr[][],int brr[][],int frow,int fcol,int srow,int scol)
	{
		System.out.print("\n\t First Matrix : ");
		for(int i = 0; i<frow; i++)
		{
			System.out.print(" \n\t");
			for(int j = 0; j<fcol; j++)
			{
				System.out.print(" "+arr[i][j]);
			}		
		}
		System.out.print("\n\t Second Matrix : ");
		for(int i = 0; i<srow; i++)
		{
			System.out.print(" \n\t");
			for(int j = 0; j<scol; j++)
			{
				System.out.print(" "+brr[i][j]);
			}		
		}
		System.out.print("\n\n\t The Multiplication of two Matrices ::\n");
		for(int i = 0; i<frow; i++)
		{	
			
		System.out.print("\n\t");
			for(int j = 0; j<scol; j++)
			{
				sum[i][j]=0;      
					for(int k=0;k<frow;k++)      
					{      
						sum[i][j]+=arr[i][k]*brr[k][j];      
					}
					System.out.print(sum[i][j]+" ");
			}				
		}
	} 
	
}

public class Raj
{
	public static void main(String args[])
	{
		Vipul v = new Vipul();
		int frow,fcol,srow,scol;
		int arr[][] = new int[3][3];
		int brr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter the Numbers of Row of 1st Matrix : ");
		frow = Integer.parseInt(sc.nextLine());
		System.out.print("\n\tEnter the Numbers of Column of 1st Matrix : ");
		fcol = Integer.parseInt(sc.nextLine());
		System.out.print("\n\tEnter the Numbers of Row of 2nd Matrix : ");
		srow = Integer.parseInt(sc.nextLine());
		System.out.print("\n\tEnter the Numbers of Column of 2nd Matrix : ");
		scol = Integer.parseInt(sc.nextLine());
		
		if(fcol == srow)
		{
			for(int i = 0; i<frow; i++)
			{
				for(int j = 0; j<fcol; j++)
				{
					System.out.print("\n\tArr["+i+"]["+j+"] = ");
					arr[i][j] = Integer.parseInt(sc.nextLine());
				}		
			}
			for(int i = 0; i<srow; i++)
			{
				for(int j = 0; j<scol; j++)
				{
					System.out.print("\n\tBrr["+i+"]["+j+"] = ");
					brr[i][j] = Integer.parseInt(sc.nextLine());
				}		
			}
			v.multi(arr,brr,frow,fcol,srow,scol);
		}
		else
		{
			System.out.print("\n\t This Multiplication does not possible ");
		}	
	}
}
