package co.com.sofka.DDDCine.ticket;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.ticket.values.VendedorId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Vendedor extends Entity<VendedorId> {
    private Nombre nombre;
    private Email email;

    public Vendedor(VendedorId entityId, Nombre nombre, Email email) {
        super(entityId);
        this.nombre=nombre;
        this.email=email;

    }
    public Nombre nombre(){
        return nombre;
    }
    public Email email(){
        return email;
    }
    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
    public void actualizarEmail(Email email) {
        this.email = Objects.requireNonNull(email);
    }
}
