package app;

// Lernzyklus "Kontrollstrukturen" OOP Grundkurs, Abb 27
public class Warenkorb {
    private float anzahlArtikel;
    private float artikelSumme;
    private boolean gutscheinEingeloest;

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