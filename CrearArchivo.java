
import java.io.*;


    //crea el archivo en disco, recibe como parámetro la lista de estudiantes
    class  CrearArchivo{
        FileWriter flwriter = null;
        Alumno alm[]=new Alumno[3];

        //int calificaciones [] = new int[7];

        public void crearArchivo(Alumno[] alm){
            try {
                //crea el flujo para escribir en el archivo
                flwriter = new FileWriter("D:\\Users\\Luaguz\\Desktop\\Archivo creado\\Alumnos.txt");
                //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i=0; i<alm.length;i++) {
                    bfwriter.write( "\n Nombre: "+alm[i].nombre + "\n" +"  Matricula: "+alm[i].matricula+"\n"+"Promedio: "+alm[i].promedio+"\n");
                    for (int j=0; j<7;j++) {
                        bfwriter.write("\n"+alm[i].calificaciones[j]);
                    }
                }
                //cierra el buffer intermedio
                bfwriter.close();
                System.out.println("Archivo creado satisfactoriamente..");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (flwriter != null) {
                    try {//cierra el flujo principal
                        flwriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }



