import java.util.*;
public class removeDuplicates {

    static String duplicatesRemove(String val){
        boolean[] newArr = new boolean[26];
        String str="";

        for(int j=0;j<val.length();j++){
            if(newArr[(val.charAt(j)-'a')]==false){
                str+=val.charAt(j);
                newArr[(val.charAt(j)-'a')]=true;
            }
        }

        return str;

    }


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String val=scan.nextLine().toLowerCase();
        String str=duplicatesRemove(val);
        System.out.println(str);

	}
}


