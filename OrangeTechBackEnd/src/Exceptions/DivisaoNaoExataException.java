package Exceptions;

public class DivisaoNaoExataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int numerador;
	private int denominador;
	
	
	
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	
	
	
	public DivisaoNaoExataException(String mensagem, int denominador, int numerador) {
		super(mensagem);
		this.numerador = denominador;
		this.denominador = numerador;
	}
	
	
	
	
	
	
	
}
