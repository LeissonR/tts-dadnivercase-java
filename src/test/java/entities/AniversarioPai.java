package entities;

public class AniversarioPai {
	
	   private String nomePai = "Juscelino Ramos de Almeida";
	   private String profissao = "FazTudo";
	   private String localTrabalho = "Qualquer_Lugar";
	   private String nomeMae = "Lucimar Rodrigues de Almeida";
	   private String nomeIrmao = "Levi Rodrigues de Almeida";
	   private String cidadeNatal = "Óbidos - Pará";
	   private String cidadeAtual = "Manaus";
	   
	   public AniversarioPai() {
	   }

	Pai oMelhorPai = new Pai(nomePai, profissao, localTrabalho, nomeMae, nomeIrmao, cidadeNatal, cidadeAtual);

	public String textoNiver() {
		return oMelhorPai.toString();
	}

}
