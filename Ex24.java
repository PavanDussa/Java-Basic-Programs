package BasicQuestions;

import java.util.Scanner;

//      Reverse a string.
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
//        String str="abcde";
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);

    }
}
