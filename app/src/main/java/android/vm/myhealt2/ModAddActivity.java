package android.vm.myhealt2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mm on 31/01/2017.
 */

public class ModAddActivity extends AppCompatActivity {

    Button scanner;
    Activity activity = this;

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       setContentView(R.layout.activity_mod_add);
        scanner = (Button) findViewById(R.id.bottone_scanner);

        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity,ScanProdottoActivity.class);
                startActivity(i);
            }
        });
    }




}
