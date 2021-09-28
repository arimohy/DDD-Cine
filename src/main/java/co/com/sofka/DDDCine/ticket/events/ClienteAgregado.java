package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.ticket.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    public final ClienteId clienteId;
    public final Nombre nombre;
    public final Email email;
    public ClienteAgregado(ClienteId clienteId, Nombre nombre, Email email) {

        super("sofka.ticket.clienteagregado");
        this.clienteId=clienteId;
        this.nombre=nombre;
        this.email=email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
