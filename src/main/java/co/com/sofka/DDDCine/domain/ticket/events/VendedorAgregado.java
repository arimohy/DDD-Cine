package co.com.sofka.DDDCine.domain.ticket.events;

import co.com.sofka.DDDCine.domain.generics.value.Email;
import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.ticket.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class VendedorAgregado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final Email email;
    public VendedorAgregado(VendedorId vendedorId, Nombre nombre, Email email) {
        super("sofka.ticket.vendedoragregado");
        this.vendedorId=vendedorId;
        this.nombre=nombre;
        this.email=email;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
