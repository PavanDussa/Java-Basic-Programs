package BasicQuestions;

import java.util.Scanner;

//      Check if a number is a palindrome.
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= sc.nextInt();
        int temp=num;
        int r,sum=0;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum){
            System.out.println("The given number is Palindrome");
        }else {
            System.out.println("The given number is not Palindrome");
        }

    }
}
