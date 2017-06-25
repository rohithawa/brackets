package au.com.brackets;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Rohitha Wanni Achchige on 28/2/17.
 * braces/brackets/parentheses tester
 */
@RunWith(Parameterized.class)
public class CheckBracketsTest {
    @Parameterized.Parameter
    public String characterString;
    @Parameterized.Parameter(1)
    public Boolean expectedResult;
    private static CheckBrackets checkBrackets;

    @BeforeClass
    public static void init() {
        checkBrackets = new CheckBrackets();
    }

    @Parameterized.Parameters
    public static Collection bracketsCollection() {
        return Arrays.asList(new Object[][]{
                {"{ [ ] ( ) }", true},
                {"{ [ ( ] ) }", false},
                {"{ [ }", false},
                {"}}", false},
                {"}", false},
                {"[", false},
                {"[[", false},
                {"[}", false},
                {"]})", false},
                {"{[(", false},
                {null, true},
                {"", true},
                {"function myFunction(p1, p2) {\n" +
                        "    return p1 * p2;              // The function returns the product of p1 and p2\n" +
                        "}", true},
                {"function myFunction(p1, p2 {\n" +
                        "    return p1 * p2;              // The function returns the product of p1 and p2\n" +
                        "}", false}
        });
    }

    @Test
    public void testIsValid() {
        Assert.assertEquals(expectedResult, checkBrackets.isValid(characterString));
    }
}
