package app;

//Abb 95 Einsatz, Definition und Implementierung eines Interfaces im Online-Shop
public class Kundenverwaltung {
    private Kunde k1;
    private Kunde k2;

    private IKundenSpeicher kundenSpeicher = new DBKundenSpeicher();

    public void aktualisiereAlleKunden(){
        kundenSpeicher.aktualisieren(k1);
        kundenSpeicher.aktualisieren(k2);
    }
}