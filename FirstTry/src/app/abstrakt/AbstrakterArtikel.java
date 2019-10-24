package app.abstrakt;

/**
 * Implementierung Abb 60 "Deklaration von Variablen des Typs einer abstrakten Klasse" unter "Abstrakte Klassen" - "Wichtige oo Konzepte"
 * @author Karim Saad
 */
public abstract class AbstrakterArtikel {
    public abstract String getTwitterBeschreibung();
    //Implementierung Abb 64 unter "Statische Methoden und Attribute"
    public static boolean checkArtikelNummer(String artikelnummer){
        if(artikelnummer.length() != 25)return false;
        return true;
    }
}