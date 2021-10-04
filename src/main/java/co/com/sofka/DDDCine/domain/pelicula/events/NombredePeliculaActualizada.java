package co.com.sofka.DDDCine.domain.pelicula.events;

import co.com.sofka.DDDCine.domain.pelicula.values.NombrePelicula;
import co.com.sofka.domain.generic.DomainEvent;

public class NombredePeliculaActualizada extends DomainEvent {
    private final NombrePelicula nombrePelicula;
    public NombredePeliculaActualizada(NombrePelicula nombre) {
        super("sofka.pelicula.nombrepeliculaactualizada");
        this.nombrePelicula=nombre;
    }
    public  NombrePelicula getNombrePelicula(){
        return nombrePelicula;
    }
}
