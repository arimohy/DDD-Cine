package co.com.sofka.DDDCine.domain.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreGenero implements ValueObject<String> {
    private final String value;

    public NombreGenero(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Nombre de genero no puede estar vacio");
        }
    }
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreGenero that = (NombreGenero) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
