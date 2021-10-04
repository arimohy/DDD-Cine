package co.com.sofka.DDDCine.domain.pelicula.commands;


import co.com.sofka.DDDCine.domain.pelicula.values.*;
import co.com.sofka.domain.generic.Command;



public class CrearPelicula extends Command {
    private final PeliculaId peliculaId;
    private final NombrePelicula nombrePelicula;
    private final Idioma idioma;
    private final Duracion duracion;
    private final Resumen resumen;
    public CrearPelicula(PeliculaId entityId, NombrePelicula nombrePelicula, Idioma idioma, Duracion duracion, Resumen resumen){
        this.peliculaId=entityId;
        this.nombrePelicula=nombrePelicula;
        this.idioma=idioma;
        this.duracion=duracion;
        this.resumen=resumen;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public NombrePelicula getNombrePelicula() {
        return nombrePelicula;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Resumen getResumen() {
        return resumen;
    }
}
