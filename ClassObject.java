import java.io.*;
import java.util.*;

class Student
{
	private int enrNo[] = new int[10];
	private int mark[]  = new int[10];
	private int a;
	private String name[] = new String[10];
	private String gender[] = new String[10];
	public Student()
	{
	}
	public Student(int enr,int mk,String gen,String nm,int a)
	{
		
		enrNo[a] = enr;
		name[a] = nm;
		gender[a] = gen;
		mark[a] = mk;
	}
	public void display(int a)
	{
		System.out.print("\n\tTotal Numbers of Object is  "+a);			
		for(int i = 0;i<a;i++)
		{
			System.out.print("\n\tEnroll No. : "+enrNo[i]);
			System.out.print("\n\tName : "+name[i]);
			System.out.print("\n\t Gender : "+gender[i]);
			System.out.print("\n\t Marks : "+mark[i]);			
		}
		
	}
}
public class ClassObject
{
	public static void main(String args[])
	{
		int  a=0,ch,mark,enr;
		String name,gender;
		Student st[] = new Student[10];
		do{
			System.out.print("\n\t1. For New Record");
			System.out.print("\n\t2. For Display All Records");
			System.out.print("\n\t0. For Exit");
			System.out.print("\n\tSelect your Choice");
			Scanner sc = new Scanner(System.in);
			ch = Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
						
						System.out.print("\n\tEnter Enrollment Number : ");
						enr = Integer.parseInt(sc.nextLine());
						System.out.print("\n\tEnter Student Name");
						name = sc.nextLine();
						System.out.print("\n\tEnter Gender : ");
						gender = sc.nextLine();
						System.out.print("\n\tEnter The Marks : ");
						mark = Integer.parseInt(sc.nextLine());	
					 	st[a] = new Student(enr,mark,gender,name,a);
						a++;
					break;
				case 2:
					Student stt = new Student(); 					
					stt.display(a);
					break;
				case 0:
					return;
				default:
					System.out.println("Wrong Input");					
			}
		}while(ch!=0);	
	}	
}
