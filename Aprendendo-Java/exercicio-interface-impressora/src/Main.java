import modelos.*;

public class Main{

    public static void main(String[] args) {
        Contrato c1 = new Contrato("Contrato","pdf");
        Foto f1 = new Foto("Selfie", "jpg");
        Documento d1 = new Documento("Documento", "docx");
        Impressora i1 = new Impressora() {
            @Override
            public void imprimirTudo() {
                super.imprimirTudo();
            }

            @Override
            public void adicionarImprimivel(Imprimivel umImprimivel) {
                super.adicionarImprimivel(umImprimivel);
            }
        };

        c1.imprimir();
        System.out.println("\n");
        f1.imprimir();
        System.out.println("\n");
        d1.imprimir();
    }
}
