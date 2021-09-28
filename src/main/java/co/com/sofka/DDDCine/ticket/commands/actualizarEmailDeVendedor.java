package co.com.sofka.DDDCine.ticket.commands;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.ticket.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public class actualizarEmailDeVendedor extends Command {
    private final VendedorId vendedorId;
    private final Email email;

    public actualizarEmailDeVendedor(VendedorId vendedorId, Email email) {
        this.vendedorId = vendedorId;
        this.email = email;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Email getEmail() {
        return email;
    }
}
