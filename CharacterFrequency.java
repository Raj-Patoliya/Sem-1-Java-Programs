import java.lang.*;
import java.io.*;
import java.util.*;	
public class CommandLineArgs {
	public static void main(String[] args) {
	int len = args[0].length();
		for(int i=0;i<len;i++)	
		{
			for(int j = 0;j<9;j++)
			{
				if(charAt(i) == charAt(j))
				{
					if(i != j)
					{
						count++;			
					}			
				}	
			}		
		}
		
	}
}
