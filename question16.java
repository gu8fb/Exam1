import java.util.regex.*;
public class question16 {
    public static void main(String[] args) {
        String identifier = "[A-Za-z_$][A-Za-z_$0-9]*";
       String [] test = {"1234class", "var1abl2", "#method"};

       for (int i = 0; i< test.length;i++){
        if (Pattern.matches(identifier, test[i])){
            System.out.println(test[i] + " is a valid class, method, or variable name");
        } else{
            System.out.println(test[i] + " not a valid name");
        }
       }
    }
}
