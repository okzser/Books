package me.fabio.livros;

public class Livros implements Publicacao{
		
	    private String titulo;
		private String autor;
		private Pessoas leitor;
		private boolean aberto;
		private int totPaginas;
		private int pagAtual;

	public void detalhes() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Leitor: " + this.leitor.getNome());
        if (this.aberto) {
        	System.out.println("Aberto: Sim");
        } else {
            System.out.println("Aberto: Não");
        }
		System.out.println("Total de páginas: " + this.totPaginas);
		System.out.println("Página atual: " + this.pagAtual);
	}
	
	public Livros(String titulo,String autor,Pessoas leitor,int totPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;	
	}

	@Override
	public void fechar() {
		this.aberto = false;	
	}

	@Override
	public void folhear(int p) {
	 if(p < this.totPaginas) {
		 p = 0;
	 } else {
		this.pagAtual = p;	
	 }
    }

	@Override
	public void avançarPag() {
		this.pagAtual++;	
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;		
	}
}
