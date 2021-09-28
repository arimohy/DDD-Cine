package co.com.sofka.DDDCine.pelicula.events;

import co.com.sofka.DDDCine.pelicula.values.Duracion;
import co.com.sofka.DDDCine.pelicula.values.Idioma;
import co.com.sofka.DDDCine.pelicula.values.NombrePelicula;
import co.com.sofka.DDDCine.pelicula.values.Resumen;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class PeliculaCreada extends DomainEvent {
    private final NombrePelicula nombrePelicula;
    private final Idioma idioma;
    private final Duracion duracion;
    private final Resumen resumen;
    public PeliculaCreada(NombrePelicula nombre, Idioma idioma, Duracion duracion, Resumen resumen) {
        super("sofka.pelicula.peliculacreada");
        this.nombrePelicula=nombre;
        this.idioma=idioma;
        this.duracion=duracion;
        this.resumen=resumen;
    }
    public NombrePelicula getNombrePelicula(){
        return nombrePelicula;
    }
    public Idioma getIdioma(){
        return idioma;
    }
    public Duracion getDuracion(){
        return duracion;
    }
    public Resumen getResumen(){
        return resumen;
    }
}
