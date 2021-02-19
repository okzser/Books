package me.fabio.livros;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoas[] p = new Pessoas[2];
		Livros[] l = new Livros[3];
		
	 p[0] = new Pessoas("Luan", "M", 14);
	 p[1] = new Pessoas("Luana", "F", 15);
	 
	 l[0] = new Livros("POO para iniciantes", "Pablo Picasso", p[0], 320);
	 l[1] = new Livros("POO para seres humanos", "Ana Picasso", p[1], 500);
	 l[2] = new Livros("Bíblia", "Seguidores de Deus", p[0], 1357);
		
	 l[2].detalhes();
		
		
	}
}
