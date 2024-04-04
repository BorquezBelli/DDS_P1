package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMaterias(Materia ... materias) {
        Collections.addAll(this.materias,materias);
    }

    public Inscripcion(){
        this.materias = new ArrayList<>();
    }

    public Boolean aprobada() {
        return materias.stream().allMatch(materia->alumno.cumpleCorrelativa(materia));
    }
}
