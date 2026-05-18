package com.the_game.jugador_service.dto;

public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String email;
    private int nivelExperiencia;
    private int horasDisponibles;
    private String rol;

    public UsuarioDTO() {}

    public UsuarioDTO(Long id, String nombre, String email, int nivelExperiencia, int horasDisponibles, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.nivelExperiencia = nivelExperiencia;
        this.horasDisponibles = horasDisponibles;
        this.rol = rol;
    }

    // getters y setters


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public String getRol() {
        return rol;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}