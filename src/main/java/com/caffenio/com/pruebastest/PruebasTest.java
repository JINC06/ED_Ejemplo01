/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.caffenio.com.pruebastest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author julio.nava
 */
public class PruebasTest {

    public static void main(String[] args) {
        
        //Arreglos LETRAS MAYUSCULAS DEL ABECEDARIO
        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }
        System.out.println(mayusculas);
        System.out.println("---------------------------------------");
        
        //Arreglos Promedio de un listado de valores
        double sumaTotal = 0;
        int calificaciones[] = new int[5];
        calificaciones[0] = 9;
        calificaciones[1] = 8;
        calificaciones[2] = 9;
        calificaciones[3] = 10;
        calificaciones[4] = 7;
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Position: " + i + ", Valor: " + calificaciones[i]);
            sumaTotal += calificaciones[i];
        }
        
        double promedio = (sumaTotal / calificaciones.length);
        System.out.println("Promedio de los datos: " + promedio);
        System.out.println("---------------------------------------");
        
        //ArrayList Java
        ArrayList<String> students = new ArrayList<>();
        students.add("Julio");
        students.add("Jose");
        students.add("Juan");
        students.add("Maria");
        //Lista los elementos en la lista
        System.out.println("ArrayList: " + students);
        
        //Quitar un elemento de la lista
        String firstStudent = students.remove(0);
        System.out.println("ArrayList: " + students);
        System.out.println("Removed Element: " + firstStudent);
        System.out.println("---------------------------------------");
        
        //Acceder a un elemento de la lista
        String studentGet = students.get(0);
        System.out.println("ArrayList: " + students);
        System.out.println("Element at index 0: " + studentGet);
        System.out.println("ArrayList: " + students);
        System.out.println("---------------------------------------");
        
        
        //Modificar elementos de la lista
        System.out.println("ArrayList: " + students);
        students.set(1, "Karla");
        System.out.println("Modified ArrayList: " + students);
        
        System.out.println("---------------------------------------");
        
        //Largo de un arrayList
        System.out.println("List size: " + students.size());
        
        System.out.println("---------------------------------------");
        
        ///Ordenar e iterar a través de un ArrayList
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(20);
        ages.add(54);
        ages.add(17);
        ages.add(9);
        Collections.sort(ages);
        for (int i : ages){
            System.out.println(i);
        }
        
        System.out.println("---------------------------------------");
        
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        Mascota perro = new Mascota();
        perro.setName("Koda");
        perro.setType("Perro");
        perro.setHealthy(true);
        mascotas.add(perro);
        
        Mascota gato = new Mascota();
        gato.setName("Duke");
        gato.setType("Gato");
        gato.setHealthy(false);
        mascotas.add(gato);
        
        for (Mascota m : mascotas) {
            System.out.println(m.toString());
        }
        
        System.out.println("---------------------------------------");
        
    }
}
