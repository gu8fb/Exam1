import java.util.regex.*;
public class question17 {
    public static void main(String[] args) {
    String cComment = "/\\*.*?\\*/";
    String [] test = {"/*asdfasdfasdfaa/nasdfa432904*/", "asdfawefawef;"
    };
    for (int i = 0; i < test.length; i++){
        if (Pattern.matches(cComment, test[i])){
            System.out.println(i + " is a match");

        } else{
            System.out.println("No match");
        }
    }
    }
}
