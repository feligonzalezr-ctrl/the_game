package com.duoc.the_game.model;

public class Juego {
        //Atributos Juegos
        private String nombre;
        private String codigo;
        private String categoria;
        private String dificultad;
        private int cantidadminimadejugadores;
        private int cantidadmaximadejugadores;
        private int duracionminima;
        private int duracionmaxima;
        private String jugabilidad;
        private String tags;
        private String contenido;

        //Constructor
        public Juego(){}
        public Juego(int cantidadmaximadejugadores, int cantidadminimadejugadores, String categoria, String codigo, String contenido, String dificultad, int duracionmaxima, int duracionminima, String jugabilidad, String nombre, String tags) {
                this.cantidadmaximadejugadores = cantidadmaximadejugadores;
                this.cantidadminimadejugadores = cantidadminimadejugadores;
                this.categoria = categoria;
                this.codigo = codigo;
                this.contenido = contenido;
                this.dificultad = dificultad;
                this.duracionmaxima = duracionmaxima;
                this.duracionminima = duracionminima;
                this.jugabilidad = jugabilidad;
                this.nombre = nombre;
                this.tags = tags;
        }

        //Getter & Setter
        public int getCantidadmaximadejugadores() {
                return cantidadmaximadejugadores;
        }

        public void setCantidadmaximadejugadores(int cantidadmaximadejugadores) {
                this.cantidadmaximadejugadores = cantidadmaximadejugadores;
        }

        public int getCantidadminimadejugadores() {
                return cantidadminimadejugadores;
        }

        public void setCantidadminimadejugadores(int cantidadminimadejugadores) {
                this.cantidadminimadejugadores = cantidadminimadejugadores;
        }

        public String getCategoria() {
                return categoria;
        }

        public void setCategoria(String categoria) {
                this.categoria = categoria;
        }

        public String getCodigo() {
                return codigo;
        }

        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }

        public String getContenido() {
                return contenido;
        }

        public void setContenido(String contenido) {
                this.contenido = contenido;
        }

        public String getDificultad() {
                return dificultad;
        }

        public void setDificultad(String dificultad) {
                this.dificultad = dificultad;
        }

        public int getDuracionmaxima() {
                return duracionmaxima;
        }

        public void setDuracionmaxima(int duracionmaxima) {
                this.duracionmaxima = duracionmaxima;
        }

        public int getDuracionminima() {
                return duracionminima;
        }

        public void setDuracionminima(int duracionminima) {
                this.duracionminima = duracionminima;
        }

        public String getJugabilidad() {
                return jugabilidad;
        }

        public void setJugabilidad(String jugabilidad) {
                this.jugabilidad = jugabilidad;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getTags() {
                return tags;
        }

        public void setTags(String tags) {
                this.tags = tags;
        }
}
