
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahuel E Correa
 * 
 */

@ManagedBean
@SessionScoped

public class usuario {
    
    public String nombre;
    public String contraseña;
    public String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void validarusuario(){
        
       if(nombre.equals("")){
           mensaje = "Ingrese usuario:";
           
       }else if(contraseña.equals("")){
           mensaje = "Ingrese contraseña:";
           
          }else if(nombre.equals("JSF")&&(contraseña.equals("UFG"))){
              
              mensaje = "Usuario válido.";
              
                }else{
              
                    mensaje = "Usuario o contraseña incorrectos";
          }
    }
}
