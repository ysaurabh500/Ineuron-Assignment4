//WAP to check if '2552' is palindrome or not.
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str=scan.next();
		boolean isPalindrom = true;
        int n;
        if(str.length()%2==0){
            n=str.length()/2;
        }
        else{
            n=(str.length()+1)/2; 
        }
		for(int i=0,j=str.length()-1 ; i<n;i++,j-- )		
		{
			if(str.charAt(i) != str.charAt(j))
			{
				isPalindrom = false;
				break;
			}	
		}
		if(isPalindrom)		
			System.out.println(str +" :is palindrome");
		else		
			System.out.println(str +" not a palindrome");		
	}

}

