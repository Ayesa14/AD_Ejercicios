import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedInputStream bInputS;
        BufferedOutputStream bOutputS;
        String rutaInicio = "/home/dam/IdeaProjects/AD_Ejercicios/copybytesimaxe2/foto.jpeg";
        String rutaDestino = "/home/dam/IdeaProjects/AD_Ejercicios/copybytesimaxe2/foto2.jpeg";
        try {
            FileInputStream fInputS = new FileInputStream(rutaInicio);
            FileOutputStream fOutputS = new FileOutputStream(rutaDestino);
            bInputS = new BufferedInputStream(fInputS);
            bOutputS = new BufferedOutputStream(fOutputS);
            int c;
            while ((c = bInputS.read()) != -1) {
                bOutputS.write(c);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}