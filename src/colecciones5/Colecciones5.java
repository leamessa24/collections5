///Se requiere un programa que lea y guarde países, y para evitar que se ingresen
///repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
///guardará el país en el conjunto y después se le preguntará al usuario si quiere
///guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
///guardados en el conjunto.
///Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
///recordar como se ordena un conjunto.
///Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
///se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
///ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
///se le informará al usuario.
package colecciones5;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Colecciones5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;
        Set<Paises> countries = new HashSet();
        do {
            
            Paises a1 = new Paises();
            a1.crearPais();
            countries.add(a1);
            System.out.println("Desea guardar otro pais o quiere salir?");
        do {
           rta = leer.nextLine();
           if (!((rta.equalsIgnoreCase("SALIR"))||(rta.equalsIgnoreCase("si")))){
               System.out.println("ERROR: INGRESE UNA RESPUESTA VALIDA");
           }
        }while (!((rta.equalsIgnoreCase("SALIR"))||(rta.equalsIgnoreCase("si"))));
        } while (rta.equalsIgnoreCase("si"));
         System.out.println("LISTA DE PAISES");
         countries.forEach((a1) -> {
             System.out.println(a1);
        });
        System.out.println("-----------------------------");
        System.out.println("PAISES EN ORDEN ALFABETICO");
        TreeSet order = new TreeSet();
        order.addAll(countries);
        System.out.println(order);
        
            System.out.println("-------------------------------");
            String eliminar;
            Iterator<Paises> it = countries.iterator();
        System.out.println("ESCRIBA UN PAIS A ELIMINAR:");
        eliminar = leer.nextLine();
        while (it.hasNext()) {
        if (it.next().getNombre().equalsIgnoreCase(eliminar)) {
        it.remove();
            System.out.println("--------------------------------");
        System.out.println("LISTA FINAL DE PAISES, "+ eliminar+ " SE QUEDO AFUERA");
        System.out.println(countries);
        
    }else {
            System.out.println("EL PAIS NO SE ENCUENTRA EN EL CONJUNTO");
        } 
   }
     
 
          
 }
}
   
    
    
   
    
    
   

