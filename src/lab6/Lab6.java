/*
 Angel Basegoda 13256
 Sergio Cancinos 13062
 
 Lab6.java
 El programa permite la seleccion de implementaci�n de stack (HashSet, Treeset, LinkedHashSet)
 
1. Desarrolladores con experiencia en Java, web y celulares. (Es decir la intersecci�n de los tres conjuntos).
2. Desarrolladores con experiencia en Java pero que no tengan experiencia en web.
3. Desarrolladores con experiencia en Web y Celulares (intersecci�n de Web y Celuares), pero que no tengan experiencia 
en java.
4. Desarrolladores con experiencia en Web o Celulares (uni�n de Web y Celuares), pero que no tengan experiencia en java.
5. Indicar SI o NO el conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web.
6. El conjunto (Java, Web o Celulares) que tenga la cantidad m�s grande de desarrolladores, y los nombres de esos 
desarrolladores.
7. Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en 
orden ascendente.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import  java.util.*;

public class Lab6 {
    
	public static void main(String[] args)
    {
Factory_ implemt = new Factory_();
        Scanner scan = new Scanner(System.in);
        String name;
        int conjunto,opcion;
        boolean subconjunto;
		// SE SELECCIONA EL TIPO DE IMPLEMENTACI�N DE STACK
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la implementaci�n de Stack "
                + "\n1)HashSet"
                + "\n2)TreeSet"
                + "\n3) LinkedHashSet"));
        while (opcion!=1 && opcion !=2 && opcion!=3)
        {
           JOptionPane.showMessageDialog(null, "Usted no ha ingresado una opcion valida");
            opcion=Integer.parseInt(JOptionPane.showInputDialog("�Que tipo de implementaci�n de Stack desea?"
                + "\n1)HashSet"
                + "\n2)TreeSet"
                + "\n3) LinkedHashSet"));         
        }
            
          Set <String> java = implemt.getSET (opcion);
          Set <String> celular = implemt.getSET (opcion);
          Set <String> web = implemt.getSET (opcion);
        
          Set <String> resultado1 = implemt.getSET(opcion);
          Set <String> resultado2 = implemt.getSET(opcion);
          Set <String> resultado3 = implemt.getSET(opcion);
          Set <String> resultado4 = implemt.getSET(opcion);
          Set <String> resultado6 = implemt.getSET(opcion);
         
          
          
       //SE PIDEN LOS DATOS DEL USUARIO
          int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Nombres desea ingresar?"));
          for (int i=0;i<cantidad;i++)
          {
              System.out.println("Ingrese el nombre de la persona");
              name = scan.next();
              System.out.println("Ingrese 1 Si tiene experiencia en Java, Ingreso 2 si no la tiene");
              conjunto = scan.nextInt();
              if(conjunto==1)
              {
                  java.add(name);
              }
               System.out.println("Ingrese 1 Si tiene experiencia en WEB, Ingreso 2 si no la tiene");
               conjunto=scan.nextInt();
               if (conjunto==1)
               {
                   web.add(name);
               }
               System.out.println("Ingrese 1 Si tiene experiencia en CELULAR, Ingreso 2 si no la tiene");
               conjunto=scan.nextInt();
               if (conjunto==1)
               {
                   celular.add(name);
               }
              
              
          }
          
          resultado1.addAll(web);
          resultado1.retainAll(java);
          resultado1.retainAll(celular);
          System.out.println("Interseccion de los tres conjuntos"+resultado1);
          
          
          resultado2.addAll(java);
          resultado2.removeAll(web);
          System.out.println("Trabajadores con experiencia en Java pero no en web:"+resultado2);
          
          
          
          resultado3.addAll(celular);
          resultado3.retainAll(web);
          resultado3.removeAll(java);
          System.out.println("Expereincie en Web y celulares pero no en java:"+ resultado3);
          
          resultado4.addAll(celular);
          resultado4.addAll(celular);
          resultado4.removeAll(web);
          System.out.println("Experiencia en Web o celulares pero no en java:"+resultado4);
          
          subconjunto=java.containsAll(web);
          if(subconjunto==true)
          {
              System.out.println("El conjunto de java no es subconjunto del conjunto web");
          }
          if(subconjunto==false)
          {
              System.out.println("El conjunto de java es subconjunto del conjunto web");
          }
          
          
          if(web.size()>java.size() && web.size()>celular.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el web");
              System.out.println("Sus nombres son:" + web);
              resultado6=web;
          }
        
          if (java.size()>web.size()&& java.size()>celular.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el de Java");
              System.out.println("Sus nombres son:" + java);
              resultado6=java;
          }
          
          if (celular.size()>web.size()&& celular.size()>java.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el de Java");
              System.out.println("Sus nombres son:" + celular);
              resultado6=celular;
          }	
	}
}
