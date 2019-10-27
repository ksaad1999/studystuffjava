package app;

/**
 * Abb 95 Einsatz, Definition und Implementierung eines Interfaces im Online-Shop
 * Usage, Defintion & Implementation of Interfaces in Java / for example in eCommerce Shop
 * @author Karim Saad
 */
public class Kundenverwaltung {
    private IKundenSpeicher kundenSpeicher = new DBKundenSpeicher();

    /**
     * Creates a customer
     * @param k
     */
    public void addKunde(Kunde k){
        if(k==null)return;
        kundenSpeicher.neu(k);
    }
}