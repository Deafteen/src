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

        assert fAmount >= 0:"le montant doit etre positif";
        assert fCurrency.equals("EUR") || fCurrency.equals("USD") || fCurrency.equals("CHF")
            || fCurrency.equals("GBP"):"la Currency donnee n est pas autorise";
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }

    public Money add(Money m) {
        assert this.currency().equals(m.currency()) : "erreur avec la methode add (les currency ne sont pas les meme";
        return new Money((this.amount() + m.amount()), fCurrency);
    }

    /**
     * on ajoute de l'argent
     * @param nAmount argent //nAmount negatif possible
     * @param nCurrency precision
     * @return tune finale
     */
    public Money add(int nAmount, String nCurrency) {

        return null;
    }

    //On test si 2 objets de type Money sont egaux
    public boolean equals(Object anObject) {
        if (anObject instanceof Money) {
            Money aMoney= (Money)anObject;
            return aMoney.currency().equals(currency()) && amount() == aMoney.amount();
        }
        return false;
    }
}
