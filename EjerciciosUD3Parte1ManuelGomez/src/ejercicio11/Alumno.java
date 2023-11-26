package ejercicio11;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private double notas [];
	private int numSusp;
	private String curso;
	private double notaMedia;
	
	public Alumno(String nombre, double[] notas, int numSusp, String curso, double notaMedia) {
		this.nombre = nombre;
		this.notas = notas;
		this.numSusp = numSusp;
		this.curso = curso;
		this.notaMedia = notaMedia;
	}
	 public Alumno() {
		 
	 }
	public String getNombre() {
		return nombre;
	}
	public double[] getNotas() {
		return notas;
	}
	public int getNumSusp() {
		return numSusp;
	}
	public String getCurso() {
		return curso;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public void setNumSusp(int numSusp) {
		this.numSusp = numSusp;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public String toString() {
		return "GestionNotas [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + ", numSusp=" + numSusp
				+ ", curso=" + curso + ", notaMedia=" + notaMedia + "]";
	}
	 
}
