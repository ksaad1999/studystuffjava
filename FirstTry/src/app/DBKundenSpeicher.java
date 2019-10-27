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
    private String dateiPfad="";

    public DBKundenSpeicher(String dateiPfad) {
        this.dateiPfad = dateiPfad;
    }
    /**
     * creates a customer
     * @param k Kunde
     */
    public void neu(Kunde k) {
        // TODO Auto-generated method stub
        aktualisieren(k);
    }

    /**
     * Returns the full path preset with customerID in kundenNr
     * @param kundenNr long
     * @return
     */
    public String getKundePfad(long kundenNr){
        return this.dateiPfad + kundenNr + ".data";
    }

    /**
     * Loads a customer
     * @param kundenNr  long Customer Number
     */
    public Kunde laden(long kundenNr) {
        // TODO Auto-generated method stub
        try {
            String pfad = getKundePfad(kundenNr);
            File datei = new File(pfad);

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

    /**
     * update a customer (writing from memory object to storage)
     * @param k Kunde
     */
    public void aktualisieren(Kunde k) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        try {
            String pfad = getKundePfad(k.getKundenNr());
            File datei = new File(pfad);
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

    /**
     * Deletes a customer
     * @param kundenNr long
     *  */    
    public void loeschen(long kundenNr) {
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