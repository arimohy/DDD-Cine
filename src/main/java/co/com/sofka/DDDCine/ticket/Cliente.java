package co.com.sofka.DDDCine.ticket;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.values.ActorId;
import co.com.sofka.DDDCine.ticket.values.ClienteId;
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
