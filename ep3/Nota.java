public class Nota{
	private double nota;
	private Aluno a;
	private Disciplina d;
}
public Nota( double nota, Aluno a, Disciplina d){
                this.nota = nota;
                this.d = d;
		this.a = a;
        }

        public double  getNota(){
                return this.nota;
        }
        public Disciplina  getDisciplina(){
                return this.d;
        }
        public Aluno  getAluno(){
                return this.a;
        }
	
	public int compareTo( Nota outra){
		if( this.nota > outra.getNota())
			return -1;
        	else if( this.nota < outra.getNota())
			return 1;
		else
			return 0;
	}
}

