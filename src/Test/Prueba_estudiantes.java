
package Test;


import Dominio.Estudiantes;
import java.util.Scanner;


public class Prueba_estudiantes {
    static Scanner Datos=new Scanner(System.in);
    public static void main (String[] args){
        //int [] numeros=new int[3];
       
        estudiantes [] Estudiantes;
        int n=3;
        Estudiantes = new estudiantes[n];
       // llenaDatos(estudiante);
        for(int i=0;i<Estudiantes.length;i++){
      //      System.out.println(estudiantes[i].getNotas()+estudiantes[i].getGenero()+estudiantes[i].getEstudiante());
            
        }
        
    }
    public static void llenaDatos(Estudiantes est[]){
       String estudiante;
       int notas;
       char genero;
       for(int i=0;i<est.length;i++){
           System.out.println("Estudiante :");
            estudiante= Datos.nextLine();
            System.out.println("Notas: ");
            notas= Datos.nextInt();
            System.out.println("Promedio: ");
            genero= Datos.nextLine();
            est[i] = new Estudiantes(notas,genero,estudiante);
           .Datos.nextLine();
       } 
       
       
    
    }
}