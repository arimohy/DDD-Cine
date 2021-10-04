package co.com.sofka.DDDCine.domain.ticket.commands;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.ticket.values.ClienteId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreDeCliente extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public actualizarNombreDeCliente(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
