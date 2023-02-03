package Exceptions;

public class ImpossivelAbrirArquivoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String nomeDoArquivo;
	private String diretorio;
	
	
	
	public String getNomeDoArquivo() {
		return nomeDoArquivo;
	}
	public void setNomeDoArquivo(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}
	public String getDiretorio() {
		return diretorio;
	}
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	
	
	public ImpossivelAbrirArquivoException(String nomeDoArquivo, String diretorio) {
		super("O arquivo" + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
		this.nomeDoArquivo = nomeDoArquivo;
		this.diretorio = diretorio;
	}
	
	
	@Override
	public String toString() {
		
		return "ExceptionCostumizado{" +
				"nomeDoArquivo= '" + nomeDoArquivo + "\'" +
				"diretorio='" + diretorio + "\'" + "}";
	}
	
	
	
	
	
	
}
