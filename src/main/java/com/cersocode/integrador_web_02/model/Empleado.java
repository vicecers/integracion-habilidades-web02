/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.integrador_web_02.model;

/**
 *
 * @author vicec
 */
public class Empleado {
    public String nombre;
    public float sueldo_por_dia;
    public int dias_trabajados;
    float SueldoTotal;
    public Empleado() {
    }

    public Empleado(String nombre, float sueldo_por_dia, int dias_trabajados) {
        this.nombre = nombre;
        this.sueldo_por_dia = sueldo_por_dia;
        this.dias_trabajados = dias_trabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo_por_dia() {
        return sueldo_por_dia;
    }

    public void setSueldo_por_dia(float sueldo_por_dia) {
        this.sueldo_por_dia = sueldo_por_dia;
    }

    public int getDias_trabajados() {
        return dias_trabajados;
    }

    public void setDias_trabajados(int dias_trabajados) {
        this.dias_trabajados = dias_trabajados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo_por_dia=" + sueldo_por_dia + ", dias_trabajados=" + dias_trabajados + '}';
    }

    public float getSueldoTotal() {
        return SueldoTotal= this.dias_trabajados*this.sueldo_por_dia;
    }

   
    
    
   
    
    
}
