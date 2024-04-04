package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String legajo;
    private List<Materia> materiasAP;
    private String nombre;

    public List<Materia> getMateriasAP() {
        return materiasAP;
    }

    public void agregarMateriasAP(Materia ... materia) { //para agregar varias
        Collections.addAll(this.materiasAP,materia);
    }
    public Alumno(String legajo, String nombre){
        this.legajo=legajo;
        this.nombre=nombre;
        this.materiasAP= new ArrayList<>();
    }
    public Boolean cumpleCorrelativa(Materia materia){
        List<Materia> correlativa = materia.agregarCorrelativa();
        return this.materiasAP.containsAll(correlativa);
    }
}
