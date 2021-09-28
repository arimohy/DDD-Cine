package co.com.sofka.DDDCine.ticket.commands;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.ticket.values.ClienteId;
import co.com.sofka.domain.generic.Command;

public class agregarCliente extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Email email;

    public agregarCliente(ClienteId clienteId, Nombre nombre, Email email) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.email = email;
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
