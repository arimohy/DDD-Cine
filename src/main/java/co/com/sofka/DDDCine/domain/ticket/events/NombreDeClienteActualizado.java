package co.com.sofka.DDDCine.domain.ticket.events;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.ticket.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeClienteActualizado extends DomainEvent {
    private final  ClienteId clienteId;
    private  final Nombre nombre;
    public NombreDeClienteActualizado(ClienteId clienteId, Nombre nombre) {
        super("sofka.ticket.nombredeclienteactualizado");
        this.clienteId=clienteId;
        this.nombre=nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
