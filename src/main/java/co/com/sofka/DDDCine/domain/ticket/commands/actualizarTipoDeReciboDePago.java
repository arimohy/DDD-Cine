package co.com.sofka.DDDCine.domain.ticket.commands;

import co.com.sofka.DDDCine.domain.ticket.ReciboDePago;
import co.com.sofka.DDDCine.domain.ticket.values.TipodePago;
import co.com.sofka.domain.generic.Command;

public class actualizarTipoDeReciboDePago extends Command {
    private final ReciboDePago reciboDePago;
    private final TipodePago tipodePago;

    public actualizarTipoDeReciboDePago(ReciboDePago reciboDePago, TipodePago tipodePago) {
        this.reciboDePago = reciboDePago;
        this.tipodePago = tipodePago;
    }

    public ReciboDePago getReciboDePago() {
        return reciboDePago;
    }

    public TipodePago getTipodePago() {
        return tipodePago;
    }
}
