package strategy;

import hook.User;

public class ExibirBeneficioPremium implements ExibirBeneficios{

	public String ExibirBeneficioPacote(User user) {
		if(user.getPacote() == 2) {
			return "Seus benefícios são: Baixar Músicas, ouvir todas as músicas de graça, sem anuncio entre as músicas.";
		}
		if(user.getPacote() == 3) {
			return "Seus benefícios são: Baixar todas as músicas, ouvir as músicas de graça, nenhum anúncio será exibido entre as músicas,"
					+ " usuários deste pacote recebem 50% de desconto por estar na faculdade";
		}else {
			return "Exibir Anúncio";
		}
	}

}
