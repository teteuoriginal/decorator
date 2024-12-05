package aula;

public class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String obterDescricao() {
        //TODO Auto-generated method stub
        return bebida.obterDescricao();
    }

    @Override
    public double obterCusto() {
        //TODO Auto-generated method stub
        return bebida.obterCusto();
    }
    }
