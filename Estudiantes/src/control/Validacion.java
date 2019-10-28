package control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
  
  public Validacion() {
	  
  }

  public Boolean validarMatricula(String matricula){
    //Cadena que representa la expresión regular
	Boolean validar;
    String expresion = "[0-9]{2}[-](00)[1-5][-][0-9]{3}";
    Pattern patron = Pattern.compile(expresion); //Representamos la expresión regular
    Matcher m = patron.matcher(matricula); //Comprueba que el número cumpla con el patron
    System.out.println(""+m);
    //Verificamos que la matrícula cumpla con el patrón
    boolean verificacion = m.matches();
    validar = verificacion && (matricula.length() == 10);
    
    return validar;
    
  }
  
  public Boolean validarCorreoPersonal(String correoPersonal){
    Boolean validar = null;
	  String expresion = "[_a-zA-Z0-9.]+[@]"+"(hotmail|gmail|yahoo|outlook|live)"+"(.com)?(.mx)?";
    Pattern patron = Pattern.compile(expresion);//Representamos la expresión regular
    Matcher m = patron.matcher(correoPersonal);// Comprueba que el correo cumpla con el patron
    validar = m.matches();//Regresa el resultado de la verificación del correo
    
    return validar;
  }
  
  public Boolean validarCorreoInstitucional(String correoInstitucional){
	  Boolean verificar = null;
	  String expresion = "[_a-zA-Z0-9.]+[@]"
              +"(estudiante|alumnos)"
              +"(.uacm)(.edu)(.mx)";
     Pattern patron = Pattern.compile(expresion);//Representamos la expresión regular
     Matcher m = patron.matcher(correoInstitucional);//Comprueba que el correo cumpla con el patron
     verificar = m.matches();// Regresa el resultado de la verificación del correo
     
     return verificar;
  }
  
  public Boolean validarNumCasa(String numCasa) {
	  Boolean verificar = null;
	  String expresion = "(55)[0-9]{8}";
	    Pattern patron = Pattern.compile(expresion);//Representamos el patron
	    Matcher m = patron.matcher(numCasa);//Comprobamos que el numero de casa cumpla con el patron
	    verificar = m.matches();//Regresa el resultado de la verificación del número
	    
	    return verificar;
  }
  
  public Boolean validarNumTel(String numCelular) {
    Boolean verificar = null;
	String expresion = "(55|56)[0-9]{8}";
    Pattern patron = Pattern.compile(expresion);//Representamos la expresión regular
    Matcher m = patron.matcher(numCelular);//Comprobamos que el número cumpla con el patron
    verificar = m.matches();//Regresa el resultado de la verificación del patron
    
    return verificar;
  }
}
