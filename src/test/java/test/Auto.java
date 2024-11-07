package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;
    public int cantidadAsientos(){
        return asientos.length;
    }
    public String verificarIntegridad(){
        if (motor.registro!=registro){
            return "Las piezas no son originales";
        for (Asiento asiento : asientos) {
            if (asiento.registro != registro) {
                return "Las piezas no son originales";
            }
        }
            return "Auto original";
    }
    }
}
