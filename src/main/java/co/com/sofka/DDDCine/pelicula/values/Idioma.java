package co.com.sofka.DDDCine.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Idioma implements ValueObject<String> {
    private final String value;
    public Idioma(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Idioma no puede estar vacio");
        }
    }
    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idioma idioma = (Idioma) o;
        return Objects.equals(value, idioma.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
