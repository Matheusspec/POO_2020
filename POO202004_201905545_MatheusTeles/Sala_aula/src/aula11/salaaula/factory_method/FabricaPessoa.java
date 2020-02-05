package aula11.salaaula.factory_method;

public class FabricaPessoa extends Fabrica {

	@Override
	public  Pessoa criaPessoa(String nome, String sexo) {
		Pessoa p = null;
		if(sexo.equals("M"))
			p = new Homem(nome);
		else if(sexo.equals("F"))
			p = new Mulher(nome);
		else 
			throw new IllegalArgumentException("Tipo de Pessoa inválido!");
		return p;
	}

}
