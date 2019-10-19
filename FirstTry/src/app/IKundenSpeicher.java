package app;

//Abb 95 Einsatz, Definition und Implementierung eines Interfaces im Online-Shop
public interface IKundenSpeicher  {
    public void neu(Kunde k);
    public Kunde laden(int kundenNr);
    public void aktualisieren(Kunde k);
    public void loeschen(int kundenNr);
}