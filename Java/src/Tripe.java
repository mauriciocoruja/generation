public class Tripe {
    private boolean dobrado;
    private double alturaMinima;
    private double alturaMaxima;
    private double alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        dobrado = dobrado;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(double alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public Tripe(boolean dobrado, double alturaMinima, double alturaMaxima, double alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(Integer novaAltura){
        this.alturaAtual = novaAltura;
    }

    public boolean dobrar(){
        if(dobrado){
            System.out.println("Sim, está dobrado");
            return true;
        }else{
            System.out.println("Não está dobrado");
            return false;
        }
//        this.dobrado = true;
//        System.out.println("Sim, está dobrado");
//        return true;
    }

    public boolean desdobrar(){
        this.dobrado = false;
        System.out.println("Agora está desdobrado");
        return false;
        //tira do estado dobrado e coloca no estado desdobrado
    }

    public boolean guardar(){
        if ((this.dobrado)&&(alturaAtual == alturaMinima)){
            // pronto para guardar
            System.out.println("Hora de guardar");
            return true;
        }else {
            System.out.println("Tente dobrar antes de guardar");
            return false;
        }
    }

    public void prontoParaGuardar(){
        if (guardar()){
            System.out.println("Está pronto para guardar");
            //está pronto para guardar
        }else{
            System.out.println("Ainda não está pronto para guardar");
            //ainda não está pronto para guardar
        }
    }

    public boolean usar(){
        if((dobrar()) && (alturaAtual > (alturaMaxima/2))){
            System.out.println("Está pronto para usar");
            //Pronto para usar
        }else {
            System.out.println("Não está pronto para usar");
            //não está pronto para usar
        }
        return true;
    }

    public void prontoParaUsar(){
        if (usar() && alturaAtual > (alturaMaxima/2)){
            System.out.println("Está pronto para usar");
            //Está pronto para usar
        }
    }





}
