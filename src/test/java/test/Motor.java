package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    public void cambiarRegistro(int s){
        this.registro = s;
    }
    public void asignarTipo(String s){
        switch (s) {
            case "electrico":
                this.tipo = s;
                break;
            case "gasolina":
                this.tipo=s;
                break;
            default:
                break;
        }
    }
}
