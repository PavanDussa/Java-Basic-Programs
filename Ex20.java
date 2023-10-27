package BasicQuestions;


import java.util.Scanner;

//      Multiplication table of a number.
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Multiplication table Number : ");
        int num= sc.nextInt();;

        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d : %d\n",num,i,(num*i));
        }
    }
}
