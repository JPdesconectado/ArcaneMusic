package command;

import java.util.Stack;

public class ExecutarComandos {
	private Stack<Comando> curtido;
	private Stack<Comando> descurtido;
	
	public ExecutarComandos() {
		super();
		this.curtido = new Stack<Comando>();
		this.descurtido = new Stack<Comando>();
	}
	
	public String curtir(Comando c) {
		curtido.push(c);
		descurtido.clear();
		return c.curtir();
	}
	
	public String descurtir() {
		if (curtido.isEmpty())
			return "";
		
		Comando c = curtido.pop();
		descurtido.push(c);
		return c.descurtir();
	}
	
	public String recurtir() {
		if (descurtido.isEmpty())
			return "";
		
		Comando c = descurtido.pop();
		curtido.push(c);
		return c.curtir();
		
	}
}
