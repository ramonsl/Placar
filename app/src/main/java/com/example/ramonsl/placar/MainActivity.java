package com.example.ramonsl.placar;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_addGol1)
    Button btnGol1;
    @BindView(R.id.btn_addGol2)
    Button btnGol2;
    @BindView(R.id.btn_addEsc1)
    Button btnEsc1;
    @BindView(R.id.btn_addEsc2)
    Button btnEsc2;
    @BindView(R.id.btn_addFal1)
    Button btnFal1;
    @BindView(R.id.btn_addFal2)
    Button btnFal2;
    @BindView(R.id.btn_addChute1)
    Button btnChute1;
    @BindView(R.id.btn_addChute2)
    Button btnChute2;
    @BindView(R.id.btn_reset)
    Button btnReset;
    @BindView(R.id.btn_start)
    Button btnStart;
    @BindView(R.id.edGol1)
    TextView edGol1;
    @BindView(R.id.edGol2)
    TextView edGol2;
    @BindView(R.id.edEsc1)
    TextView edEsc1;
    @BindView(R.id.edEsc2)
    TextView edEsc2;
    @BindView(R.id.edFal1)
    TextView edFal1;
    @BindView(R.id.edFal2)
    TextView edFal2;
    @BindView(R.id.edChute1)
    TextView edChute1;
    @BindView(R.id.edChut2)
    TextView edChute2;
    @BindView(R.id.tempo)
    Chronometer tempo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ///start and reset

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startGame();
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetGame();
            }
        });
        /////////time1

        btnGol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edGol1);
            }
        });
        btnEsc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edEsc1);
            }
        });

        btnFal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edFal1);
            }
        });

        btnChute1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edChute1);
            }
        });
        /////////time2

        btnGol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edGol2);
            }
        });
        btnEsc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edEsc2);
            }
        });

        btnFal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edFal2);
            }
        });

        btnChute2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPlacar(edChute2);
            }
        });
    }

    public void resetGame() {
        tempo.stop();
        tempo.setText("00:00");
        edChute1.setText("0");
        edChute2.setText("0");
        edGol1.setText("0");
        edGol2.setText("0");
        edFal1.setText("0");
        edFal2.setText("0");
        edEsc1.setText("0");
        edEsc2.setText("0");
    }

    public void startGame() {
        tempo.start();
        edChute1.setText("0");
        edChute2.setText("0");
        edGol1.setText("0");
        edGol2.setText("0");
        edFal1.setText("0");
        edFal2.setText("0");
        edEsc1.setText("0");
        edEsc2.setText("0");
    }

    public void addPlacar(TextView t) {
        Integer valor = Integer.valueOf(t.getText().toString());
        valor = valor + 1;
        t.setText(valor.toString());

    }
}
