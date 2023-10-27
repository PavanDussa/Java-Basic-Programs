package BasicQuestions;

//      Check if a year is a leap year or not.
public class Ex18 {
    public static void main(String[] args) {
        int year=2016;

        if(year%4==0){
            System.out.printf("%d is leaf Year",year);
        }else {
            System.out.printf("%d is not leaf year",year);
        }
    }
}
