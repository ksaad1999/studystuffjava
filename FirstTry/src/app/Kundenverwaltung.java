package app;

/**
 * Abb 95 Einsatz, Definition und Implementierung eines Interfaces im Online-Shop
 * Usage, Defintion & Implementation of Interfaces in Java / for example in eCommerce Shop
 * @author Karim Saad
 */
public class Kundenverwaltung {
    private String kundenVerwaltungPfad = "";
    private IKundenSpeicher kundenSpeicher;

    public Kundenverwaltung(String pfad){
        this.kundenVerwaltungPfad = pfad;
        this.kundenSpeicher = new DBKundenSpeicher(pfad);
    }

    /**
     * Sets the customer directory path
     * @param pfad
     */
    public void setKundenVerwaltungPfad(String pfad){
        this.kundenVerwaltungPfad = pfad;
        this.kundenSpeicher = new DBKundenSpeicher(pfad);
    }

    /**
     * Returns the customer directory path
     * @return
     */
    public String getKundenVerwaltungPfad(){
        return this.kundenVerwaltungPfad;
    }

    /**
     * Creates a customer
     * @param k
     */
    public void addKunde(Kunde k){
        if(k==null)return;
        try {
            kundenSpeicher.neu(k);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /** Loads a Customer 
     * @param kdNr customerNumber 
    */
    public Kunde getKunde(long kdNr){
        return kundenSpeicher.laden(kdNr);
    }

    /**
     * save Customer
     * Writes content from memory to Storage by object k as Kunde
     */
    public void saveKunde(Kunde k){
        kundenSpeicher.aktualisieren(k);
    }
}