import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream fInputS;
        FileOutputStream fOutputS;
        try {
            fInputS = new FileInputStream("/home/dam/IdeaProjects/AD_Ejercicios/copybytestexto/texto1.txt");

            //true para no sobreescribirlo
            fOutputS = new FileOutputStream("/home/dam/IdeaProjects/AD_Ejercicios/copybytestexto/texto2.txt",true);
            int c;
            while ((c = fInputS.read()) != -1) {
                fOutputS.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}