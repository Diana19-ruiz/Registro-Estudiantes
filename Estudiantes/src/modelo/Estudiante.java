package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Estudiante {
  private String nombre;
  private String apellido;
  private String matricula;
  private String correoPersonal;
  private String correoInstitucional;
  private String numCasa;
  private String numCelular;
  private Cuenta cuenta;
  
  public Estudiante() {
    
  }
  
  public Cuenta getCuenta() {
	return cuenta;
  }

  public void setCuenta(Cuenta cuenta) {
	this.cuenta = cuenta;
  }



public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getApellido() {
	return apellido;
  }

  public void setApellido(String apellido) {
	  this.apellido = apellido;
  }


  public String getMatricula() {
    return matricula;
  }
  
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getCorreoPersonal() {
    return correoPersonal;
  }

  public void setCorreoPersonal(String correoPersonal) {
    this.correoPersonal = correoPersonal;
    
  }

  public String getCorreoInstitucional() {
    return correoInstitucional;
  }

  public void setCorreoInstitucional(String correoInstitucional) {
    this.correoInstitucional = correoInstitucional;
  }

  public String getNumCasa() {
    return numCasa;
  }

  public void setNumCasa(String numCasa) {
    this.numCasa = numCasa;
  }

  public String getNumCelular() {
    return numCelular;
  }

  public void setNumCelular(String numCelular) {
    this.numCelular = numCelular;
  }

  
  /*
  public void imprimir() {
    System.out.println("\n\n\t\tNombre -> " + this.nombre);
    System.out.println("\n\n\t\tMatrícula -> " + this.matricula);
    System.out.println("\n\n\t\tCorreo Institucional -> " + this.correoInstitucional);
    System.out.println("\n\n\t\tCorreo Personal -> " + this.correoPersonal);
    System.out.println("\n\n\t\tNúmero Celular -> " + this.numCelular);
    System.out.println("\n\n\t\tNúmero de Casa -> " + this.numCasa);
  }*/
  
}
