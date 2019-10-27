package app;

/**
 * Interface for customer storage
 * Abb 95 Einsatz, Definition und Implementierung eines Interfaces im Online-Shop
 * @author Karim Saad
 */
public interface IKundenSpeicher  {
    public void neu(Kunde k);
    public Kunde laden(long kundenNr);
    public void aktualisieren(Kunde k);
    public void loeschen(long kundenNr);
}