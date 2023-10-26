package BasicQuestions;

//      Swap two numbers without a temporary variable.
public class Ex4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a+" "+b);

    }
}
