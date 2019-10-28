package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DatosEstudiante {

	String nombre="";
	String apellidoP="";
	String apellidoM="";
	String matricula="";
	String correoInstitucional="";
    String correoPersonal="";
    String noCelular="";
    String noCasa="";
	     
	public DatosEstudiante(){
		
	}
	
    public void DatosEstudiantes(){
	
	if((Ventana.textNombre.getText().isEmpty())  || (Ventana.textApellidoP.getText().isEmpty()) || (Ventana.textMatricula.getText().isEmpty()) || (Ventana.textCorreoPer.getText().isEmpty())){
       JOptionPane.showMessageDialog(null, "Ingresa los datos bien por favor");
	 }
	   else{
		  ArrayList <DatosEstudiante> lista= new ArrayList<>();
		  DatosEstudiante ob= new DatosEstudiante();
		 
		  ob.nombre=Ventana.textNombre.getText();
		  ob.apellidoP=Ventana.textApellidoP.getText();
		  ob.apellidoM=Ventana.textApellidoM.getText();
		  ob.matricula=Ventana.textMatricula.getText();
		  ob.correoInstitucional=Ventana.textCorreoIns.getText();
		  JOptionPane.showMessageDialog(null,""+correoInstitucional);
		  ob.correoPersonal=Ventana.textCorreoPer.getText();
		  ob.noCelular=Ventana.textNoCelular.getText();
		  ob.noCasa=Ventana.textNoCasa.getText();
		  lista.add(ob);
		  
		  for(DatosEstudiante a: lista){
			  System.out.println("Nombre:\t\t"+a.nombre);
			  System.out.println("Apellido Paterno:\t\t"+a.apellidoP);
			  System.out.println("Apellido Materno:\t\t"+a.apellidoM);
			  System.out.println("Matricula:\t\t"+a.matricula);
			  System.out.println("Correo Institucional:\t\t"+a.correoInstitucional);
			  System.out.println("Correo Personal:\t\t"+a.correoPersonal);
			  System.out.println("No. Celular:\t\t"+a.noCelular);
			  System.out.println("No.Casa:\t\t	"+a.noCasa);
		  }
	   }
	}
}
