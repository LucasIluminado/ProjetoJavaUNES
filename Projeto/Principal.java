import java.security.cert.CertPathChecker;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente pac = new Paciente(null, null, 0, null, null, 0, null);
		Medico med = new Medico(null, null, 0, 0, null, null);
				
		String nome,sobrenome,cpf,dataNascimento,telefone,gmail;
		int op, ep;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("***********************************************************************");
		System.out.println("*                      SEJA BEM VINDE!!                               *");
		System.out.println("***********************************************************************");
		System.out.println("\n----------------- ENTRE COM SEUS DADOS PARA CADASTRO -----------------");
		 
		//Entrada de dados
		System.out.println("\nDigite seu nome social: ");
		nome = leia.next();
		pac.setNome(nome);
		System.out.println("Digite seu sobrenome: ");
		sobrenome = leia.next();
		pac.setSobrenome(sobrenome);
		System.out.println("Informe seu CPF: ");
		cpf = leia.next();
		pac.setCpf(cpf);
		System.out.println("Informe a Data de Nascimento (dd/mm/aa): ");
		dataNascimento= leia.next();
		System.out.println("Digite seu Telefone: ");
		telefone = leia.next();
		System.out.println("Digite seu email para contato: ");
		gmail = leia.next();

		System.out.println("\n****** Cadastro Finalizado! ******\n"
				+ "\nNome: "+pac.getNome()+" "+pac.getSobrenome()
				+ "\nCPF cadastrado: "+pac.getCpf()
				+ "\nData de Nascimento: "+dataNascimento
				+ "\nTelefone: "+telefone+
				"\nEmail de Cadastro: "+gmail);
		
		System.out.println("\n============================================================");
		System.out.println("\n   SEJA BEM VINDE À UNES (Unidade Especializada à Saúde)!"
				+ " \n\n  Aqui você pode encontrar consultas com médicos especialistas"
				+ "\ne que prezam,principalmente, pelo atendimento humanizado.");
		System.out.println("\n============================================================");		
		//Escolha de especilidade
		System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
		pac.menuEspecialidade();
		System.out.println("\nEscolha a especialidade que deseja consultar: ");
		ep = leia.nextInt();
		med.setEspecialidade(ep);
		
		switch(ep)
		{
		case 1:
			med.menuRegiao();
			op = leia.nextInt();
			med.setRegiao(op);
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 2:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 3:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 4:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 5:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 6:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			}
			
		case 2:
			med.menuRegiao();
			op = leia.nextInt();
			med.setRegiao(op);
			
			switch(op) 
			{
			case 1:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 2:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 3:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 4:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 5:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			case 6:
				leia.nextLine();
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();break;
			}
			
			case 3:
				med.menuRegiao();
				op = leia.nextInt();
				med.setRegiao(op);
				
				switch(op)
				{
				case 1:
					leia.nextLine();
					System.out.println("\n\n====    Médicos Disponíveis     ====");
					med.listaMedicos();break;
				case 2:
					leia.nextLine();
					System.out.println("\n\n====    Médicos Disponíveis     ====");
					med.listaMedicos();break;
				case 3:
					leia.nextLine();
					System.out.println("\n\n====    Médicos Disponíveis     ====");
					med.listaMedicos();break;
				case 4:
					leia.nextLine();
					System.out.println("\n\n====    Médicos Disponíveis     ====");
					med.listaMedicos();break;
				case 5:
					leia.nextLine();
					System.out.println("\n\n====    Médicos Disponíveis     ====");
					med.listaMedicos();break;
				case 6:
					leia.nextLine();
					System.out.println("\n\n====    Médicos Disponíveis     ====");
					med.listaMedicos();break;
				}
				
				case 4:
					med.menuRegiao();
					op = leia.nextInt();
					med.setRegiao(op);
					
					switch(op)
					{
					case 1:
						leia.nextLine();
						System.out.println("\n\n====    Médicos Disponíveis     ====");
						med.listaMedicos();break;
					case 2:
						leia.nextLine();
						System.out.println("\n\n====    Médicos Disponíveis     ====");
						med.listaMedicos();break;
					case 3:
						leia.nextLine();
						System.out.println("\n\n====    Médicos Disponíveis     ====");
						med.listaMedicos();break;
					case 4:
						leia.nextLine();
						System.out.println("\n\n====    Médicos Disponíveis     ====");
						med.listaMedicos();break;
					case 5:
						leia.nextLine();
						System.out.println("\n\n====    Médicos Disponíveis     ====");
						med.listaMedicos();break;
					case 6:
						leia.nextLine();
						System.out.println("\n\n====    Médicos Disponíveis     ====");
						med.listaMedicos();break;
					}
		 	
			}
	  
       }

}
	

	



	
	

