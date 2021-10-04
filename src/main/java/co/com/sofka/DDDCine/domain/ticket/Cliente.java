package co.com.sofka.DDDCine.domain.ticket;

import co.com.sofka.DDDCine.domain.generics.value.Email;
import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.ticket.values.ClienteId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {
    private Nombre nombre;
    private Email email;

    public Cliente(ClienteId entityId, Nombre nombre,Email email) {
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
