package inocentini.com.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Inocentini- on 07/11/2017.
 */

public class NoteActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        final EditText edtTextTitle = findViewById(R.id.edt_title);
        final EditText edtTextDescription = findViewById(R.id.edt_description);

        Button btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NoteActivity.this, edtTextTitle.getText() + "Salvo", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
