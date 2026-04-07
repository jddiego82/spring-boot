package com.ex3.ejercicio5;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaNacimiento;

    public Persona() {}

    // Constructor con parámetros
    public Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    // Método para calcular la edad
    public int getEdad() {
        if (this.fechaNacimiento == null) return 0;
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }
}
