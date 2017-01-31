package android.vm.myhealt2;

/**
 * Created by Francesco on 30/01/2017.
 */

public class Medicina {
    private String nome, produttore, modalitaAssunzione;

    public Medicina(String nome, String produttore, String modalitaAssunzione) {
        this.nome = nome;
        this.produttore = produttore;
        this.modalitaAssunzione = modalitaAssunzione;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModalitaAssunzione() {
        return modalitaAssunzione;
    }

    public void setModalitaAssunzione(String modalitaAssunzione) {
        this.modalitaAssunzione = modalitaAssunzione;
    }
}
