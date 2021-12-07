package ap3;

public class Intensiva extends Presencial {
       private String dataInicio;
       private String dataFim;
       private Sala salaIntensivo;

       
public Intensiva(){


    
}   

public Intensiva(String inicio, String fim){
       this.dataInicio = inicio;
       this.dataFim = fim; 
       this.salaIntensivo.setNumero(2);
       this.salaIntensivo.setCapacidade(20);
}

public String getDataInicio() {
    return dataInicio;
}

public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
}

public String getDataFim() {
    return dataFim;
}

public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
}

public Sala getSalaIntensivo() {
    return salaIntensivo;
}

public void setSalaIntensivo(Sala salaIntensivo) {
    this.salaIntensivo = salaIntensivo;
}


}
