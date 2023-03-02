import java.util.regex.*;
public class question15 {
    public static void main(String[] args) {
        //((b*ab*ab*)*&&(a*ba*ba*)*(a*ba*))(c|d)*|(cbadcbad)*
    String [] test = {"aaabbc", "cbadcbad", "cbad", "aabd", "abbc", "aa"};
    for (int i = 0; i<test.length;i++){
        if(Pattern.matches("((b*ab*ab*)*&&(a*ba*ba*)*(a*ba*))(c|d)*|(cbadcbad)*", test[i])){
            System.out.println(test[1] + " is valid for the regex");
        }else{
            System.out.println(test[i] + " does not match");
        }
    }
    }
    
}
