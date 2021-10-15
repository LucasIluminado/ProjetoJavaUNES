public class Paciente extends Cadastro {
	
	private String cpf;
	private int dataNascimento; 
	private String gmail;
	
	public Paciente (String nome, String sobrenome, int regiao, String telefone, String cpf, 
			int dataNascimento, String gmail)
	{
		super (nome, sobrenome, regiao, telefone);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
}