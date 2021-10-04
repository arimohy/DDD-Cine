package co.com.sofka.DDDCine.domain.pelicula.commands;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.pelicula.values.AutorId;
import co.com.sofka.DDDCine.domain.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreDeAutor extends Command {
    private final PeliculaId peliculaId;
    private final AutorId autorId;
    private final Nombre nombre;

    public actualizarNombreDeAutor(PeliculaId peliculaId, AutorId autorId, Nombre nombre) {
        this.peliculaId = peliculaId;
        this.autorId = autorId;
        this.nombre = nombre;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public AutorId getAutorId() {
        return autorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
