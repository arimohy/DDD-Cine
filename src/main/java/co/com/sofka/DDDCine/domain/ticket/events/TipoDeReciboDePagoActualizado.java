package co.com.sofka.DDDCine.domain.ticket.events;

import co.com.sofka.DDDCine.domain.ticket.ReciboDePago;
import co.com.sofka.DDDCine.domain.ticket.values.TipodePago;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoDeReciboDePagoActualizado extends DomainEvent {
    private final ReciboDePago reciboDePago;
    private final TipodePago tipodePago;
    public TipoDeReciboDePagoActualizado(ReciboDePago reciboDePago, TipodePago tipodePago) {
        super("sofka.ticket.tipoderecibodepagoactualizado");
        this.reciboDePago=reciboDePago;
        this.tipodePago=tipodePago;

    }

    public ReciboDePago getReciboDePago() {
        return reciboDePago;
    }

    public TipodePago getTipodePago() {
        return tipodePago;
    }
}
