package co.com.sofka.DDDCine.pelicula;

import co.com.sofka.DDDCine.pelicula.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PeliculaChange extends EventChange {
    public PeliculaChange(Pelicula pelicula) {
        apply((PeliculaCreada event)->{
            pelicula.nombrePelicula=event.getNombrePelicula();
            pelicula.actores=new HashSet<>();
            pelicula.generos=new HashSet<>();
            pelicula.autores=new HashSet<>();
            pelicula.idioma=event.getIdioma();
            pelicula.resumen=event.getResumen();
            pelicula.duracion=event.getDuracion();
        });
        apply((NombreDeActorActualizada event)->{
            var actor=pelicula.getActorPorId(event.getActorId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el actor de la pelicula"));
            actor.actualizarNombre(event.getNombre());
        });
        apply((ActorAgregado event)->{
            pelicula.actores.add(new Actor(
                    event.getActorId(),
                    event.getNombre()
            ));
        });
        apply((NombreDeAutorActualizada event)->{
            var autor=pelicula.getAutorPorId(event.getAutorId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el autor de la pelicula"));
            autor.actualizarNombre(event.getNombre());
        });
        apply((AutorAgregado event)->{
            pelicula.autores.add(new Autor(
                    event.getAutorId(),
                    event.getNombre()
            ));
        });
        apply((NombreDeGeneroActualizada event)->{
            var genero=pelicula.getGeneroPorId(event.getGeneroId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el genero de la pelicula"));
            genero.ActualizarGenero(event.getNombreGenero());
        });
        apply((GeneroAgregado event)->{
            pelicula.generos.add(new Genero(
                    event.getGeneroId(),
                    event.getNombreGenero()
            ));
        });
        apply((NombredePeliculaActualizada event)->{
            pelicula.nombrePelicula=event.getNombrePelicula();
        });
        apply((IdiomadePeliculaActualizada event)->{
            pelicula.idioma=event.getIdioma();
        });
        apply((ResumendePeliculaActualizada event)->{
            pelicula.resumen=event.getResumen();
        });
    }
}
