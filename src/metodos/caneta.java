package metodos;

public class caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private boolean destampar;
    private String cor;
    public caneta(String m,String c,float p){
        this.modelo=m;
        this.cor=c;
        this.setPonta(p);
        this.tampar();
        this.cor="azul";
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo=m;
    }
    public float getPonta(){
        return this.ponta;
    }

    public  void setPonta(float p){
        this.ponta=p;
    }
    public void tampar(){
        this.tampada =false;
    }
    public void destampar(){
        this.destampar=true;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo "+this.getModelo());
        System.out.println("A ponta e de "+this.getPonta());
        System.out.println("cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
        System.out.println("Destampada:"+this.destampar);
    }

}
