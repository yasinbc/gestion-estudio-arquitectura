import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 * Write a description of class Administrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrador
{
    // instance variables - replace the example below with your own
    public ArrayList<String> usuarios;

    /**
     * Constructor for objects of class Administrador
     */
    public Administrador()
    {
        // initialise instance variables
        usuarios = new ArrayList<String>(); //esto tiene que ser una ArrayList
    }
    
    private void guardarUsuarios(String usuario){
        usuarios.add(usuario);
    }
    
    public int numeroUsuarios(){
        return usuarios.size();
    }
    
    public void mostrarUsuarios(int numeroUsuarios){
        if(numeroUsuarios < 0){
            //no pasa nada en el programa
        }else if(numeroUsuarios < numeroUsuarios()){
            System.out.println(usuarios.get(numeroUsuarios));
        }else{
            //No pasa nada en el programa
        }
    }
    
    public void gestionUsuarios(){

        String opcion = JOptionPane.showInputDialog("Elija opción de gestion de Usuarios: \n1-Altas \n2-Bajas \n3-Modificaciones");
        
        int opcionGestion = Integer.parseInt(opcion);//pasa de string a entero para que lo lea la condicion
        
        //flujo de dato para la gestion de usuarios
        if(opcionGestion == 1){
            System.out.println("Ha elegido altas.");
            opcion = JOptionPane.showInputDialog("Introduzca nombre de usuario a registar: ");           
            
            guardarUsuarios(opcion);
            
            System.out.println(opcion+" dado de alta en el sistema");
            
        }else if(opcionGestion == 2){
            System.out.println("Ha elegido bajas.");
            opcion = JOptionPane.showInputDialog("Introduzca usuario a dar de baja: ");
            String opcionUsuario = opcion;
            
            //usuarios = opcionUsuario;
                
            System.out.println(usuarios+" dado de baja en el sistema");
        }else if(opcionGestion == 3){
            System.out.println("Ha elegido modificaciones.");
            opcion = JOptionPane.showInputDialog("Introduzca usuario a modificar: ");
            String opcionUsuario = opcion;
            
            //usuarios = opcionUsuario;
                
            System.out.println(usuarios + " quiere modificar parametros en el sistema");
        }else{
            System.out.println("Opcion no valida.");
        }
        
    
    }
}