package me.fabio.livros;

     public class Pessoas {
	    
    	 private String nome;
    	 private String sexo;
    	 private int idade;
		
     public void fazerAniv() {
    	 this.idade++;
     }
	
	 public Pessoas(String nome, String sexo, int idade) {
		 this.nome = nome;
		 this.idade = idade;
		 this.sexo = sexo;
	 }
	 
	 public String getNome() {
		 return this.nome;
	 }
	
	
	
}
