package BasicQuestions;

import java.util.Scanner;

//  Area of a circle based on user input.
//  A=pi*r*r
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float r=sc.nextFloat();

        double area=3.14 * (r*r);
        System.out.println("Area of circle is : "+area);

    }
}
