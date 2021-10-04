package co.com.sofka.DDDCine.domain.ticket.events;

import co.com.sofka.DDDCine.domain.generics.value.Email;
import co.com.sofka.DDDCine.domain.ticket.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailDeVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Email email;
    public EmailDeVendedorActualizado(VendedorId vendedorId, Email email) {
        super("sofka.ticket.eliminarvendedoractualizado");
        this.vendedorId=vendedorId;
        this.email=email;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Email getEmail() {
        return email;
    }
}
