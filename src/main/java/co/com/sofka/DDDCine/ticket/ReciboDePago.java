package co.com.sofka.DDDCine.ticket;

import co.com.sofka.DDDCine.ticket.values.Precio;
import co.com.sofka.DDDCine.ticket.values.ReciboDePagoId;
import co.com.sofka.DDDCine.ticket.values.TipodePago;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ReciboDePago extends Entity<ReciboDePagoId> {
    private TipodePago tipodePago;
    private Precio precio;


    public ReciboDePago(ReciboDePagoId entityId, TipodePago tipodePago, Precio precio) {
        super(entityId);
        this.tipodePago=tipodePago;
        this.precio=precio;

    }
    public TipodePago tipodePago(){
        return tipodePago;
    }
    public Precio precio(){
        return precio;
    }
    public void actualizarTipodePago(TipodePago tipodePago) {
        this.tipodePago = Objects.requireNonNull(tipodePago);
    }
    public void actualizarPrecio(Precio precio) {
        this.precio = Objects.requireNonNull(precio);
    }
}
