package ap3;

public class EncontroIntensiva {
       private Intensiva encontroIntensiva = new Intensiva();
       private int quantidadeEncontros;
       private String horario;
       private String hora;
       private String min;
       private String seg;
       private String diaInicio;
       private String mesInicio;
       private String anoInicio;
       private String diaFim;
       private String mesFim;
       private String anoFim;
      
public EncontroIntensiva(){
    this.quantidadeEncontros = 6;
    this.hora = "06";
    this.min = "40";
    this.seg = "00";
    this.horario = "Segunda-Feira / Terça-Feira / Quarta-Feira / Quinta-Feira / Sexta-Feira / Sábado";
    this.diaInicio = "01";
    this.mesInicio = "10";
    this.anoInicio = "2021";
    this.diaFim = "01";
    this.mesFim = "10";
    this.anoFim = "2022";
}

public Intensiva getEncontroIntensiva() {
    return encontroIntensiva;
}

public void setEncontroIntensiva(Intensiva encontroIntensiva) {
    this.encontroIntensiva = encontroIntensiva;
}

public int getQuantidadeEncontros() {
    return quantidadeEncontros;
}

public void setQuantidadeEncontros(int quantidadeEncontros) {
    this.quantidadeEncontros = quantidadeEncontros;
}

public String getHorario() {
    return horario;
}

public void setHorario(String horario) {
    this.horario = horario;
}

public String getHora() {
    return hora;
}

public void setHora(String hora) {
    this.hora = hora;
}

public String getMin() {
    return min;
}

public void setMin(String min) {
    this.min = min;
}

public String getSeg() {
    return seg;
}

public void setSeg(String seg) {
    this.seg = seg;
}

public String getDiaInicio() {
    return diaInicio;
}

public void setDiaInicio(String diaInicio) {
    this.diaInicio = diaInicio;
}

public String getMesInicio() {
    return mesInicio;
}

public void setMesInicio(String mesInicio) {
    this.mesInicio = mesInicio;
}

public String getAnoInicio() {
    return anoInicio;
}

public void setAnoInicio(String anoInicio) {
    this.anoInicio = anoInicio;
}

public String getDiaFim() {
    return diaFim;
}

public void setDiaFim(String diaFim) {
    this.diaFim = diaFim;
}

public String getMesFim() {
    return mesFim;
}

public void setMesFim(String mesFim) {
    this.mesFim = mesFim;
}

public String getAnoFim() {
    return anoFim;
}

public void setAnoFim(String anoFim) {
    this.anoFim = anoFim;
}   



}
