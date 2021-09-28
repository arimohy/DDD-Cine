package co.com.sofka.DDDCine.ticket.commands;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.ticket.values.ClienteId;
import co.com.sofka.domain.generic.Command;

public class actualizarEmailDeCliente extends Command {
    private final ClienteId clienteId;
    private final Email email;

    public actualizarEmailDeCliente(ClienteId clienteId, Email email) {
        this.clienteId = clienteId;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Email getEmail() {
        return email;
    }
}
