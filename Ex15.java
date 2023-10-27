package BasicQuestions;

//      Roots of a quadratic equation.
public class Ex15 {
    public static void main(String[] args) {
        double a=1,b=5,c=2;
        double d=b*b -4.0 * a * c;

//        d=(b*b)-(4*a*c);
//        r=b/(2*a);

        if (d>0){
            double r1=(-b+Math.pow(d,0.5)) / (2.0*a);
            double r2=(-b-Math.pow(d,0.5)) / (2.0*a);
            System.out.println("The roots are "+r1+" and "+r2);
        } else if (d==0.0) {
            double r1=-b / (2.0*a);
            System.out.println("The root is "+r1);
        }else {
            System.out.println("Roots are not real ");
        }
    }
}
