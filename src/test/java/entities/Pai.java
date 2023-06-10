package entities;

public class Pai {

	private String nomePai;
	private String profissao;
	private String localTrabalho;
	private String nomeMae;
	private String nomeIrmao;
	private String cidadeNatal;
	private String cidadeAtual;

	public Pai(String nomePai, String profissao, String localTrabalho, String nomeMae, String nomeIrmao,
			String cidadeNatal, String cidadeAtual) {
		super();
		this.nomePai = nomePai;
		this.profissao = profissao;
		this.localTrabalho = localTrabalho;
		this.nomeMae = nomeMae;
		this.nomeIrmao = nomeIrmao;
		this.cidadeNatal = cidadeNatal;
		this.cidadeAtual = cidadeAtual;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nFeliz aniversário, " + nomePai + "!\n");
		sb.append("Desejamos ao senhor um dia cheio de alegria e felicidade.\n");
		sb.append("Nós admiramos muito sua dedicação como pai e " + profissao + " em " + localTrabalho + ".\n");
		sb.append("Seu trabalho como técnico eletrônico foi essencial para tantas pessoas.\n");
		sb.append(
				"Parabéns também pela sua aposentadoria, o senhor merece aproveitar esse tempo para descansar e se divertir.\n");
		sb.append("Que sua vida continue repleta de momentos especiais ao lado de " + nomeMae + ", " + nomeIrmao
				+ " e de toda a família.\n");
		sb.append(
				"O senhor sempre foi um pai maravilhoso, e também meu primeiro professor de informática e programação.\n");
		sb.append("Sou grato por ter o senhor como meu pai e por ter me ensinado tanto.\n");
		sb.append(
				"Desejo que todos os seus sonhos se realizem e que o senhor continue sendo uma inspiração para todos nós.\n");
		sb.append("Que o próximo ano seja repleto de saúde, amor e sucesso para o senhor.\n");
		sb.append("Parabéns novamente pelo seu aniversário!\n");
		sb.append("Com muito amor, sua família de " + cidadeAtual + " & " + cidadeNatal + "!\n");

		return sb.toString();

	}

}
