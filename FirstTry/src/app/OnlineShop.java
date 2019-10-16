package app;

// Soll mal einen Shop repräsentieren in Java :/ 
// Aufgabe fürs Studium :D
public class OnlineShop {
    public static void main(String[] args) throws Exception {
        //Aufg. Frage 4. unter "Main Methode Java"
        Kunde kunde1 = new Kunde();
		kunde1.setName("Lange");
		kunde1.setVorname("Gerd");
		kunde1.setGeburtsdatum("1967-10-23");
		kunde1.setGeschlecht("m");

		Kunde kunde2 = new Kunde();
		kunde2.setName("Koch");
		kunde2.setVorname("Franz");
		kunde2.setGeburtsdatum("1983-04-13");
		kunde2.setGeschlecht("m");

		System.out.println(kunde1.getName());

		kunde1.setName("Mueller");

		System.out.println(kunde1.getName());
		System.out.println(kunde2.getName());

    }
}