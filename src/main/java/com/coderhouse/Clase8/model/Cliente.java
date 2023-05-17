package com.coderhouse.Clase8.model;

import jakarta.persistence.*;


    @Entity
    @Table(name = "clientes")
    public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;

        private String Nombre;


        private String Apellido;


        private Integer celular;


        private Character Direccion;


        private Character CorreoElectronico;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String apellido) {
            Apellido = apellido;
        }

        public Integer getCelular() {
            return celular;
        }

        public void setCelular(Integer celular) {
            this.celular = celular;
        }

        public Character getDireccion() {
            return Direccion;
        }

        public void setDireccion(Character direccion) {
            Direccion = direccion;
        }

        public Character getCorreoElectronico() {
            return CorreoElectronico;
        }

        public void setCorreoElectronico(Character correoElectronico) {
            CorreoElectronico = correoElectronico;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "id=" + id +
                    ", Nombre='" + Nombre + '\'' +
                    ", Apellido='" + Apellido + '\'' +
                    ", celular=" + celular +
                    ", Direccion=" + Direccion +
                    ", CorreoElectronico=" + CorreoElectronico +
                    '}';
        }
    }
