package Modelo;

public class PiezaPlastica extends Pieza{
    
    public PiezaPlastica(String descripcion, double peso, int cantidadPiezas) {
        super(descripcion, peso, cantidadPiezas);
    }
    @Override
    public double calcularCosto(double peso){
        return (1.3*peso+30*cantidad_piezas);
    }
}
