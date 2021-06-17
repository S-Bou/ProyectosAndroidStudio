package com.example.mislugares;

public class Principal {
    public static void main(String[] main){
        Lugar lugar1 = new Lugar(
                "Escuela Politécnica Superior de Gandía",
                "C/ Paranif, 1 46730 Gandía (SPAIN)",
                -0.166093, 38.995656, 1000.0,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar1 " + lugar1.toString());
    }
}
