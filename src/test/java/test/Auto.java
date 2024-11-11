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
        int contador=0;
        for (int i=0; i<asientos.length; ++i) {
            if (asientos[i] instanceof Asiento) {
                contador+=1;
            }}
        return contador;
        }
    public String verificarIntegridad(){
        if (motor.registro!=registro){
            return "Las piezas no son originales";
        }
        for (int i=0; i<asientos.length; ++i) {
            if (asientos[i] instanceof Asiento) {
                if (asientos[i].registro != registro) {
                return "Las piezas no son originales";
            };
            }}
            
        
            return "Auto original";
    
    }
}
