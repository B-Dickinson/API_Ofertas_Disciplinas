package ap3;

public class Oferta {
       private int ano;
       private int semestre;
       private int turma;
       private int modalidade; // 1 - Semestral 2 - Intensivo 3 - Distancia
       private Disciplina disciplina;
       private Sala sala;
       private EncontroSemestral encontroSemestral;
       private EncontroIntensiva encontroIntensiva;
       private EncontroDistancia encontroDistancia;

       
public Oferta(){

}   


public EncontroDistancia getEncontroDistancia() {
    return encontroDistancia;
}


public void setEncontroDistancia(EncontroDistancia encontroDistancia) {
    this.encontroDistancia = encontroDistancia;
}


public Oferta(int turma, int ano, int semestre, int modalidade, Disciplina d){
       this.ano = ano;
       this.semestre = semestre;
       this.turma = turma;
       this.disciplina = d;
       this.modalidade = modalidade;

    if(this.getModalidade() ==  1){
       this.sala = new Sala(1, 40);
    } else if(this.getModalidade() == 2){
       this.sala = new Sala(2, 20);       
    } else if(this.getModalidade() == 3) {
       this.sala = new Sala(0, 0); 
    }     

    if(this.getModalidade() == 1){
        this.encontroSemestral = new EncontroSemestral();
    } else if(this.getModalidade() == 2){
        this.encontroIntensiva = new EncontroIntensiva();
    } else if(this.getModalidade() == 3){
        this.setEncontroDistancia(new EncontroDistancia());
    }
    
    
}       

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}

public int getSemestre() {
    return semestre;
}

public void setSemestre(int semestre) {
    this.semestre = semestre;
}

public int getTurma() {
    return turma;
}

public void setTurma(int turma) {
    this.turma = turma;
}

public Disciplina getDisciplina() {
    return disciplina;
}

public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
}


public int getModalidade() {
        return modalidade;
}

public void setModalidade(int modalidade) {
    this.modalidade = modalidade;
}

public Sala getSala() {
    return sala;
}

public void setSala(Sala sala) {
    this.sala = sala;
}


public EncontroSemestral getEncontroSemestral() {
    return encontroSemestral;
}


public void setEncontroSemestral(EncontroSemestral encontroSemestral) {
    this.encontroSemestral = encontroSemestral;
}


public EncontroIntensiva getEncontroIntensiva() {
    return encontroIntensiva;
}


public void setEncontroIntensiva(EncontroIntensiva encontroIntensiva) {
    this.encontroIntensiva = encontroIntensiva;
}


public void imprimeOfertas() {

            if(this.getModalidade() == 1){

            System.out.println("Disciplina: "+this.getDisciplina().getNome() + "\nTurma: "
            +this.getTurma()+"\nSemestre: "+this.getSemestre()+"\nAno: "+this.getAno()
            +"\nModalidade: "+this.getModalidade()+"\nSala número: "+this.sala.getNumero()
            +"\nTipo de Turma: "+this.sala.getTipo()+"\nNúmero de Encontros Semanais: "
            +this.encontroSemestral.getQuantidadeEncontros()+"\nHorário de Aula: "+this.encontroSemestral.getHorario()
            +"\nDuração das Aulas: "+this.encontroSemestral.getHora()+":"+this.encontroSemestral.getMin()+":"
            +this.encontroSemestral.getSeg());
            System.out.println();

            } else if(this.getModalidade() == 2){

                System.out.println("Disciplina: "+this.getDisciplina().getNome() + "\nTurma: "
                +this.getTurma()+"\nSemestre: "+this.getSemestre()+"\nAno: "+this.getAno()
                +"\nModalidade: "+this.getModalidade()+"\nSala número: "+this.sala.getNumero()
                +"\nTipo de Turma: "+this.sala.getTipo()+"\nNúmero de Encontros Semanais: "
                +this.encontroIntensiva.getQuantidadeEncontros()+"\nHorário de Aula: "+this.encontroIntensiva.getHorario()
                +"\nData de Início: "+this.encontroIntensiva.getDiaInicio()+"/"+this.encontroIntensiva.getMesInicio()
                +"/"+this.encontroIntensiva.getAnoInicio() + "\nData de Término: "+this.encontroIntensiva.getDiaFim()
                +"/"+this.encontroIntensiva.getMesFim()+"/"+this.encontroIntensiva.getAnoFim());
                System.out.println();                

            } else if(this.getModalidade() == 3){

                System.out.println("Disciplina: "+this.getDisciplina().getNome() + "\nTurma: "
                +this.getTurma()+"\nSemestre: "+this.getSemestre()+"\nAno: "+this.getAno()
                +"\nModalidade: "+this.getModalidade()+"\nSala número: "+this.sala.getNumero()
                +"\nTipo de Turma: "+this.sala.getTipo()+"\nNúmero de Encontros Semanais: "
                +this.encontroDistancia.getHorario());
                System.out.println();

            }
            
            

}

