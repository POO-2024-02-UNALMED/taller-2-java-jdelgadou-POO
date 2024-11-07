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
    public String verificarIntegridad(Motor m , Auto a, Asiento as){
        if (m.registro!=a.registro || m.registro!=as.registro){
            return "Las piezas no son originales";
        }
        else{
            return "Auto original";
        }
    }
}
