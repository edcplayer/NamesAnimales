package com.example.nombresdeanimales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void mensajeconejo(View view)
{
    deteneraudio();
    reproductor=MediaPlayer.create(this, R.raw.rabbit);
    reproductor.start();

    Toast.makeText(this,"Conejo", Toast.LENGTH_SHORT).show();
}
    public void mensajegato(View view)
    {
        deteneraudio();
        reproductor=MediaPlayer.create(this, R.raw.cat);
        reproductor.start();
        Toast.makeText(this,"Gato", Toast.LENGTH_SHORT).show();
    }
    public void mensajeleon(View view)
    {
        deteneraudio();
        reproductor=MediaPlayer.create(this, R.raw.lion);
        reproductor.start();
        Toast.makeText(this,"Leon", Toast.LENGTH_SHORT).show();
    }
    public void mensajeoso(View view)
    {
        deteneraudio();
        reproductor=MediaPlayer.create(this, R.raw.bear);
        reproductor.start();
        Toast.makeText(this,"Oso", Toast.LENGTH_SHORT).show();
    }
    public void mensajeperro(View view)
    {
        deteneraudio();
        reproductor= MediaPlayer.create(this, R.raw.dog);
        reproductor.start();
        Toast.makeText(this,"Perro", Toast.LENGTH_SHORT).show();
    }
    public void mensajeserpiente(View view)
    {
        deteneraudio();
        reproductor= MediaPlayer.create(this, R.raw.snake);
        reproductor.start();
        Toast.makeText(this,"Serpiente", Toast.LENGTH_SHORT).show();
    }
    public void mensajetigre(View view)
    {
        deteneraudio();
        reproductor= MediaPlayer.create(this, R.raw.tiger);
        reproductor.start();
        Toast.makeText(this,"Tigre", Toast.LENGTH_SHORT).show();
    }
    public void mensajeelefante(View view)
    {
        deteneraudio();
        reproductor= MediaPlayer.create(this, R.raw.elephant);
        reproductor.start();
        Toast.makeText(this,"Elefante", Toast.LENGTH_SHORT).show();
    }
    public void mensajezorro(View view)
    {
        deteneraudio();
        reproductor= MediaPlayer.create(this, R.raw.fox);
        reproductor.start();
        Toast.makeText(this,"Zorro", Toast.LENGTH_SHORT).show();
    }
    public void mensajetortuga(View view)
    {
        deteneraudio();
        reproductor= MediaPlayer.create(this, R.raw.turtle);
        reproductor.start();
        Toast.makeText(this,"Tortuga", Toast.LENGTH_SHORT).show();
    }

    public void deteneraudio(){
        if (reproductor!=null){
            if(reproductor.isPlaying()){
            reproductor.release();
            reproductor = null;

            }
        }
    }
}