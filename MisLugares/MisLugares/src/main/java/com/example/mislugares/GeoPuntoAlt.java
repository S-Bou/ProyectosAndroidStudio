package com.example.mislugares;

class GeoPuntoAlt extends GeoPunto{
    private double altitud;

    static public GeoPuntoAlt SIN_POSICION = new GeoPuntoAlt(0.0, 0.0, 0.0);

    public GeoPuntoAlt(double longitud, double latitud, double altitud){
        super(longitud, latitud);
        this.altitud = altitud;
    }

    @Override
    public String toString() {
        return new String("longitud:" + getLongitud() +
                                 ", latitud:" + getLatitud() +
                                 ", altitud:" + altitud);

    }

}
