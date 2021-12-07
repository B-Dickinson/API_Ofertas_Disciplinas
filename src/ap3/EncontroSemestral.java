package ap3;

public class EncontroSemestral{
       private Semestral semestral;
       private int quantidadeEncontros;
       private String hora;
       private String min;
       private String seg;
       private String horario;

       
public EncontroSemestral(){
    this.quantidadeEncontros = 3;
    this.hora = "03";
    this.min = "40";
    this.seg = "00";
    this.horario = "Segunda-Feira / Quarta-Feira / Sexta-Feira";
}

public Semestral getSemestral() {
    return semestral;
}

public void setSemestral(Semestral semestral) {
    this.semestral = semestral;
}

public int getQuantidadeEncontros() {
    return quantidadeEncontros;
}

public void setQuantidadeEncontros(int quantidadeEncontros) {
    this.quantidadeEncontros = quantidadeEncontros;
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

public String getHorario() {
    return horario;
}

public void setHorario(String horario) {
    this.horario = horario;
}



     
}
