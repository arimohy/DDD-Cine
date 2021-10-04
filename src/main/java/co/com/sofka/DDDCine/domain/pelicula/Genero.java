package co.com.sofka.DDDCine.domain.pelicula;

import co.com.sofka.DDDCine.domain.pelicula.values.GeneroId;
import co.com.sofka.DDDCine.domain.pelicula.values.NombreGenero;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Genero extends Entity<GeneroId> {
    private NombreGenero nombreGenero;
    public Genero(GeneroId entityId,NombreGenero nombreGenero) {
        super(entityId);
        this.nombreGenero=nombreGenero;
    }
    public NombreGenero nombreGenero(){
        return nombreGenero;
    }
    public void ActualizarGenero(NombreGenero nombreGenero){
        this.nombreGenero= Objects.requireNonNull(nombreGenero);
    }
}
