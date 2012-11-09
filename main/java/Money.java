/**
 * Created by IntelliJ IDEA.
 * User: Marc
 * Date: 05/11/12
 * Time: 17:46
 */
public class Money {
    private int fAmount;
    private String fCurrency;

    public Money(int fAmount, String fCurrency) {
        this.fAmount = fAmount;
        this.fCurrency = fCurrency;
    }

    public int amount() {

        return 0;
    }

    public String currency() {

        return null;
    }

    public Money add(Money m) {
        return new Money((this.getfAmount() + m.getfAmount()), fCurrency);
    }

    /**
     * on ajoute de l'argent
     * @param nAmount tune //nAmount negatif possible
     * @param nCurrency precision
     * @return tune finale
     */
    public Money add(int nAmount, String nCurrency) {

        return null;
    }

    public int getfAmount() {
         return fAmount;
     }

     public void setfAmount(int fAmount) {
         this.fAmount = fAmount;
     }

     public String getfCurrency() {
         return fCurrency;
     }

     public void setfCurrency(String fCurrency) {
         this.fCurrency = fCurrency;
     }
}
