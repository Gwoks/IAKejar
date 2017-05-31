package com.example.a.iakejar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Level4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);


        //init
        final RadioGroup rgLvl1 = (RadioGroup) findViewById(R.id.rg_lvl1);
        Button btSubmit = (Button) findViewById(R.id.btn_lvl1);
        ImageView imgView1 = (ImageView) findViewById(R.id.img_clue1);

        //image keluar suara kalo di klik
        final MediaPlayer mp3Trap = MediaPlayer.create(this, R.raw.lingkaran);
        imgView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3Trap.start();
            }
        });


        //radiobutton, kalo bener, lgs intent lvl selanjutnya
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rgLvl1.getCheckedRadioButtonId();
                switch (id){
                    case R.id.rb1_bk:
                        Toast.makeText(Level4.this, "Ooops, coba lagi !", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb1_ling:
                        startActivity(new Intent(Level4.this, Level5.class));
                        Toast.makeText(Level4.this, "Yap! Kamu benar, menuju level terakhir !", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb1_pers:
                        Toast.makeText(Level4.this, "Ooops, coba lagi !", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb1_segi3:
                        Toast.makeText(Level4.this, "Ooops, coba lagi23 !", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb1_trap:

                        Toast.makeText(Level4.this, "Ooops, coba lagi45 !", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });//end
    }
}
