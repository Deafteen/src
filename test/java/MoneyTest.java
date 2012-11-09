import org.junit.Assert;
import org.junit.Test;

/**
* Created by IntelliJ IDEA.
* User: Marc
* Date: 05/11/12
* Time: 18:00
*/
public class MoneyTest {
    @Test
    public void testAmount() throws Exception {

    }

    @Test
    public void testCurrency() throws Exception {

    }

    public void testEquals() {
        Money m12CHF= new Money(12, "CHF");
        Money m14CHF= new Money(14, "CHF");

        Assert.assertTrue(!m12CHF.equals(null));
        Assert.assertEquals(m12CHF, m12CHF);
        Assert.assertEquals(m12CHF, new Money(12, "CHF")); // (1)
        Assert.assertTrue(!m12CHF.equals(m14CHF));
    }
}
