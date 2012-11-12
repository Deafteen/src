import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Marc
 * Date: 12/11/12
 * Time: 09:04
 */
public class MoneyTest2 {

    @Test
    public void testSimpleAdd() {
        Money money1= new Money(12, "CHF");
        Money money2= new Money(14, "CHF");
        Money expected= new Money(26, "CHF");
        Money result= money1.add(money2);
        Assert.assertTrue(expected.equals(result));
    }

    @Test
    public void testEquals() {
        Money money1= new Money(12, "CHF");
        Money money2= new Money(14, "CHF");

        Assert.assertTrue(!money1.equals(null));
        Assert.assertEquals(money1, money1);
        Assert.assertEquals(money1, new Money(12, "CHF"));
        Assert.assertTrue(!money1.equals(money2));
    }
}
