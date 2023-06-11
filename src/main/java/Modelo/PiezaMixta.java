package Modelo;

public class PiezaMixta extends Pieza{
    
    public PiezaMixta(String descripcion, double peso, int cantidadPiezas) {
        super(descripcion, peso, cantidadPiezas);
    }
    @Override
    public double calcularCosto(double peso){
       return ((1.3*peso+30)+(2.8*peso+56))*cantidad_piezas;
    }
}
