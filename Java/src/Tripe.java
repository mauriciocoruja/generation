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
        alturaAtual = novaAltura;
    }

    public boolean dobrar(){
        return dobrado = false;
    }

    public boolean desdobrar(){
        return dobrado = true;
    }

    public boolean guardar(){
        if ((dobrado)&&(alturaAtual <= alturaMinima)){
            // pronto para guardar
        }
        return true;
    }

    public void prontoParaGuardar(){
        if (guardar()){
            //está pronto para guardar
        }else {
            //ainda não está pronto para guardar
        }
    }

    public void usar(){
        if((!desdobrar()) && (alturaAtual > (alturaMaxima/2))){
            //Pronto para guardar
        }else {
            //não está pronto para usar
        }
    }

    public void prontoParaUsar(){
        if ((desdobrar()) && ((alturaAtual > (alturaMaxima/2)))){
            //Está pronto para usar
        }
    }





}
