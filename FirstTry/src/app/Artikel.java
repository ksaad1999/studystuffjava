package app;

public class Artikel {
    public String hersteller;
    public String titel;
    public String artikelnummer;

    public String getHersteller() {
        return this.hersteller;
    }
    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

    public String getTitel() {
        return this.titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getArtikelnummer() {
        return this.artikelnummer;
    }
    public void setArtikelnummer(String artikelnummer){
        this.artikelnummer = artikelnummer;
    }

}