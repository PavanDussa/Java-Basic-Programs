package BasicQuestions;

//  Largest of three numbers using conditional statements.
public class Ex1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        if(a>b && a>c){
            System.out.println("A is greater");
        } else if (b>a && b>c) {
            System.out.println("B is greater");
        }else {
            System.out.println("C is greater");
        }
    }
}
