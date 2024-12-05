package aula;

public class LeiteDecorator extends BebidaDecorator{

    public LeiteDecorator(Bebida bebida) {
        super(bebida);
        //TODO Auto-generated constructor stub
    }

    public String obterDescricao() {
        return super.obterDescricao() + ", Leite ";
    }    

    public double obterCusto() {
        return super.obterCusto() + 1.5;
    }
}
