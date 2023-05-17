package com.coderhouse.Clase8.model;

import jakarta.persistence.*;

public class Product {
    @Entity
    @Table(name = "productos" )

    public class Producto {


        //Como el id_producto es clave primaria se pone el id y como se va generar automaticamente se utilisa el GenetareValue
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;


        private String descrotion;


        private String code;


        private double price;


        private int stock;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDescrotion() {
            return descrotion;
        }

        public void setDescrotion(String descrotion) {
            this.descrotion = descrotion;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;

        }

        @Override
        public String toString() {
            return "Producto{" +
                    "id=" + id +
                    ", descrotion='" + descrotion + '\'' +
                    ", code='" + code + '\'' +
                    ", price=" + price +
                    ", stock=" + stock +
                    '}';
        }

    }
    }