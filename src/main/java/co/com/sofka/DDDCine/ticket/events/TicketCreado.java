package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.ticket.Cliente;
import co.com.sofka.DDDCine.ticket.ReciboDePago;
import co.com.sofka.DDDCine.ticket.Vendedor;
import co.com.sofka.domain.generic.DomainEvent;

public class TicketCreado extends DomainEvent {
    private final Vendedor vendedor;
    private final Cliente cliente;
    private final ReciboDePago reciboDePago;
    public TicketCreado(Vendedor vendedor, Cliente cliente, ReciboDePago reciboDePago) {
        super("sofka.ticket.ticketcreado");
        this.vendedor=vendedor;
        this.cliente=cliente;
        this.reciboDePago=reciboDePago;
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
