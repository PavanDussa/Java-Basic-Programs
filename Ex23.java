package BasicQuestions;


import java.util.Scanner;

//      Count the number of digits in a given number.
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int d,count=0;

        while (n!=0){
//            d=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Number of digits in a given number is : "+count);
    }
}
