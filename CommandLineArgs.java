import java.lang.*;
import java.io.*;
public class CommandLineArgs {
	public static void main(String[] args) {	
		String nameArray[]= new String[11];
		nameArray[0]= "First";
		nameArray[1]= "Second";
		nameArray[2]= "Third";
		nameArray[3]= "Forth";
		nameArray[4]= "Fifth";
		nameArray[5]= "Sixth";
		nameArray[6]= "Seventh";
		nameArray[7]= "Eighth";
		nameArray[8]= "Ninth";
		nameArray[9]= "Tenth";
		nameArray[10]= "Eleventh";
		int i = 0;
		for(String str : args)
		{	
			System.out.println(nameArray[i]+" Student Name is = "+args[i]);	
			i++;	
		}
		
	}
}
