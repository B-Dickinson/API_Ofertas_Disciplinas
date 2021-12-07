package ap3;

public class Distancia extends Oferta {
       private String url; 
       private int codigoUnico;
    
public Distancia(){

}   

public Distancia(String url){
      this.url = url;
}

public String getUrl() {
    return url;
}

public void setUrl(String url) {
    this.url = url;
}

public int getCodigoUnico() {
    return codigoUnico;
}

public void setCodigoUnico(int codigoUnico) {
    this.codigoUnico = codigoUnico;
}



}
