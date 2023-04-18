package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mentesek {

    ArrayList<Kartya> kartyak = new ArrayList<>();
    public static void main(String[] args) {
//        feltoltes();
        new Mentesek().feladat();
        
//        
//        try {
//            FileOutputStream fOS = new FileOutputStream("allapot.txt");
//            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
//            for (Kartya kartya : kartyak) {
//                oOS.writeObject(kartya);
//            }
//            oOS.close();
//            
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Mentesek.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Mentesek.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private void feladat() {
       feltoltes();
       mentes();
    }
    private void feltoltes() {
        Kartya k1 = new Kartya("Várnai Csata", "1444");
        Kartya k2 = new Kartya("Manzikerti Csata", "1071");
    
        
        kartyak.add(k1);
        kartyak.add(k2);
        
    }

    private void mentes() {
    try {
            FileOutputStream fOS = new FileOutputStream("allapot.txt");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
            for (Kartya kartya : kartyak) {
                oOS.writeObject(kartya);
            }
            oOS.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mentesek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mentesek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}