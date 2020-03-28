package strategy;

import hook.User;

public class ExibirBeneficioComum implements ExibirBeneficios{

	public String ExibirBeneficioPacote(User user) {
		if (user.getPacote() == 1) {
			return "Nenhum Benefício, compra um pacote melhor ae e toma essa propaganda na cara.";
		}else {
			return "Exibindo anúncio";
		}
	}

}
