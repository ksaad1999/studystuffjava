package app;

// Soll mal einen Shop repräsentieren in Java :/ 
// Aufgabe fürs Studium :D
public class OnlineShop {
    public static void main(String[] args) throws Exception {
        //Aufg. Abb 21 Frage 3. unter "Main Methode Java"
        Kunde k1 = new Kunde();
        Kunde k2 = new Kunde();

        k1.setName("Lange");
        k1.setVorname("Gerd");

        k2.setName("Koch");
        k2.setVorname("Franz");

        System.out.println(k1.getName());
        k1.setName("Mueller");

        System.out.println(k1.getName());
        System.out.println(k2.getName());

    }
}