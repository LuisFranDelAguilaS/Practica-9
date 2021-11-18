import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;


class LectorCSV {

    public int calificaciones[]=new int [21];

    public void leerCSV (){
        //ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("practica9.csv"); //Dentro de la carpeta de la practica9
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosDeLinea = linea.split(",");
                datosDeLinea[0] = String.valueOf(datosDeLinea[0].charAt(1)) + String.valueOf(datosDeLinea[0].charAt(2));
                //ArrayList<String> datosTemporal = new ArrayList<String>();
                for (int i = 0; i < datosDeLinea.length; i++) {
                    calificaciones[i] = Integer.parseInt(datosDeLinea[i]);
                }
                //datos.add(datosTemporal);
            }

        } catch(FileNotFoundException ex){ //En caso de que no se encuentre el archivo aparecera este error pero esto lo captura y permite que el programa termine todos sus procedimientos sin el archivo
            System.out.println("Error Archivo no encontrada, revisa si se encuentra en la unidad correspondiente a la direccion" + ex);

        } catch(IOException e){
            System.out.println("Error" + e);
        }
        //System.out.println(datos);
        }
    }