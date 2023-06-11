package Modelo;

public class PiezaMetalica extends Pieza {
    
    public PiezaMetalica(String descripcion, double peso, int cantidadPiezas) {
        super(descripcion, peso, cantidadPiezas);
    }
    @Override
    public double calcularCosto(double peso){
      return (2.8*peso+56)*cantidad_piezas;  
    }    
}
