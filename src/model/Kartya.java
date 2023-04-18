
package model;

import java.io.Serializable;

public class Kartya implements Serializable {
    String kerdes, valasz;

    public Kartya(String kerdes, String valasz) {
        this.kerdes = kerdes;
        this.valasz = valasz;
    }

    public String getKerdes() {
        return kerdes;
    }

    public String getValasz() {
        return valasz;
    }
}

