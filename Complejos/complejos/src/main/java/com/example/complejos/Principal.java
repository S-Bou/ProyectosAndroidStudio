package com.example.complejos;

class Principal {
    public static void main(String[] main) {
        Complejo z, w;

        //z = new ComplejoAmpliado(-1.5, 3.0);
        //w = new ComplejoAmpliado(-1.2, 2.4);

        z = new ComplejoAmpliado(-1.5, 2.0);
        w = new ComplejoAmpliado(-1.2, -2.0);

        z.suma(w);
        System.out.println("Complejo: " + z.toString());
    }
}
