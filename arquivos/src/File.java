import java.io.IOException;

public class File {

    /**
     * Comprueba si es un directorio
     * @param path ruta
     */
    private void eDirectorio(String path) {
        java.io.File file = new java.io.File(path);
        if (file.isDirectory()) {
            System.out.println("e un directorio");
        } else {
            System.out.println("non e un directorio");
        }
    }

    /**
     * Comprueba si es un fichero
     * @param path ruta
     */
    private void eFicheiro(String path) {
        java.io.File file = new java.io.File(path);
        if (file.isFile()) {
            System.out.println("e un ficheiro");
        } else {
            System.out.println("non e un ficheiro");
        }
    }

    /**
     * Crea un directorio
     * @param nome del directorio
     */
    private void creaDirectorio(String nome){
        java.io.File file = new java.io.File(nome);
        if (!file.exists()){
            file.mkdir();
            System.out.println("directorio creado");
        } else {
            System.out.println("el directorio ya existe");
        }
    }

    /**
     * Crea un fichero
     * @param dirName
     * @param fileName
     */
    private void creaFicheiro(String dirName, String fileName){
        java.io.File file = new java.io.File(dirName, fileName);
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("fichero creado");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("el fichero ya existe");
        }

    }

    /**
     * Comprueba si se puede escribir y leer en un archivo
     * @param dirName
     * @param fileName
     */
    private void modoAcceso(String dirName, String fileName){
        java.io.File file = new java.io.File(dirName, fileName);
        if (file.canWrite()){
            System.out.println("escritura sí");
        } else {
            System.out.println("escritura non");
        }
        if (file.canRead()){
            System.out.println("lectura sí");
        } else {
            System.out.println("lectura non");
        }
    }

    /**
     * Muestra la longitud en bytes del archivo
     * @param dirName
     * @param fileName
     */
    private void calculaLonxitude(String dirName, String fileName){
        java.io.File file = new java.io.File(dirName, fileName);
        if (file.exists()){
            System.out.println(file.length());
        } else {
            System.out.println("Archivo no existe");
        }
    }

    /**
     * Hace el archivo de solo lectura
     * @param dirName
     * @param fileName
     */
    private void mLectura(String dirName, String fileName){
        java.io.File file = new java.io.File(dirName, fileName);
        if (file.exists()){
            System.out.println(file.setReadOnly());
        } else {
            System.out.println("Archivo no existe");
        }
    }

    /**
     * Hace posible escribir en el archivo
     * @param dirName
     * @param fileName
     */
    private void mEscritura(String dirName, String fileName){
        java.io.File file = new java.io.File(dirName, fileName);
        if (file.exists()){
            System.out.println(file.setWritable(true));
        } else {
            System.out.println("Archivo no existe");
        }
    }

    /**
     * Si el archivo existe, lo elimina
     * @param dirName
     * @param fileName
     */
    private void borraFicheiro(String dirName, String fileName){
        java.io.File file = new java.io.File(dirName, fileName);
        if (file.isFile()){
            System.out.println(file.delete());
        } else {
            System.out.println("Archivo no existe");
        }
    }

    /**
     * Elimina la ruta si existe
     * @param dirName
     */
    private void borraDirectorio(String dirName){
        java.io.File file = new java.io.File(dirName);
        if (file.isDirectory()){
            System.out.println(file.delete());
        } else {
            System.out.println("ruta inexistente ou con descencencia");
        }
    }


    private void mContido(String dirName){
        java.io.File file = new java.io.File(dirName);

    }


    private void recur(File file){

    }

    



}
