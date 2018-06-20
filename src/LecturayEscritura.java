import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LecturayEscritura {
    private FileOutputStream salida;
    private FileInputStream lector;
    private char caracter;
    
    public void Lectura(){
    }
    
    public void leerArchivoByte(){
        try{
            lector = new FileInputStream("ejemplo.txt");
            int valor;
            int contador=0;
            //Ciclo infinito
            while(true){
                valor=lector.read();
                //Stop del ciclo infinito
                if(valor==-1)
                    break; //break hace que termine un ciclo.
                System.out.println("valor "+(++contador)+" = " +valor);
            }
            lector.close();
        }
        catch(IOException e){
            System.out.println("Error de Archivo");
        }
    }
    
    public void escribirArchivoByte(){
        try{
            salida = new FileOutputStream("ejemplo.txt");
            //Se realiza la escritura
            caracter='a';
            salida.write(caracter);
            caracter='b';
            salida.write(caracter);
            
            salida.write('c');
            salida.write('ñ');
            salida.write('¬');
            salida.close();
        }
        catch (IOException e){
            System.out.println("Error de archivo");
        }
    }
}