package ap3;

import java.util.*;

public class Disciplina {
      private int codigo;
      private String nome;
      private Map<Integer,String> disciplina = new HashMap<>();

    

public Disciplina(){

}   

public Disciplina(int codigo, String nome){
       this.nome = nome;
       this.codigo = codigo; 
       this.disciplina.put(codigo,nome);
}

/* 

A partir do momento que instanciarmos uma disciplina, já estamos
populando nosso array dinâmico.

*/


public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void imprimeDisciplina(Integer code){
    if(this.disciplina.containsKey(code) == false){
        System.out.println("Disciplina Inexistente"); 
    } else{
        System.out.println("Disciplina: "+this.disciplina.get(code)+ "\nCódigo: "+this.getCodigo());
    }
}



    


}
