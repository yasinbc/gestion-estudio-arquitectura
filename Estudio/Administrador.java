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
    
    private int numeroUsuarios(){
        return usuarios.size();
    }
    
    public void mostrarUsuarios(){
        if(numeroUsuarios()<1){
            System.out.println("Todavía no hay usuarios Registrados en el sistema");
        }else{
            System.out.println("Lista actual de usuarios: ");   
            for(String index:usuarios){
                System.out.println("ID         Nombre Usuarios");
                System.out.println(usuarios.indexOf(index) +"          "+ index);
            }
        }
    }
    
    public void eliminarUsuario(){
        String opcion;
        int opcionInt;
        
        System.out.println("Usuarios dados de Alta en el sistema: ");
        mostrarUsuarios();
        
        opcion = JOptionPane.showInputDialog("Lista de usuarios en la consola. \nIntroduzca el número del usuario que quiere dar de baja:");
        opcionInt = Integer.parseInt(opcion);//pasa de string a entero para que lo lea la condicion
        
        for(String index:usuarios){
            
        }
        if(opcionInt<0 || opcionInt>numeroUsuarios()-1){
            System.out.println("Tiene que introducir un número de usuario entre 0 y "+(numeroUsuarios()-1));
            System.out.println("Intentelo de nuevo, por favor");
        }else{
            usuarios.remove(opcionInt);
               
            System.out.println("");
            System.out.println("");
            System.out.println("Ha eliminado al usuarío número "+opcion+" con éxito de la lista anterior.");
            if(numeroUsuarios() == 0){
                System.out.println("No hay usuarios registrados en el sistema.");
            }else{
                System.out.println("Lista de suarios restantes en el sistema: ");
                mostrarUsuarios();
            }
        }
        
    }
    
    public void altaUsuario(){
        String opcion; //= JOptionPane.showInputDialog("Opcion dar de ALTA nuevo usuario: ");
        //int opcionGestion = Integer.parseInt(opcion);//pasa de string a entero para que lo lea la condicion
        //System.out.println("Ha elegido altas.");
        opcion = JOptionPane.showInputDialog("Introduzca nombre de usuario a registar: ");
        guardarUsuarios(opcion);
        System.out.println(opcion+" dado de alta en el sistema");
    }
    
    
    
    
}