package app;

//Implementierung Abb Auto -> Hersteller "Der Standard-Konstruktur" Aufg 5
public class Auto {
    private Hersteller hersteller;
    private String modell = "";
    private float hubraum = 0f;
    private int anzahlRaeder = 0;
    private int extraTueren = 0;

    public Auto() {
        this.modell = "Ford GTX";
    }

    //Impl. Aufg 11  "Überladen von Konstruktoren"
    public Auto(String modell, float hubraum){
        this.modell = modell;
        this.hubraum = hubraum;
    }

    //Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
    public Auto(Hersteller hersteller, String modell, float hubraum){
        this(modell, hubraum);
        this.hersteller = hersteller;
    }

    //Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
    public Auto(String modell, float hubraum, int anzahlRaeder, int extraTueren) {
        this.modell = modell;
        this.hubraum = hubraum;
        this.anzahlRaeder = anzahlRaeder;
        this.extraTueren = extraTueren;
    }

    //Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
    public Hersteller getHersteller(){
        return this.hersteller;
    }
    public void setHersteller(Hertsteller hst){
        this.hersteller = hst;
    }

    //Ursprüngliche Impl
    public String getModell(){
        return this.modell;
    }

    public float getHubraum(){
        return this.hubraum;
    }

    public int getAnzahlRaeder(){
        return this.anzahlRaeder;
    }

    public int getExtraTueren(){
        return this.extraTueren;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
    
    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }

    public void setAnzahlRaeder(int anzahlRaeder){
        this.anzahlRaeder = anzahlRaeder;
    }
    
    public void setExtraTueren(int extraTueren){
        this.extraTueren = extraTueren;
    }
}