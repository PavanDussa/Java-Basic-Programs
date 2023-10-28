package BasicQuestions;

import java.util.Scanner;

//      Check if a string is a palindrome.
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        String str1="";

        for (int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if (str.equals(str1)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
