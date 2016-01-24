
package tipos;

public enum Especialidad {
    MANA(0,0),
    ENERGIA(0,0),
    VIENTO(0,0),
    FURIA(0,0),
    NADA(0,0);
    
    private double regeneracion;
    private double cantidad;
    
    Especialidad(double regeneracionEnergia, double cantidadEnergia){
        this.cantidad=cantidadEnergia;
        this.regeneracion=regeneracionEnergia;
    }
    public double getRegeneracion(){   return regeneracion;}
    public double getCantidad () {   return cantidad;}
}
