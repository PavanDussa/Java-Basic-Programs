package BasicQuestions;


import java.util.Scanner;

//      Print the Fibonacci series up to n terms.
public class Ex9 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibonacci series nth term : ");
        int n=sc.nextInt();

        System.out.print(n1+" "+n2);
        for (int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
