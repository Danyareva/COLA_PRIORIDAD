
package com.mycompany.main;

import java.util.PriorityQueue;
import java.util.Comparator;

public class SupportCenter {
    private PriorityQueue<Ticket> cola;

    public SupportCenter() {
        
        Comparator<Ticket> comparadorTickets = (t1, t2) -> {
            if (t1.prioridad != t2.prioridad) {
               
                return Integer.compare(t2.prioridad, t1.prioridad);
            }
            
            return Long.compare(t1.timestamp, t2.timestamp);
        };

        this.cola = new PriorityQueue<>(comparadorTickets);
    }

    public void addTicket(Ticket t) {
        cola.add(t);
    }

    public Ticket nextTicket() {
        return cola.peek();
    }

    public Ticket attendTicket() {
        return cola.poll();
    }

    public int pendingCount() {
        return cola.size();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }
}
