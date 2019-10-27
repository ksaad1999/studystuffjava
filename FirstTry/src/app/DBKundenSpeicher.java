package app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Implementation of DBKundenspeicher / DBCUstomerStorage Abb 95 Einsatz,
 * Definition und Implementierung eines Interfaces im Online-Shop
 * 
 * @author Karim Saad
 */
public class DBKundenSpeicher implements IKundenSpeicher {

    public void neu(Kunde k) {
        // TODO Auto-generated method stub
        aktualisieren(k);
    }

    
    public Kunde laden(int kundenNr) {
        // TODO Auto-generated method stub
        try {
            String dateipfad = "kunden/" + kundenNr + ".data";
            File datei = new File(dateipfad);

            FileInputStream fInputStream = new FileInputStream(datei);
            byte[] data = fInputStream.readAllBytes();

            ObjectInputStream objStream = new ObjectInputStream(fInputStream);
            Kunde k = (Kunde) objStream.readObject();
            objStream.close();
            return k;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    
    public void aktualisieren(Kunde k) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        try {
            String dateipfad = "kunden/" + k.getKundenNr() + ".data";
            File datei = new File(dateipfad);

            // Converting to Binary Array
            ByteArrayOutputStream binaryArrayStream = new ByteArrayOutputStream();
            ObjectOutput objStream = new ObjectOutputStream(binaryArrayStream);
            objStream.writeObject(k);
            byte[] binaryArray = binaryArrayStream.toByteArray();
           
            //Continiuing with File
            FileOutputStream dateiStream = new FileOutputStream(datei);
            dateiStream.write(binaryArray); 
            dateiStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    
    public void loeschen(int kundenNr) {
        // TODO Auto-generated method stub
        try {
            String dateipfad = "kunden/" + kundenNr + ".data";
            File datei = new File(dateipfad);
            if(datei.exists())datei.delete();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}