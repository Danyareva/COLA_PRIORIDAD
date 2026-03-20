
package com.mycompany.main;

public class Ticket {
    int id;
    String cliente;
    int prioridad;
    long timestamp;
    String descripcion;

    public Ticket(int id, String cliente, int prioridad, long timestamp, String descripcion) {
        this.id = id;
        this.cliente = cliente;
        this.prioridad = prioridad;
        this.timestamp = timestamp;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ticket id=" + id + " (prioridad " + prioridad + ", ts " + timestamp + ") - " + descripcion;
    }
}
