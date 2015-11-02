/**
 * Created by ITHILLEL5 on 29.10.2015.
 */
public class MyProgram {
    public static void main(String[] args) {

        double first = 2.4;
        double second = 3.4;
        String  operation = "-";
        switch (operation) {
            case "+":  System.out.println(first+second);
                break;
            case "-":  System.out.println(first-second);
                break;
            case "*":  System.out.println(first*second);
                break;
            case "/":  System.out.println(first/second);
                break;
            default:
                System.out.println("ERRROR");
                break;
        }



    }
}
