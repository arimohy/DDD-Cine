package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.ticket.ReciboDePago;
import co.com.sofka.DDDCine.ticket.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDeReciboDePagoActualizado extends DomainEvent {
    private final ReciboDePago reciboDePago;
    private final Precio precio;
    public PrecioDeReciboDePagoActualizado(ReciboDePago reciboDePago, Precio precio) {
        super("sofka.ticket.precioderecibodepagoActualizado");
        this.reciboDePago=reciboDePago;
        this.precio=precio;
    }

    public ReciboDePago getReciboDePago() {
        return reciboDePago;
    }

    public Precio getPrecio() {
        return precio;
    }
}
