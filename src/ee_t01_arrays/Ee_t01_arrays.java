package ee_t01_arrays;
import java.io.*;
import java.util.Scanner;
/**
 *Ee_t01_arrays es una clase que lee un archivo que contiene una lista de numeros
 * que se guardan en un array, tomando en cuenta que el primer numero sera tamaño del arreglo
 * y  los demas numeros se guardaran en el areglo.
 * Una vez creado el arreglo se ordena el mismo de manera descendente.
 * de manera descendente.
 * @author Zuleyka Guzman
 * @version 1.0 4/09/2016
 */
public class Ee_t01_arrays {
    
    private static int array[];//array para guardar los numeros del archivo
    /**
     * En el metodo main se hace uso del try para leer el archivo y guardar los numeros, 
     * el cual se utiliza ya que puede haber una excepcion al momento de leer el archivo.
     * Para guardar los numeros se utilizo un if en el que si el valor leido 
     * era el primer elemento del archivo, se declaraba el tamaño del arreglo y si no(else)
     * se guardaba el elemento en el arreglo.
     * Tambien se utilizaron dos contadores. Uno para llevar la cuenta de los elementos
     * y otro para guardar los elementos correspondientes en el arreglo.
     * Posteriormente se utilizan dos for para recorrer el arreglo, dentro de ellos 
     * se comparan los valores mediante una condicion, si se cumple esta condicion 
     * se inercambian los valores utilizando una variable auxiliar, de esta forma el 
     * arreglo se va ordenando de manera descendente.
     * Y por ultimo se recorre el arreglo utilizando un for y se imprime.
     * @param args Array de Strings. Recibe el nombre del archivo a leer
     */
    public static void main(String[] args) {

        try{
            
            String archivo = args[0];

            File f = new File(archivo);   
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
                
            String linea;
            
            int cont=0;
            int i=0; 
            System.out.println("Elementos del arreglo");
            while(sc.hasNext()){
                
                linea = sc.nextLine();

                int num = Integer.parseInt(linea);
                
               if(cont==0){
                array= new int[num];
                
               } 
               
               else{
                    array[i] = num;
                       
                        System.out.println(array[i]);
                        
                        i++;
                }
               cont++;
               
        }
                fr.close();
                sc.close();
        }
        catch(Exception exc){
             System.out.println(exc.toString());
        }
        
                System.out.println("Impresion del Array en orden descendente");
                
                for(int j=(array.length-1); j>=0; j--){
                    System.out.println(array[j]);
                }
                        
                    }
                }
                