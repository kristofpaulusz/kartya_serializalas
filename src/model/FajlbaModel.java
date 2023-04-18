/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author PauluszKristófCsanád
 */
public class FajlbaModel {
    private ArrayList<Kartya> kartyak = new ArrayList<>();
    public FajlbaModel() {
        
    }

    public void addKartya(Kartya kartya) {
        kartyak.add(kartya);
    }
    public void elmentFajlba() throws IOException {
        FileWriter fw = new FileWriter("text.txt");
        for (Kartya kartya : kartyak) {
            fw.write(kartya.getKerdes()+"\t"+kartya.getValasz()+"\n");
        }
        fw.close();
        
        
    
    };
    
}
