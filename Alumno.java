public class Alumno {

        String nombre;
        int matricula;
        int calificaciones [] = new int[7];
        float promedio;

        public Alumno(String nombre, int matricula){
            setMatricula(matricula);
            setNombre(nombre);

        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    //Metodos

    public float promedioC (){

        promedio = 0;
        for(int i = 0;i<calificaciones.length;i++){
            promedio+=calificaciones[i];
        }
        promedio/=7;

        return promedio;
    }
    public void imprimir(){

        System.out.println("Nombre del alumno:  " + nombre);
        System.out.println("Matrícula:  " + matricula);
        System.out.println("Calificaciones:  ");
        System.out.println("1-"+calificaciones[0]+" 2-"+calificaciones[1]+" 3-"+calificaciones[2]+" 4-"+calificaciones[3]+" 5-"+calificaciones[4]+" 6-"+calificaciones[5]+" 7-"+calificaciones[6] );
        System.out.println("El promedio es : " + promedio);
    }

}



