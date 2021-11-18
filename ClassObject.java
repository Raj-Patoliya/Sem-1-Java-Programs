import java.io.*;

class Student
{
	private String name,eno,gender;
	private int marks1,marks2;
	private static int count=0;
	Student(){this("","","",0,0);

	}
	Student(String eno,String name,String gender,int marks1,int marks2)
	{
		this.eno=eno;
		this.name=name;
		this.gender=gender;
		this.marks1=marks1;
		this.marks2=marks2;
		count++;
	}

	public void display()
	{
		System.out.print("\n\n\tEnrollment no. :"+eno);
		System.out.print("\n\tName           :"+name);
		System.out.print("\n\tGender         :"+gender);
		System.out.print("\n\tSubject 1      :  "+marks1);
		System.out.print("\n\tSubject 2      :  "+marks2);
		System.out.print("\n\tTotal Students :"+count+"\n\n");
	}
}
public class Q6
{
	public static void main(String a[])
	{
		Student s= new Student();
		s.display();
		Student s2= new Student("SCET0021","Raj Patel;","Male",80,90);
		s2.display();
	}
}
