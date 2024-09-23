import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream fInputS;
        FileOutputStream fOutputS;
        try {
            fInputS = new FileInputStream("/home/dam/IdeaProjects/AD_Ejercicios/copybytesimaxe/foto.jpg");

            fOutputS = new FileOutputStream("/home/dam/IdeaProjects/AD_Ejercicios/copybytesimaxe/foto2.jpg", true);
            int c;
            while ((c = fInputS.read()) != -1) {
                fOutputS.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 