package aula11.as9b.exercicio04;

public class Logger {
	public static Logger instance = null;
	
	private boolean ativo = false;

	private Logger() {
		this.ativo = true;
	}

	public static Logger getInstance() {
		if (instance == null)
			instance = new Logger();
		return instance;
	}

	public void log(String s) {
		if (this.ativo)
			System.out.println("LOG :: " + s);

	}
}
