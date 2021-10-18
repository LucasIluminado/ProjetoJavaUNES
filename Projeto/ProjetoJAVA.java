import java.util.Scanner;

public class ProjetoJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pacientes pac = new Pacientes(null, null, 0, null, null, null, null);
		Medicos med = new Medicos(null, null, 0, 0, null, null);
				
		String nome,sobrenome,cpf,dataNascimento,telefone,gmail;
		int op, ep;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\t##     ## ##    ## ########  ######\r\n"
				+ "\t##     ## ###   ## ##       ##    ##\r\n"
				+ "\t##     ## ####  ## ##       ##\r\n"
				+ "\t##     ## ## ## ## ######    ######\r\n"
				+ "\t##     ## ##  #### ##             ##\r\n"
				+ "\t##     ## ##   ### ##       ##    ##\r\n"
				+ "\t #######  ##    ## ########  ######\r\n");
		
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
		while(cpf.length()!= 11) //Ajustando cpf
		{
			System.out.println("CPF Inv�lido!! \nPor favor digite novamente: ");
			cpf = leia.next();
			pac.setCpf(cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
		}
		pac.setCpf(cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
		System.out.println("Informe a Data de Nascimento (dd/mm/aa): ");
		dataNascimento= leia.next();
		pac.setDataNascimento(dataNascimento);
		System.out.println("Digite seu Telefone: ");
		telefone = leia.next();
		pac.setTelefone(telefone);
		System.out.println("Digite seu email para contato: ");
		gmail = leia.next();
		pac.setGmail(gmail);

		System.out.println("\n****** Cadastro Finalizado! ******\n"
				+ "\nNome: "+pac.getNome()+" "+pac.getSobrenome()
				+ "\nCPF cadastrado: "+pac.getCpf()
				+ "\nData de Nascimento: "+pac.getDataNascimento()
				+ "\nTelefone: "+pac.getTelefone()+
				"\nEmail de Cadastro: "+pac.getGmail());
		
		System.out.println("\n============================================================");
		System.out.println("\n   SEJA BEM VINDE � UNES (Unidade Especializada � Sa�de)!"
				+ " \n\n  Aqui voc� pode encontrar consultas com m�dicos especialistas"
				+ "\ne que prezam,principalmente, pelo atendimento humanizado.");
		System.out.println("\n============================================================");		
		
		
		do 
		{	//Escolha de especilidade
			System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
			pac.menuEspecialidade();
			System.out.println("\nEscolha a especialidade que deseja consultar: ");
			ep = leia.nextInt();
			med.setEspecialidade(ep);
			
			while (ep <1 || ep> 4)
			{
				System.err.println("\nOP��O INV�LIDA!!");
				System.out.println("Por favor, escolha novamente!");
				System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
				pac.menuEspecialidade();
				System.out.println("\nEscolha a especialidade que deseja consultar: ");
				ep = leia.nextInt();
				med.setEspecialidade(ep);
			}
			
				switch(ep)
				{
				//Escolha de Regi�o
				case 1:
					med.menuRegiao();
					op = leia.nextInt();
					med.setRegiao(op);
					med.switchRegiao(op);
					break;
				case 2:
					med.menuRegiao();
					op = leia.nextInt();
					med.setRegiao(op);
					med.switchRegiao(op);
					break;
				case 3:
					med.menuRegiao();
					op = leia.nextInt();
					med.setRegiao(op);
					med.switchRegiao(op);
					break;
				case 4:
					med.menuRegiao();
					op = leia.nextInt();
					med.setRegiao(op);
					med.switchRegiao(op);
					break;
				}
				//Retorno ao MENU
				System.out.println("\n\nDeseja consultar novamente? ");
				System.out.println("1-SIM \t0-N�O");
				ep = leia.nextInt();
			
		}while(ep!=0);
		
		System.out.println("***********************************************************************");
		System.out.println("*                          OBRIGADE!!                                 *");
		System.out.println("***********************************************************************");

	}

}