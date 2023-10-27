package BasicQuestions;

//      Convert temperature from Celsius to Fahrenheit.
//  formula --   F=C * (9/5) + 32;
public class Ex16 {
    public static void main(String[] args) {
        float celsius=37;

        double fahrenheit= celsius * 9/5 + 32;      //BODMAS RULE ( brackets order div multi add sub )

        System.out.println("fahreheint is : "+fahrenheit);
    }
}
