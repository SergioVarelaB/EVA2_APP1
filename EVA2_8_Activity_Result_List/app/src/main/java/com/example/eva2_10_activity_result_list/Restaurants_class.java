package com.example.eva2_10_activity_result_list;

public class Restaurants_class{
    private int imagen;
        private String nombre;
        private String descripcion;

        public Restaurants_class(){
            imagen = R.drawable.f3;
            nombre = "Golden bridge";
            descripcion = "El infierno";
        }

        public Restaurants_class(int imagen, String nombre, String descripcion) {
            this.imagen = imagen;
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public int getImagen() {
            return imagen;
        }

        public void setImagen(int imagen) {
            this.imagen = imagen;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
}

