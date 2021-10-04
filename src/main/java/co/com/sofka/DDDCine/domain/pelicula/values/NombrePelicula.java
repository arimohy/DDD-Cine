package co.com.sofka.DDDCine.domain.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombrePelicula  implements ValueObject<String> {
    private final String value;

    public NombrePelicula(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Nombre de Pelicula no puede estar vacio");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombrePelicula that = (NombrePelicula) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
