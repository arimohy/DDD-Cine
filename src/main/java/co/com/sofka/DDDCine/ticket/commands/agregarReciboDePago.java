package co.com.sofka.DDDCine.ticket.commands;

import co.com.sofka.DDDCine.ticket.values.Precio;
import co.com.sofka.DDDCine.ticket.values.ReciboDePagoId;
import co.com.sofka.DDDCine.ticket.values.TipodePago;
import co.com.sofka.domain.generic.Command;

public class agregarReciboDePago  extends Command {
    private final ReciboDePagoId reciboDePagoId;
    private final TipodePago tipodePago;
    private final Precio precio;

    public agregarReciboDePago(ReciboDePagoId reciboDePagoId, TipodePago tipodePago, Precio precio) {
        this.reciboDePagoId = reciboDePagoId;
        this.tipodePago = tipodePago;
        this.precio = precio;
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
