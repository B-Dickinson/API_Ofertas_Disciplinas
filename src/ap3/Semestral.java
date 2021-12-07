package ap3;

public class Semestral extends Presencial{
       public Sala salaSemestral;

public Semestral(){
       this.salaSemestral.setNumero(1);
       this.salaSemestral.setCapacidade(40);

}


public Sala getSalaSemestral() {
    return salaSemestral;
}

}
