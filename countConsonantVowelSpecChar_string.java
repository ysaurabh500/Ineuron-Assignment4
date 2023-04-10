// WAP to count the number of consonants, vowels, special characters in a String.
import java.util.Scanner;
public class  countConsonantVowelSpecChar_string{
    public static void main(String[] args) {
		
		System.out.println("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		int consonents=0,vowels=0,spec_char=0;
		String str=sc.nextLine().toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i); 
			if(ch>='a'&& ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowels++;
				else
					consonents++;				
			}
            else if (ch>='0'&&ch<='9') {
                continue;
                
            }
			else
				spec_char++;
		}
		System.out.println("Number of consonents: "+consonents);
		System.out.println("Number of vowels: "+vowels);
		System.out.println("Number of special characters: "+spec_char);

	}
}

