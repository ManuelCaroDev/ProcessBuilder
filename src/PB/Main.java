package PB;

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

        ProcessBuilder pb = new ProcessBuilder("terminal")

    }
}
