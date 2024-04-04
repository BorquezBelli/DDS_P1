package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativa;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativa = new ArrayList<>();
    }

    public List<Materia> agregarCorrelativa() {
        return correlativa;
    }

    public void setCorrelativa(Materia ... correlativa) {
        Collections.addAll(this.correlativa,correlativa);
    }
}
