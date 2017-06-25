package au.com.brackets;

/**
 * Created by Rohitha Wanni Achchige on 28/2/17.
 *
 */
public class MainApp {
    public static void main(String[] args) {
        // Check brackets
        System.out.println("Check brackets------------------");
        CheckBrackets checkBrackets = new CheckBrackets();
        System.out.println("{ [ ] ( ) } : " + checkBrackets.isValid("{ [ ] ( ) }"));
        System.out.println("{ [ ( ] ) } : " + checkBrackets.isValid("{ [ ( ] ) }"));
        System.out.println("{ [ } : " + checkBrackets.isValid("{ [ }"));
        System.out.println("{ [ } : " + checkBrackets.isValid("{ [ }"));
        System.out.println("");
    }
}
