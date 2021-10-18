public class Pacientes extends Cadastros {
	
	private String cpf;
	private String dataNascimento; 
	private String gmail;
	
	public Pacientes (String nome, String sobrenome, int regiao, String telefone, String cpf, 
			String dataNascimento, String gmail)
	{
		super (nome, sobrenome, regiao, telefone);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.gmail = gmail;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	
	
}