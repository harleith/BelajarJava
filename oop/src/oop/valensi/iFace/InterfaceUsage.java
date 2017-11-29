/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.valensi.iFace;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class InterfaceUsage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama = "m";
        
        Vehicle V = new Vehicle();
        Bus b = new Bus();
        Vehicle vb = new Bus();
        Comparable com = new Bus();
        Teloletable bus = new Bus();
        
        b.brake(); // berasal dari class bus
        vb.run(); // method berasal dair supereclass
        bus.frequency(); // method dari interface teloletable
        
        Teloletable truck = new Truck();
    
        if (bus instanceof Teloletable) {
            truck.teloletOm();
        }
        
        ArrayList<Teloletable> tttt = new ArrayList<>();
        
    }
    
    
}