public String imprimirOfertas(){
    if(this.getModalidade() == 1){
        
    return "Oferta número: "+this.getTurma()+"\nDisciplina: "+this.getDisciplina().getNome()+"\nTurma: "
            +this.getTurma()+"\nSemestre: "+this.getSemestre()+"\nAno: "
            +this.getAno()+"\nModalidade: "+this.getModalidade()+"\nNúmero da Sala: "
            +this.sala.getNumero()+"\nTipo da Turma: "+this.sala.getTipo()
            +"\nNúmeros de encontros Semanais: "+this.encontroSemestral.getQuantidadeEncontros()
            +"\nHorário de Aula: "+this.encontroSemestral.getHorario()+"\nDuração das Aulas: "
            +this.getEncontroSemestral().getHora()+":"+this.encontroSemestral.getMin()
            +":"+this.encontroSemestral.getSeg()+" horas";
    
    } else if(this.getModalidade() == 2){
        
    return "Oferta número: "+this.getTurma()+"\nDisciplina: "+this.getDisciplina().getNome()+"\nTurma: "
            +this.getTurma()+"\nSemestre: "+this.getSemestre()+"\nAno: "
            +this.getAno()+"\nModalidade: "+this.getModalidade()+"\nNúmero da Sala: "
            +this.sala.getNumero()+"\nTipo da Turma: "+this.sala.getTipo()
            +"\nNúmeros de encontros Semanais: "+this.encontroIntensiva.getQuantidadeEncontros()
            +"\nHorário de Aula: "+this.encontroIntensiva.getHorario()+"\nDuração das Aulas: "
            +this.getEncontroIntensiva().getHora()+":"+this.encontroIntensiva.getMin()
            +":"+this.encontroIntensiva.getSeg()+" horas"+"\nData de ínicio: "
            +this.getEncontroIntensiva().getDiaInicio()+"/"+this.getEncontroIntensiva().getMesInicio()
            +"/"+this.getEncontroIntensiva().getAnoInicio()+"\nData de Término: "
            +this.getEncontroIntensiva().getDiaFim()+"/"+this.getEncontroIntensiva().getMesFim()
            +"/"+this.getEncontroIntensiva().getAnoFim();        
        
    } else if(this.getModalidade() == 3){
        
    return "Oferta número: "+this.getTurma()+"\nDisciplina: "+this.getDisciplina().getNome()+"\nTurma: "
            +this.getTurma()+"\nSemestre: "+this.getSemestre()+"\nAno: "
            +this.getAno()+"\nModalidade: "+this.getModalidade()+"\nNúmero da Sala: "
            +this.sala.getNumero()+"\nTipo da Turma: "+this.sala.getTipo()
            +"\nNúmeros de encontros Semanais: "+this.encontroDistancia.getHorario();
    
    }
           return null;
}            

}
