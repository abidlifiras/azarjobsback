package com.example.recrutement.domain;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class user {
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        private Long id;

        @Column(name="username",unique = true)
        private String username;

        @NaturalId
        @Column(name="email",unique = true)
        private String email;

        @Column(name="password")
        private String password;

        @Column(name="nom_prenom")
        private String nom_prenom;

        public user(Long id, String username, String email, String password, String nom_prenom) {
                this.id = id;
                this.username = username;
                this.email = email;
                this.password = password;
                this.nom_prenom = nom_prenom;
        }

        public user() {
                super();
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getNom_prenom() {
                return nom_prenom;
        }

        public void setNom_prenom(String nom_prenom) {
                this.nom_prenom = nom_prenom;
        }
}
