package clase04.aula.Colecciones;

import clase02.aula.zoologico.Animal;
import clase02.aula.zoologico.Gallina;
import clase02.aula.zoologico.Tigre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aplicacion {

    public static void main(String[] args) {
        //ejemplo1();
        //ejemploLinkedList();
        //ejemploHashSet();
        //ejemploHashMap();
        ejemploListAnimales();
    }

    public static void ejemploListAnimales() {

        Tigre tigreJorge = new Tigre("Jorge");
        tigreJorge.setNumeroPatas(5);
        Tigre tigrePaco = new Tigre("Paco");
        tigrePaco.setNumeroPatas(3);
        Gallina gallinaMamba = new Gallina("Mamba");
        gallinaMamba.setNumeroPatas(2);
        
        
        //List<Animal> listaAnimales= new ArrayList<Animal>();
        Set<Animal> listaAnimales= new HashSet<Animal>();
        listaAnimales.add(tigrePaco);
        listaAnimales.add(tigreJorge);
        listaAnimales.add(gallinaMamba);
        listaAnimales.add(gallinaMamba);
        
        for(Animal animal:listaAnimales){
            System.out.println("Animal: " + animal.getNombre() + "patas: "+ animal.getNumeroPatas());
        }
       
    }

    public static void ejemploArrayList() {

        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        Estudiante e4 = new Estudiante("Duque", "Ramirez", "Union 456", 100527);
        Estudiante e5 = new Estudiante("Pepe", "Succhero", "Union 456", 100527);

        // ArrayList
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e3);
        listaEstudiantes.add(e4);
        listaEstudiantes.add(e5);

        Collections.sort(listaEstudiantes);

        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }

    }

    public static void ejemploLinkedList() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        // LinkedList
        LinkedList<Estudiante> listadoEstudiantes = new LinkedList<Estudiante>();
        listadoEstudiantes.addLast(e3);
        listadoEstudiantes.addFirst(e1);
        listadoEstudiantes.addFirst(e2);


        for (Estudiante estudiante : listadoEstudiantes) {
            System.out.println(estudiante.getNombres());
        }
        System.out.println(listadoEstudiantes.size());
        /*
         ListIterator<Estudiante> iterador=  listadoEstudiantes.listIterator();
         while (iterador.hasNext()) {
         Estudiante e = (Estudiante) listadoEstudiantes.poll();
         System.out.println(e.getNombres());
         }
         System.out.println(listadoEstudiantes.size());
         * */
    }

    public static void ejemploHashSet() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        // HashSet
        HashSet<Estudiante> setEstudiante = new HashSet<Estudiante>();//version 7

        setEstudiante.add(e1);
        setEstudiante.add(e2);
        setEstudiante.add(e3);
        setEstudiante.add(e1);

        for (Estudiante e : setEstudiante) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }

    }

    public static void ejemploHashMap() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        // HashMap
        HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
        mapa.put(100525, e1);
        mapa.put(100526, e2);
        mapa.put(100527, e3);

        Estudiante e = mapa.get(100526);
        System.out.println(e.getNombres());

        /*
         Collection<Estudiante> co = mapa.values();
         for (Estudiante es : co) {
         System.out.println(es.getNombres());
         }*/

    }
}
