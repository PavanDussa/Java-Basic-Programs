package BasicQuestions;

//      Reverse a given number.
public class Ex13 {
    public static void main(String[] args) {
        int n=123,digit;
        while (n>0){
            digit=n%10;
            n=n/10;
            System.out.print(digit);
        }
    }
}
