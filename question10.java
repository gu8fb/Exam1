import java.util.regex.*;
public class question10 {
    public static void main(String[] args) {
        String [] test = {"28", "4000000024u", "2000000022l", "024", "04000000024u", "0x2a", "0x4a44000000000020I64", "0x8a44000000000040Ui64", "x2345", "90000eq", "333330-"} ;
        for (int i = 0; i<test.length;i++){
            if (Pattern.matches("[0-9]+x?[0-9A-Fa-f]*[ul]?(I64)?(Ui64)?", test[i])){
                System.out.println("String " + test[i] + " is an integer constant");
            } else {
                System.out.println("String " + test[i] + " is not an integer constant");
            }
        }
    }
}
