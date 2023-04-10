//WAP to find the maximum occurring character in a String.

import java.util.*;
public class maxOccuringChar {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string : ");
		String string=scan.nextLine().toLowerCase();
       
		int MaxOccurance = 0;
        int CharIndex = 0;
        for(int i=0;i<string.length();i++) 
		{	
            int count = 1;
            for(int j=0;j<string.length();j++) 
            {
                if(string.charAt(i) ==string.charAt(j) && i!=j)
                    count++;
            }
            if(count > MaxOccurance)
            {
                MaxOccurance = count;
                CharIndex = i;
            }
		}
		if(MaxOccurance == 1)
		    System.out.print(string +": have all characters with one Occurence."); 
		else
			System.out.print(string +": have character '"+ string.charAt(CharIndex)+"' with maxumum occurance :"+MaxOccurance); 
	}
}

