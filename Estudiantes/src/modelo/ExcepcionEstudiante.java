package modelo;


public class ExcepcionEstudiante extends Exception {

  private static final long serialVersionUID = 1L;
  
  public ExcepcionEstudiante(String mensaje) {
	  super(mensaje);
  }

}
