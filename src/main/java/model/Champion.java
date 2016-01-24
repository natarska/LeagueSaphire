package model;

import tipos.Especialidad;

public class Champion {
    private final String name;
    private final String ruta;
    
    private  double vida;  @SuppressWarnings("FieldMayBeFinal")
    private  double regvida;  @SuppressWarnings("FieldMayBeFinal")
    private  double dañoataque;  @SuppressWarnings("FieldMayBeFinal")
    private  double velocataque;  @SuppressWarnings("FieldMayBeFinal")
    private  double resistmag;  @SuppressWarnings("FieldMayBeFinal")
    private  double armadura;  @SuppressWarnings("FieldMayBeFinal")
    private  double velMov;  @SuppressWarnings("FieldMayBeFinal")
    private  Especialidad esp;  @SuppressWarnings("FieldMayBeFinal")

    public Champion(String name, String ruta, double vida, double regvida, double dañoataque, double velocataque, double resistmag, double armadura, double velMov, Especialidad esp) {
        this.name = name;
        this.ruta = ruta;
        this.vida = vida;
        this.regvida = regvida;
        this.dañoataque = dañoataque;
        this.velocataque = velocataque;
        this.resistmag = resistmag;
        this.armadura = armadura;
        this.velMov = velMov;
        this.esp = esp;
    }

    public double getVida() {
        return vida;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }
    public double getRegvida() {
        return regvida;
    }
    public void setRegvida(double regvida) {
        this.regvida = regvida;
    }
    public double getDañoataque() {
        return dañoataque;
    }
    public void setDañoataque(double dañoataque) {
        this.dañoataque = dañoataque;
    }
    public double getVelocataque() {
        return velocataque;
    }
    public void setVelocataque(double velocataque) {
        this.velocataque = velocataque;
    }
    public double getResistmag() {
        return resistmag;
    }
    public void setResistmag(double resistmag) {
        this.resistmag = resistmag;
    }
    public double getArmadura() {
        return armadura;
    }
    public void setArmadura(double armadura) {
        this.armadura = armadura;
    }
    public double getVelMov() {
        return velMov;
    }
    public void setVelMov(double velMov) {
        this.velMov = velMov;
    }
    public Especialidad getEsp() {
        return esp;
    }
    public void setEsp(Especialidad esp) {
        this.esp = esp;
    }
    
    
    
}
