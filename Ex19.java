package BasicQuestions;


import java.util.Scanner;

//      Find the factorial of a number using a for loop.
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factorial number : ");
        int n=sc.nextInt();
        int fact=1;

        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.printf("The factorial of %d is : %d",n,fact);
    }
}
