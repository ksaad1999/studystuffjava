package app;

/**
 * Shopping Cart Impl.
 * Lernzyklus "Kontrollstrukturen" OOP Grundkurs, Abb 27
 * @author Karim Saad
 */
public class Warenkorb {
    private float anzahlArtikel;
    private float artikelSumme;
    private boolean gutscheinEingeloest;

    /**
     * Calculates a sum based on business rules by task of the university
     * @param k Kunde customer
     * @return Price as float
     */
    public float berechneSumme(Kunde k){
        if(k.isPremiumkunde()) {
            if(anzahlArtikel > 3){
                return artikelSumme * 0.88f;
            }
            return artikelSumme * 0.9f; // 10% Preisnachlass :o
        }
        //Abb 30
        if(k.hasGutschein()){
            return artikelSumme * 0.95f;
        }
        return artikelSumme;
    }
    
}