package aula12.as10b.exercicio03;


public class AlarmTest {
	public static void main(String[] args) {
		Seguradora seg = new Seguradora();
		Delegacia del = new Delegacia();
					
		AlarmSystem al = new AlarmSystem();
		
		al.registerObserver(seg);
		al.registerObserver(del);
		
		al.sensorQuarto(true);
		
		del.update(true);
		seg.update(true);
	
		
		
	}
}	
