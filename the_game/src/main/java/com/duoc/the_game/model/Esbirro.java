package com.duoc.the_game.model;

public class Esbirro {
    //Atributos
    private int id;
    private String run;
    private String nombre;
    private String nick;
    private int edad;
    private String Disponibilidad;

    //Constructor
    public Esbirro(){}
    public Esbirro(String disponibilidad, int edad, int id, String nick, String nombre, String run) {
        Disponibilidad = disponibilidad;
        this.edad = edad;
        this.id = id;
        this.nick = nick;
        this.nombre = nombre;
        this.run = run;
    }

    //Getter & Setter
    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
}
