package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.ticket.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailDeClienteActualizado extends DomainEvent {
    private final  ClienteId clienteId;
    private  final Email email;
    public EmailDeClienteActualizado(ClienteId clienteId, Email email) {
        super("sofka.ticket.emailclienteactualiazado");
        this.clienteId=clienteId;
        this.email=email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Email getEmail() {
        return email;
    }
}
