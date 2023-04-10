//WAP to find if String contains all unique characters.

import java.util.*;
public class uniqueCharacters {  
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string : ");
		String string=scan.nextLine().toLowerCase();
        boolean isUniqueString = true;

		
        for(int i=0;i<string.length();i++) 
		{	
			if(string.lastIndexOf(string.charAt(i))!=i)
            {   
                isUniqueString=false;
                break;
            }
		}
		if(isUniqueString)
		    System.out.print(string +" have all unique characters"); 
		else
			System.out.print(string +" does not have all unique characters"); 
	}
}

