package Modelo;

import java.io.Serializable;

public abstract class Pieza implements Serializable{
    
    protected String descripcion;
    protected double peso;
    protected int cantidad_piezas;

    public Pieza(String descripcion, double peso, int cantidadPiezas) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.cantidad_piezas = cantidadPiezas;
    }
    
    public abstract double calcularCosto(double peso);
        
    public String tipo(Pieza p){
        if(p instanceof PiezaMetalica){
            return "Metálica";
        }else if(p instanceof PiezaPlastica){
            return "Plástica";
        }else if(p instanceof PiezaMixta){
            return "Mixta";
        }else{
            return "MAL";
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public int getCantidad_piezas() {
        return cantidad_piezas;
    }
    
}
