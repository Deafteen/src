import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: Marc
 * Date: 12/11/12
 * Time: 09:18
 */
public class MoneyBag {
    private Vector<Money> moneyVector= new Vector<Money>();

    MoneyBag(Money m1, Money m2) {
        moneyVector.add(m1);
        moneyVector.add(m2);
    }

    MoneyBag(Money bag[]) {
        for (Money money : moneyVector) {
            moneyVector.add(money);
        }
    }


}
