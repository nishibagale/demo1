package com.example.form;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main_activity extends AppCompatActivity {

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        final Button button1 = (Button) findViewById(R.id.button1);
        final EditText edit_text1 = (EditText) findViewById(R.id.edit_text1);
        final EditText edit_text2 = (EditText) findViewById(R.id.edit_text2);

        sp = Main_activity.this.getSharedPreferences("demo.xml", MODE_PRIVATE);
        edit_text1.setText(sp.getString("name", "Nishi"));
        edit_text2.setText(sp.getString("class", "MCS1"));

        button1.setEnabled(false);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor spe = sp.edit();
                spe.putString("name", edit_text1.getText().toString().trim());
                spe.putString("class", edit_text2.getText().toString().trim());
                spe.commit();

                Toast.makeText(Main_activity.this, "Saved Successfully", Toast.LENGTH_LONG).show();

            }
        });

            edit_text1.addTextChangedListener(
                    new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {


                            if(edit_text1.getText().toString().trim().length()>8)
                                button1.setEnabled(true);
                            else
                                button1.setEnabled(false);

                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    }
            );
    }
}
