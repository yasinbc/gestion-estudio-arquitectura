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
    public ArrayList<String> almacenUsuarios;
    

    /**
     * Constructor for objects of class Administrador
     */
    public Administrador()
    {
        // initialise instance variables
        usuarios = new ArrayList<String>(); //esto tiene que ser una ArrayList
        almacenUsuarios = new ArrayList<String>();
    }
    
    private void guardarUsuarios(String usuario){
        usuarios.add(usuario);
    }
    
    public int numeroUsuarios(){
        return usuarios.size();
    }
    
    public void mostrarUsuarios(){
            for(String index:usuarios){
                System.out.println(usuarios.indexOf(index) +" "+ index);
            }
            //almacenUsuarios.addAll(usuarios);
            //System.out.println(almacenUsuarios);
    }
    
    public void eliminarUsuario(){
        String opcion;
        int opcionInt;
        
        System.out.println("Usuarios dados de Alta en el sistem: ");
        mostrarUsuarios();
        
        opcion = JOptionPane.showInputDialog("Lista de usuarios en la consola. \nIntroduzca el número del usuario que quiere dar de baja:");
        opcionInt = Integer.parseInt(opcion);//pasa de string a entero para que lo lea la condicion
        
        usuarios.remove(opcionInt);
        
        for(String index:usuarios){
            if(opcion == index){
                JOptionPane.showInputDialog("Ha eliminado a "+index+".\nConsulte consola para verificar.");
            }
        }
        
        System.out.println("");
        System.out.println("Usuarios restantes en el sistema");
        mostrarUsuarios();
        /*for(String index:usuarios){
            System.out.println(index);
        }*/
        /*if(indexUsr<0){
            //No pasa nada
        }else if(indexUsr<numeroUsuarios()){
            usuarios.remove(indexUsr);
        }else{
            //No pasa nada
        }*/
    }
    
    public void altaUsuario(){
        String opcion; //= JOptionPane.showInputDialog("Opcion dar de ALTA nuevo usuario: ");
        //int opcionGestion = Integer.parseInt(opcion);//pasa de string a entero para que lo lea la condicion
        //System.out.println("Ha elegido altas.");
        opcion = JOptionPane.showInputDialog("Introduzca nombre de usuario a registar: ");
        guardarUsuarios(opcion);
        System.out.println(opcion+" dado de alta en el sistema");
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
            mostrarUsuarios();
            System.out.println("Ha elegido bajas. \nCual de los usuarios que se muestran \nen consola quiere dar de baja?");
            opcion = JOptionPane.showInputDialog("IMPORTANTE: Usuarios impresos en consola. \nIntroduzca usuario a dar de baja: ");
            
            usuarios.remove(opcion);
           
            /*for(int i=0; i<usuarios.size(); i++){
                if(usuarios[i] == opcion){
                    usuarios[i].remove();
                }
            }*/
                
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