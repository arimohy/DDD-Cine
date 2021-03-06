package co.com.sofka.DDDCine.domain.ticket.commands;

import co.com.sofka.DDDCine.domain.ticket.ReciboDePago;
import co.com.sofka.DDDCine.domain.ticket.values.Precio;
import co.com.sofka.domain.generic.Command;

public class actualizarPrecioDeReciboDePago extends Command {
    private final ReciboDePago reciboDePago;
    private final Precio precio;

    public actualizarPrecioDeReciboDePago(ReciboDePago reciboDePago, Precio precio) {
        this.reciboDePago = reciboDePago;
        this.precio = precio;
    }

    public ReciboDePago getReciboDePago() {
        return reciboDePago;
    }

    public Precio getPrecio() {
        return precio;
    }
}
