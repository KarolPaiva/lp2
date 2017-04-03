public class Lista{
	private class No{
		private	int i;
		private No prox;
		private No ant;
		public void setI(int i){
			this.i = i;
		}
		public int  getI(){
			this.return i;
		}
		public No setA (No a){
			this.a = a;
		}
		public No getA(){
			this.return a;
		}
		public No getP (No p){
			this.p = p;
		}
		public No getP(){
			this.return p;
		}
		private No cabeca, f;


		public void inserir(int i){
			No novo = new i No();
			novo.setI(i);
			this.i = novo;
			cabeca = fim;
		}
		public void remover(){

		}
		public  boolean pesquisar (int busca){
			No cursor = cabeca;
			while (cursor.getI() != busca && curso != null){
				cursor = cursor.getA();
			}
			if (cursor != null){
				return false;
			}else{
				return true;
			}
		}

	}

}
