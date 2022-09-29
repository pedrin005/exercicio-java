public class CARRO {
    private Integer diametroDoPeneu;
    private String motor;
    private String busina;
    private String Farol;
    private boolean chave;
    private boolean acelerador;
    private boolean desligar;

    public boolean isDesligar() {
        return desligar;
    }

    public void setDesligar(boolean desligar) {
        this.desligar = desligar;
    }

    public void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    public boolean isAcelerador() {
        return acelerador;
    }

    public void setChave(boolean chave) {
        this.chave = chave;
    }

    public boolean isChave() {
        return chave;
    }

    public void setFarol(String farol) {
        Farol = farol;
    }

    public String getFarol() {
        return Farol;
    }

    public void setBusina(String busina) {
        this.busina = busina;
    }

    public String getBusina() {
        return busina;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setDiametroDoPeneu(Integer diametroDoPeneu) {
        this.diametroDoPeneu = diametroDoPeneu;
    }

    public Integer getDiametroDoPeneu() {
        return diametroDoPeneu;
    }

    public static Boolean LigarCarro(Boolean chaveDocarro) {

        if (chaveDocarro !=null && chaveDocarro){
            System.out.println(" ligando carro!");
            acelerarCarro(chaveDocarro, true);
            desligarcarro(chaveDocarro,true);
        }else {
            System.out.println(" Estou sem as chaves do carro ");
            acelerarCarro(chaveDocarro, true);
            desligarcarro(chaveDocarro,true);
        }
        return chaveDocarro;
    }

    private static Boolean acelerarCarro(Boolean chaveDocarro, Boolean acelerador) {

    if(chaveDocarro !=null && chaveDocarro) {
        System.out.println(" vc ja pode acelerar o carro");
    }else {
        System.out.println(" impossivel de acelerar o carro nao esta com as chave na ignicao ");
    }
    return acelerador;
  }
public static Boolean desligarcarro(Boolean chaveDocarro, Boolean desligar){
    if (chaveDocarro !=null && chaveDocarro){
        System.out.println(" impossivel desligar carro o carro ja esta em alta velocidade");
    }else {
        System.out.println(" impossivel acelerar o carro agora , porfavor insira a chave na ignicao ");
    }
    return desligar;
}
    public static void main(String[] args) {
       LigarCarro(true);//
    }

    }



