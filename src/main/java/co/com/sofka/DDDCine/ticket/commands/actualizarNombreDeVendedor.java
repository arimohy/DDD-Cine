package co.com.sofka.DDDCine.ticket.commands;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.ticket.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreDeVendedor extends Command {
    private final VendedorId vendedorId;
    private  final Nombre nombre;

    public actualizarNombreDeVendedor(VendedorId vendedorId, Nombre nombre) {
        this.vendedorId = vendedorId;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
