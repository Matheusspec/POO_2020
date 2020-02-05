package aula12.salaaula.state;

public interface EstadosPorta {
	
	void abrir(Porta p);
	void fechar(Porta p);
	void trancar(Porta P);
	void destrancar(Porta p );
}
