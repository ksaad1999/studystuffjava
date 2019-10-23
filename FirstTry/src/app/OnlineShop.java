package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// import abstrakt;
import app.abstrakt.AbstraktBuch;
import app.abstrakt.AbstrakterArtikel;

// Soll mal einen Shop repräsentieren in Java :/ 
// Aufgabe fürs Studium :D
public class OnlineShop {
    private static Random randomGenerator = new Random();
    private static HashMap<String,String> ekelhafterWarkenkorb = new HashMap<String, String>();

    /**
     * Generates a random char by randomGenerator
     * @return a random char
     */
    public static char getRandomChar(){
        int numericValue = 	randomGenerator.nextInt(50) + randomGenerator.nextInt(20) + + randomGenerator.nextInt(65);
        System.out.println("Num: " + numericValue);
        return (char) numericValue;
    }

    /** 
     * Bad Hash not for real hashing
     * @params t - String input to hash
     */
    public static String badHash(String t){
        String thash = "";
        int l = t.length();
        l = (int) Math.random() * l;
        for (int i=0; i < t.length()-1; i++) {
            if(i > 0 && i < t.length()-1) {
                thash += t.charAt((t.length()-1) - (i+1));
            } else if (i > 5 && i < t.length()-1) {
                thash += t.charAt((t.length()-1) - (i-2));
            } else {
                thash += t.charAt(i);
            }
        }
        String randomChain = "";
        for (int i=0; i < 4; i++) {
            randomChain += getRandomChar();
        }
        return thash + "_" + randomChain;
    }

    //Impl. 82-84 "Standard Exceptions in Java"
    public static float ZeigeStatistik(int a, int b) throws ArithmeticException
    {
        return a/b;
    }

    // impl 83 throws spezifischere Exception
    public static float EigeneStatistik(int a, int b) throws ArithmeticException {
        try {
            return a/b;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Kuchen");
        }
    }

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
        

        // Aufg 5 unter "Main Methode Java..."
        System.out.println(kunde1.getName());
        System.out.println(kunde1.getGeschlecht());
        System.out.println(kunde1.getGeburtsdatum());
        System.out.println(kunde2.getName());
        System.out.println(kunde2.getGeschlecht());
        System.out.println(kunde2.getGeburtsdatum());

        // Aufgabe 10 unter "Variablen"
        int jahr = 1989;
        float aktienkurs = 462.23f;
        boolean istGeprueft = true;
        String name = "Schulz";


        //Code Beispiel aus Abb. 13 und 25, unter "Operatoren und Ausdrücke"
        int a = 0;
        int b = 0;
        System.out.println((a+b));
        a++;
        System.out.println(a);
        b--;
        System.out.println(b);
        System.out.println((a%b));
        System.out.println((a/b));

        boolean istKundeGleich = kunde1 == kunde2;
        System.out.println(istKundeGleich);

         // Tabelle 15,... bis zu Abb 27 übersprungen aus logischen Gründen


         //Implementierungen aus Abb 34 "Kontrollstrukturen"
         int i=-10;
         do {
             System.out.println(i);
            i++;
         } while (i < 0);

         //Super implementierung Abb 54 Zugriff auf Imp. durch Oberklasse super "Programmierung von Vererbungen in Java"
         Buch buch = new Buch();
         buch.setArtikelnummer("ISBN 0002323255621321321321"); // It's just fun here, not a real implementation, so I can do that ;-)
         buch.setAutor("hi");
         System.out.println(buch.getBeschreibung());

        // Implementierung Abb 60 "Deklaration von Variablen des Typs einer abstrakten Klasse" unter "Abstrakte Klassen" - "Wichtige oo Konzepte"
         AbstrakterArtikel abstrakterArtikel = new AbstraktBuch();
         System.out.println(abstrakterArtikel.getTwitterBeschreibung());
         System.out.println(AbstrakterArtikel.checkArtikelNummer("252")); // Implementierung Abb 65 unter "Statische Methoden u. Attribute"
         System.out.println((abstrakterArtikel instanceof AbstraktBuch)); // Implementierung Abb 63 Verwendung des instaceof-Operators

         //Implementierung Abb Auto -> Hersteller "Der Standard-Konstruktur" Aufg 5
         Hersteller hersteller = new Hersteller();
         System.out.println(hersteller.getName());

         Auto auto = new Auto();
         System.out.println(auto.getModell());

         //Implementierung "Konstruktoren zur Erzeugung von Obj" Aufg 9 "Überladen von Konstruktoren"
         Auto auto2 = new Auto("Mustanananan", 0f, 2, 4);
         String mod = auto2.getModell();
         System.out.println(mod);

        
        // Impl. 82-84 "Standard Exceptions in Java"
        try {
            System.out.println(ZeigeStatistik(1,0));
        } catch (ArithmeticException ex){
            System.out.println("ERROR");
        } finally {
            System.out.println("LOL");
        }


        // impl 83 throws spezifischere Exception
        System.out.println(EigeneStatistik(2,1));

        
        //Impl 68 "Eigene Exceptions"
        try {
            try {
                //int nk = 1/0;
            } catch(Exception ex) {
                throw new TestException("Test");
            }
        } finally {
            
        }

        //impl Aufg 3 "Eigene Exceptions"
        Kunde kn2 = new Kunde();
        kn2.setGeschlecht("m");
        try {
            kn2.getGeschlecht();
        } catch (UngueltigesGeschlecht ex) {
            System.out.println(ex.toString());
        }

        // HashMap imp
        ekelhafterWarkenkorb.put(badHash("test"), "test");
        ekelhafterWarkenkorb.put(badHash("t3est"), "test2");
        System.out.println(ekelhafterWarkenkorb.toString());

        // Reading From File
        String text = FileManager.readTextFromFile("B:/ksaad.sql");
        System.out.println(text);

    }
}