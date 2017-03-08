public class Principal{
	public static void main(String [] avgs){
		Aluno a = new Aluno();
			a.setNome("Karol");
			b.setIdade(19);

		Aluno b = new Aluno();
			b.setNome("Nathy");
			b.setIdade(17);

		Aluno c = new Aluno();
			c.setNome("Brian");
			c.setIdade(18);

		Aluno d = new Aluno();
			d.setNome("Birma");
			d.setIdade(17);

		Aluno e = new Aluno();
			e.setNome("Teteu");
			e.setIdade(17);

		ArrayList<Aluno> e = new ArrayList<Aluno>();
		e.add(a);
		e.add(b);
		e.add(c);
		e.add(d);
		e.add(e);

public class Ordenar implements Comparable<Ordenar>{
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
