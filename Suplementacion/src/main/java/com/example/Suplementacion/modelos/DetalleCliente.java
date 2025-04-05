package com.example.Suplementacion.modelos;
import jakarta.persistence.*;

@Entity
public class DetalleCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String direccion;
    private String telefono;

    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false, unique = true)
    private Cliente cliente;

    public DetalleCliente() {}

    public DetalleCliente(int id, String direccion, String telefono, Cliente cliente) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "DetalleCliente{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
