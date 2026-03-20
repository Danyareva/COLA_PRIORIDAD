🎫 Sistema de Atención Prioritaria (Laboratorio Colas)
Descripción del Proyecto
Este proyecto implementa un sistema de gestión de tickets para un centro de soporte técnico desarrollado en Java. El objetivo es administrar solicitudes de clientes de manera eficiente, asegurando que los casos más críticos sean atendidos primero, respetando el orden de llegada en situaciones de igual prioridad.

🛠️ Especificaciones Técnicas
Para garantizar un rendimiento óptimo, el sistema utiliza la estructura de datos PriorityQueue, evitando el ordenamiento manual costoso en cada inserción.

Estructura Principal: java.util.PriorityQueue<Ticket>

Lógica de Ordenamiento: Se implementó un Comparator<Ticket> personalizado que sigue estas reglas:

Prioridad (Descendente): Los tickets con prioridad 5 se atienden antes que los de prioridad 1.

Timestamp (Ascendente): En caso de empate en la prioridad, el sistema selecciona el ticket con el tiempo de registro más antiguo (FIFO).

📋 Requisitos Funcionales
El sistema cuenta con la clase controladora SupportCenter que incluye los siguientes métodos:

addTicket(Ticket t): Registra un nuevo ticket en la cola.

nextTicket(): Visualiza el siguiente ticket a atender sin removerlo.

attendTicket(): Procesa y elimina el ticket con mayor prioridad de la cola.

pendingCount(): Retorna el número de solicitudes en espera.

isEmpty(): Verifica si existen tickets pendientes.
