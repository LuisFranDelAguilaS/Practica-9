
public class ClaseInicial {
    public static void main(String[] args) {

        LectorCSV lectorCSV = new LectorCSV();
        Alumno alm[] = new Alumno[3];
        CrearArchivo crearArchivo=new CrearArchivo();
        lectorCSV.leerCSV();
        int a = 0;

        for (int i = 0; i < alm.length; i++) {
            alm[i] = new Alumno(CapturaEntrada.capturarCadena("Dame el nombre del alumno"), CapturaEntrada.capturarEntero("Dame la matricula"));
            for (int j = 0; j < 7; j++) {
                alm[i].calificaciones[j] = lectorCSV.calificaciones[a];
                alm[i].promedioC();
                a++;
            }

        }
        for (int i = 0; i < alm.length; i++) {
            alm[i].imprimir();
        }

        crearArchivo.crearArchivo(alm);

    }
}

