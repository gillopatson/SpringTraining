package com.example.demotutorial.Model;

import com.example.demotutorial.Rolle.EnumRolle;
import jakarta.persistence.*;

    @Entity
    @Table(name = "roles")
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Enumerated(EnumType.STRING)
        @Column(length = 20)
        private EnumRolle name;

        public Role() {

        }

        public Role(EnumRolle name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public EnumRolle getName() {
            return name;
        }

        public void setName(EnumRolle name) {
            this.name = name;
        }
    }

