package com.solar.code.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente  {
    @Id
    
    private Integer id;
    @NotEmpty(message = "no puede estar vacio")
    @Size(min=4,max = 25, message = "El tamaño tiene que estar entre 4 y 25") //tamaño para el campo
    @Column(nullable = false)
    private String nombre;
    @NotEmpty(message = "no puede estar vacio")
    private String apellido;
    @NotEmpty(message = "no puede estar vacio")
    @Email(message = "No es una direccion de correo bien formada")
    @Column(nullable = false, unique = true )
    private String email;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    @PrePersist //con esto se crea automatica la fecha
    public void prePersist(){
        createAt = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    private static final long serialVersionUID = 1L;
}
