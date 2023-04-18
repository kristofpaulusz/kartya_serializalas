/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FajlbaModel;
import model.Kartya;
import view.FajlbaView;


public class FajlbaController {
    private FajlbaView fajlbaView;
    private FajlbaModel fajfbaModel;
    public FajlbaController() {
        // model
        fajfbaModel = new FajlbaModel();
        // view
        fajlbaView = new FajlbaView();
        fajlbaView.setVisible(true);
    
        // Listeners
        fajlbaView.listenHozzaad(new HozzaAdListener());
        fajlbaView.listenElfogad(new ElfogadListener());
    }
    public class HozzaAdListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            fajfbaModel.addKartya(fajlbaView.getKartya());
        }
} 
    public class ElfogadListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fajfbaModel.elmentFajlba();
                } catch (IOException ex) {
                    Logger.getLogger(FajlbaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
      
    }}
