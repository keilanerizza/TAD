import java.util.Scanner;

public class Principal {

	static Aluno alunos[] = new Aluno[20];

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe quantos alunos serão inseridos");
		Integer quantosAlunos = scanner.nextInt();
		String qtd = scanner.nextLine();
		for (int j = 0; j < quantosAlunos; j++) {
			alunos[j] = lerAluno();
		}
		imprimirAlunos();
	}

	private static void imprimirAlunos() {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				System.out.println("imprimindo aluno da posição " + i);
				System.out.println("Nome: " + alunos[i].nome);
				System.out.println("RA: " + alunos[i].ra);
				System.out.println("Email: " + alunos[i].email);
				for (int j = 0; j < alunos[i].telefones.length; j++) {
					if (alunos[i].telefones[j] != null) {
						System.out.println("Telefone:");
						System.out.println("Tipo: " + alunos[i].telefones[j].tipo);
						System.out.println("Numero: " + alunos[i].telefones[j].numero);
					}
				}
			}
		}
	}

	private static Aluno lerAluno() {
		Aluno aluno = new Aluno();
		System.out.println("Inserindo novo aluno");
		System.out.println("Digite o R.A.");
		aluno.ra = scanner.nextLine();
		System.out.println("Digite o nome");
		aluno.nome = scanner.nextLine();
		System.out.println("Informe quantos telefones serão informados");
		Integer quantosTelefones = scanner.nextInt();

		for (int i = 0; i < quantosTelefones; i++) {
			aluno.telefones[i] = lerTelefone();
		}
		return aluno;
	}

	private static Telefone lerTelefone() {
		Telefone telefone = new Telefone();
		System.out.println("Digite o tipo do telefone");
		telefone.tipo = scanner.nextLine();
		System.out.println("Digite o número do telefone");
		telefone.numero = scanner.nextLine();
		return telefone;
	}
}
