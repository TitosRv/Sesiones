package mx.utng.sesion08;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

    //Esto es una inicializacion de valores, para esto se usan las dos llaves {}
    {
        curso = "Programacion Orientada A Objetos";
        sesion = 8;
        objetivo = "Aprender el paradigma orientado a objetos";
    }

    {
        curso = "Como pintar uñas";
        objetivo = "Ganar dinero";
    }

    //Zona de GET
    public String getCurso() {
        return curso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public byte getSesion() {
        return sesion;
    }

    //Zona de SET
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
