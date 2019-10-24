package app;

/**
 * Implementierung OOP Grundkurs 
 * Article class
 * @author Karim Saad
 */
public class Artikel {
    private String hersteller;
    private String titel;
    private String artikelNummer;

    /**
     * Gets the Manufacturer / Hersteller
     * @return
     */
    public String getHersteller() {
        return this.hersteller;
    }
    
    /**
     * Sets the Hersteller / Manufacturer
     * @param hersteller
     */
    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

    /**
     * Gets the title
     * @return String title
     */
    public String getTitel() {
        return this.titel;
    }

    /**
     * Sets the title
     * @param titel as String
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the articleNumber
     * @return String articleNumber
     */
    public String getArtikelNummer() {
        return this.artikelNummer;
    }

    /**
     * Sets the articleNumber
     * @param artikelNummer
     */
    public void setArtikelNummer(String artikelNummer){
        this.artikelNummer = artikelNummer;
    }

    /**
     * Gets the description
     * @return Description as String
     */
    public String getBeschreibung()
    {
        return this.artikelNummer + ", " + this.hersteller + ", " + titel;
    }
}