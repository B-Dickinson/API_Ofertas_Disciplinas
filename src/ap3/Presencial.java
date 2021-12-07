package ap3;

import java.util.*;

public abstract class Presencial extends Oferta {
      private String diaSemana;
      private int hora;
      private int duracao;
      private int CodigoUnico;
      private List<Sala> salas = new ArrayList<>();
      
public Presencial(){

}   

public Presencial(String diaSemana, int hora, int duracao){
       this.diaSemana = diaSemana;
       this.hora = hora;
       this.duracao = duracao; 
}

public String getDiaSemana() {
    return diaSemana;
}

public void setDiaSemana(String diaSemana) {
    this.diaSemana = diaSemana;
}

public int getHora() {
    return hora;
}

public void setHora(int hora) {
    this.hora = hora;
}

public int getDuracao() {
    return duracao;
}

public void setDuracao(int duracao) {
    this.duracao = duracao;
}

public List<Sala> getSalas() {
    return salas;
}

public void setSalas(List<Sala> salas) {
    this.salas = salas;
}

public int getCodigoUnico() {
    return CodigoUnico;
}

public void setCodigoUnico(int codigoUnico) {
    CodigoUnico = codigoUnico;
}

}
