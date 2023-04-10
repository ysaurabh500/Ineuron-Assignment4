import java.util.*;
public class printDuplicates {

    static void duplicatesRemove(String val){
        boolean[] newArr = new boolean[26];
        String str="";

        for(int j=0;j<val.length();j++){
            if(newArr[(val.charAt(j)-'a')]==false){
                newArr[(val.charAt(j)-'a')]=true;
            }
            else{
                str+=val.charAt(j);
            }
        }

        if(!str.isBlank())
		{
			System.out.println("Duplicate elements in string are: ");
			System.out.println(str);
		}
		else
			System.out.print("There are no duplicate Characters. ");

   

    }


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String val=scan.nextLine().toLowerCase();
        duplicatesRemove(val);
        }
}
