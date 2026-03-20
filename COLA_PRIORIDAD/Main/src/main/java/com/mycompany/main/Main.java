
package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        SupportCenter centro = new SupportCenter();

        
        centro.addTicket(new Ticket(1, "Ana", 3, 100, "No puedo iniciar sesion"));
        centro.addTicket(new Ticket(2, "Luis", 5, 120, "Sistema caido"));
        centro.addTicket(new Ticket(3, "Marta", 5, 110, "Error de pagos"));
        centro.addTicket(new Ticket(4, "Pedro", 2, 130, "Consulta general"));
        centro.addTicket(new Ticket(5, "Sofía", 3, 90, "Cambio de contrasena"));

        System.out.println("Atendiendo Tickets");
        while (!centro.isEmpty()) {
            System.out.println(centro.attendTicket());
        }
    }
}
