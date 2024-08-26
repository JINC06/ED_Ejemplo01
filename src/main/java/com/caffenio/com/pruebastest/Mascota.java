/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caffenio.com.pruebastest;

/**
 *
 * @author julio.nava
 */
public class Mascota {
    
    //Nombre
    private String name;
    //Tipo de animal
    private String type;
    //Si está saludable o no
    private boolean healthy;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the healthy
     */
    public boolean isHealthy() {
        return healthy;
    }

    /**
     * @param healthy the healthy to set
     */
    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    @Override
    public String toString() {
       String fullName = this.name + "-" + this.type;
       return fullName;
    }
    
    
    
}
