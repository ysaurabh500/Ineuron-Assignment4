//WAP to implement Anagram Checking least inbuilt methods being used.
import java.util.Scanner;

public class anagram {
    static String sortString(String str)
    {
        char[] a=str.toCharArray();
        for(int i=0 ; i< a.length;i++)
        {
            for(int j=i ; j< a.length;j++)
            {
                if(a[i] > a[j])
                {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return new String(a);
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String : ");
        String str1 =sc.nextLine();
		System.out.println("Enter second String : ");
		String str2 =sc.nextLine();
		str1 = sortString(str1.toLowerCase()).trim();
        str2 = sortString(str2.toLowerCase()).trim();
        if(str1.equals(str2))
            System.out.println("String is an Anagram");
        else    
            System.out.println("String is not an Anagram");
	}
}

