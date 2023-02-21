import java.util.regex.*;
public class question9 {
    public static void main(String[] args) {
        String [] test = {"15.75L", "1.575E1", "1575e-2", "-2.5e-3F", "25E-4", "eeeee3", "q!33"} ;
        for (int i = 0; i<test.length;i++){
            if (Pattern.matches("(-?[0-9]*.?[0-9]+[eE]-?[0-9]*[FflL]?)|(-?[0-9]*.[0-9]+[eE]?-?[0-9]*[FflL]?)", test[i])){
                System.out.println("String " + test[i] + " is a floating point number");
            } else {
                System.out.println("String " + test[i] + " is not a floating point number");
            }
        }
    }
}
