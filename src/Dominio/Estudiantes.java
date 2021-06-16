
package Dominio;


public class Estudiantes {
   
    int notas;
    char genero;
    String estudiante;

    public Estudiantes(int notas, char genero, String estudiante) {
        this.notas = notas;
        this.genero = genero;
        this.estudiante = estudiante;
        
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getNotas() {
        return notas;
    }
    public char getGenero() {
       return genero;
    }
    public String getEstudiante() {
        return estudiante;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "notas=" + notas + ", genero=" + genero + ", estudiante=" + estudiante + '}';
    }
    
}