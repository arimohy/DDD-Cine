package co.com.sofka.DDDCine.pelicula;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.values.ActorId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Actor extends Entity<ActorId> {
    private Nombre nombre;
    public Actor(ActorId entityId, Nombre nombre) {
        super(entityId);
        this.nombre=nombre;

    }
    public Nombre nombre(){
        return nombre;
    }
    public void actualizarNombre(Nombre nombre){
        this.nombre= Objects.requireNonNull(nombre);
    }
}
