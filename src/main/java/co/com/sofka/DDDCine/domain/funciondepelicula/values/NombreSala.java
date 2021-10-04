package co.com.sofka.DDDCine.domain.funciondepelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreSala implements ValueObject<String> {
    private final String value;
    public NombreSala(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("la nombre de sala no puede estar vacia");
        }
    }
    public String value() {
        return value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreSala that = (NombreSala) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
