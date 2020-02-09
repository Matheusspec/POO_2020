package aula12.as10b.exercicio02;

public class TestPasta {
	public static void main(String[] args) {

		Arquivo img = new Arquivo("img_da_pastaprincipal", 15.9);
		Arquivo img1 = new Arquivo("photo", 12.3);
		Arquivo pdf = new Arquivo("resume.pdf", 30);
		Arquivo txt = new Arquivo("README.txt",5);
		Arquivo dat = new Arquivo("Exe.dat", 12.8);
		Arquivo mp = new Arquivo("filme.mp4", 34000);
		
		Pastasys Header = new Pastasys("Pasta principal");
		Subpasta doc = new Subpasta("sub-Documents");
		Subpasta arq = new Subpasta("sub-Arquivos");
		Subpasta videos = new Subpasta("sub-Videos");
		
		doc.add(img1);
		doc.add(txt);
		
		arq.add(pdf);
		arq.add(dat);
		
		videos.add(mp);
		
		Header.add(img);
		Header.add(videos);
		Header.add(doc);
		Header.add(arq);
		

		Header.abrir();
	}
}
