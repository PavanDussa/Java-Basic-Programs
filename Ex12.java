package BasicQuestions;

//      Sum of digits of a number.
public class Ex12 {
    public static void main(String[] args) {
       int n=123,digit;
       int sum=0;
       while (n>0){
           digit=n%10;
           n=n/10;
           sum+=digit;
       }
        System.out.println(sum);
    }
}
