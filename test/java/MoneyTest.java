import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
* Created by IntelliJ IDEA.
* User: Marc
* Date: 05/11/12
* Time: 18:00
*/
public class MoneyTest {

    //Test pour voir si la fonction add marche.
    @Test
    public void testSimpleAdd() {
        Money m12CHF= new Money(12, "CHF");
        Money m14CHF= new Money(14, "CHF");
        Money expected= new Money(26, "EUR");
        Money result= m12CHF.add(m14CHF);
        assert (expected.amount() == result.amount())  : "erreur avec la methode add";
    }
}
