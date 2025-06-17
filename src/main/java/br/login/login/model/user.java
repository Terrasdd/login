package br.login.login.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String email;
    
    @NotEmpty
    private String senha;

}
