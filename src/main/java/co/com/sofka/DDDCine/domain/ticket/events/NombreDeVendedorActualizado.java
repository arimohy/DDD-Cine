package co.com.sofka.DDDCine.domain.ticket.events;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.ticket.values.VendedorId;
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
