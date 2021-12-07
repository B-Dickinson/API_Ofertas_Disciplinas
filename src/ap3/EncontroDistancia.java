package ap3;

public class EncontroDistancia {
      Distancia encontro = new Distancia();
      private String horario;

public EncontroDistancia(){
      this.setHorario("Para mais informações, acesse www.IslWyden.com");  
}

public Distancia getEncontro() {
    return encontro;
}

public void setEncontro(Distancia encontro) {
    this.encontro = encontro;
}

public String getHorario() {
    return horario;
}

public void setHorario(String horario) {
    this.horario = horario;
}   




}
