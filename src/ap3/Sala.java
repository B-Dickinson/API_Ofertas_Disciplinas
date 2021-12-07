package ap3;

public class Sala {
      private int numero;
      private int capacidade;
      private String tipo;

public Sala(){

}   

public Sala(int numero, int capacidade){
      this.numero = numero;
      this.capacidade = capacidade;

      if(this.numero == 1){
          this.tipo = " Modelo Semestral";
      } else if(this.numero == 2){
          this.tipo = "Modelo Intensivo";  
      }else if(this.numero != 1 || this.numero != 2){
          this.tipo = "Modelo à Distância. Não há salas para esta modalidade";  
      }
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public int getCapacidade() {
    return capacidade;
}

public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public void listarSalas(){
    System.out.println("Sala número: "+this.getNumero()+"\nTipo de Turma: "+this.getTipo());
}
    
}
