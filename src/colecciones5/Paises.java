
package colecciones5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;


public class Paises implements Comparable<Paises> {
    HashSet<Paises> countries = new HashSet();
    private String nombre;
    
    public void crearPais(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un pais:");
    setNombre(leer.nextLine());
}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.countries);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.countries, other.countries)) {
            return false;
        }
        return true;
    }
    
    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Paises t) {
        return this.nombre.compareToIgnoreCase(t.getNombre());
    }

    
    
}
