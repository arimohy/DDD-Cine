package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.ticket.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;
    public NombreDeVendedorActualizado(VendedorId vendedorId, Nombre nombre) {
        super("sofka.ticket.nombredevendedoractualizado");
        this.vendedorId=vendedorId;
        this.nombre=nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
