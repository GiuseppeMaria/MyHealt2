package android.vm.myhealt2;

import android.text.Editable;

/**
 * Created by Francesco on 27/01/2017.
 */

public class Assunzione {

    private String name,data;

    public Assunzione(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
