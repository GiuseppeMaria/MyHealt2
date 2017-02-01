package android.vm.myhealt2.models;

/**
 * Created by Francesco on 27/01/2017.
 */

public class Assunzione {

    private String ora,data;
    private Medicina medicina;

    public Assunzione(String ora, String data, Medicina medicina) {

        this.ora = ora;
        this.data = data;
        this.medicina = medicina;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Medicina getMedicina() {
        return medicina;
    }

    public void setMedicina(Medicina medicina) {
        this.medicina = medicina;
    }


}
