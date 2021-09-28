package co.com.sofka.DDDCine.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Resumen implements ValueObject<String> {
    private final String value;

    public Resumen(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El resumen no puede estar vacio");
        }
        if (this.value.length()<=10){
            throw new IllegalArgumentException("El resumen debe tener mas de 10 caracteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resumen resumen = (Resumen) o;
        return Objects.equals(value, resumen.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
