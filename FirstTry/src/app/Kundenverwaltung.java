package app;

/**
 * Abb 95 Einsatz, Definition und Implementierung eines Interfaces im Online-Shop
 * Usage, Defintion & Implementation of Interfaces in Java / for example in eCommerce Shop
 * @author Karim Saad
 */
public class Kundenverwaltung {
    private Kunde k1;
    private Kunde k2;

    private IKundenSpeicher kundenSpeicher = new DBKundenSpeicher();

    /**
     * Update all customers (k1,k2)
     */
    public void aktualisiereAlleKunden(){
        kundenSpeicher.aktualisieren(k1);
        kundenSpeicher.aktualisieren(k2);
    }
}