package co.com.sofka.DDDCine.domain.ticket.commands;

import co.com.sofka.DDDCine.domain.ticket.Cliente;
import co.com.sofka.DDDCine.domain.ticket.ReciboDePago;
import co.com.sofka.DDDCine.domain.ticket.Vendedor;
import co.com.sofka.DDDCine.domain.ticket.values.TicketId;
import co.com.sofka.domain.generic.Command;

public class CrearTicket extends Command {
    private final TicketId entityId;
    private final Vendedor vendedor;
    private final Cliente cliente;
    private final ReciboDePago reciboDePago;

    public CrearTicket(TicketId entityId, Vendedor vendedor, Cliente cliente, ReciboDePago reciboDePago) {
        this.entityId = entityId;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.reciboDePago = reciboDePago;
    }

    public TicketId getEntityId() {
        return entityId;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ReciboDePago getReciboDePago() {
        return reciboDePago;
    }
}
