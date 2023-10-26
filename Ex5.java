package BasicQuestions;

//      Find the factorial of a number using a while loop.
public class Ex5 {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        while (n!=0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
