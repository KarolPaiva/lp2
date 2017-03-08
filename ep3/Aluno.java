class Aluno{
	private String nome;
	private	int idade;
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getIdade(){
		return this.idade;
	}
	public int compareTo(Auno novo){
                if(this.idade > novo.getIdade()){
                        return 1;
                }
                if(this.idade > novo.getIdade()){
                        return -1;
                }
                return 0;
        }

}


