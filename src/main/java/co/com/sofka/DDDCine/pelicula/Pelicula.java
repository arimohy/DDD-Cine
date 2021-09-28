package co.com.sofka.DDDCine.pelicula;

import co.com.sofka.DDDCine.pelicula.values.Duracion;
import co.com.sofka.DDDCine.pelicula.values.Idioma;
import co.com.sofka.DDDCine.pelicula.values.NombrePelicula;
import co.com.sofka.DDDCine.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Pelicula extends AggregateEvent<PeliculaId> {
    public Pelicula(PeliculaId entityId, NombrePelicula nombrePelicula, Duracion duracion, Idioma idioma) {
        super(entityId);
    }
}
