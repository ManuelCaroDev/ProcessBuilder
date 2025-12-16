package PB_Ejemplo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //ProcessBuilder -> java.lang
        //Sintaxis básica -> ProcessBuilder pb = new ProcessBuilder("comando", "argumento1", "argumento2"...)

        //Process proceso = pb.start();
        /*
         *
         * directory(File dir) -> Cambiar el direcciotio del proceso
         *
         * enviroment() -> Devuelve un Map con las variables del entorno del proceso
         *        *
         * redirecttOutput(File file) -> Redirige la salida estandar a un fichero
         *
         * redirectError(File file) -> Redirige la salida de error a un fichero
         *
         * redirectErrorStream(Boolean redirect) -> Si es true, mezcla salida normal y de error
         *        *
         * star() -> Lanza el proceso
         *
         * getImputStream() -> Captura la salida del proceso
         *
         * getErrorStream() -> Captura los errores
         *
         * getOutputStream() -> Envia datos al proceso
         *
         * waitFor() -> Espera a que el proceso termine
         *
         * exitValue() -> Devuelve el codigo de salida (0=correcto)
         *
         * destroy() -> Mata el proceso
         *
         * */

        /*1. Ejecutar un comando simple */


        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
            Process proceso = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

            String linea = null;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            int exitCode = proceso.waitFor();
            System.out.println("El proceso termino con codigo " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
