package app.abstrakt;


/**
 * Implementation Abb 60 "Deklaration von Variablen des Typs einer abstrakten Klasse" unter "Abstrakte Klassen" - "Wichtige oo Konzepte"
 * @author Karim Saad
 */
public class AbstraktBuch extends AbstrakterArtikel {
    protected String titel;
    protected String autor; 

    // Implementation "Der Standard-Konstruktor" "Konstruktoren und Erzeugung von Obj"
    public AbstraktBuch(){
        this.titel = "Hi";
    }

    /**
     * books description on "Twitter" (title, autor).
     * @return String twitterDescription
     */
    public String getTwitterBeschreibung() {
        return "Buch " +  titel + "  von " + autor;
    }

}