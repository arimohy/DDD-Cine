package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.ticket.values.Precio;
import co.com.sofka.DDDCine.ticket.values.ReciboDePagoId;
import co.com.sofka.DDDCine.ticket.values.TipodePago;
import co.com.sofka.domain.generic.DomainEvent;

public class ReciboDePagoAgregado extends DomainEvent {
    private final ReciboDePagoId reciboDePagoId;
    private final TipodePago tipodePago;
    private final Precio precio;
    public ReciboDePagoAgregado(ReciboDePagoId reciboDePagoId, TipodePago tipodePago, Precio precio) {
        super("sofka.ticket.recibodepagoagregado");
        this.reciboDePagoId=reciboDePagoId;
        this.tipodePago=tipodePago;
        this.precio=precio;
    }

    public ReciboDePagoId getReciboDePagoId() {
        return reciboDePagoId;
    }

    public TipodePago getTipodePago() {
        return tipodePago;
    }

    public Precio getPrecio() {
        return precio;
    }
}
