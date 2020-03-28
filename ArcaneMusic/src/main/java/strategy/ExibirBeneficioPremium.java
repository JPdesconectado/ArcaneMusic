package strategy;

import hook.User;

public class ExibirBeneficioPremium implements ExibirBeneficios{

	public String ExibirBeneficioPacote(User user) {
		if(user.getPacote() == 2) {
			return "Seus benef�cios s�o: Baixar M�sicas, ouvir todas as m�sicas de gra�a, sem anuncio entre as m�sicas.";
		}
		if(user.getPacote() == 3) {
			return "Seus benef�cios s�o: Baixar todas as m�sicas, ouvir as m�sicas de gra�a, nenhum an�ncio ser� exibido entre as m�sicas,"
					+ " usu�rios deste pacote recebem 50% de desconto por estar na faculdade";
		}else {
			return "Exibir An�ncio";
		}
	}

}
