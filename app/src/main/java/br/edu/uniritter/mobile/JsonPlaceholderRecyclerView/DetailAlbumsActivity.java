package br.edu.uniritter.mobile.JsonPlaceholderRecyclerView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import br.edu.uniritter.mobile.JsonPlaceholderRecyclerView.model.Albums;

public class DetailAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_albums);

        Intent intent = getIntent();
        Parcelable prc = intent.getParcelableExtra("objAlbums");
        if (prc instanceof Albums) {

        }
        Albums albums = intent.getParcelableExtra("objAlbums");
        bind(albums);

    }
    public void trocaLayout(View v) {
        setContentView(R.layout.layout);
        Intent intent = getIntent();
        Albums albums = intent.getParcelableExtra("objAlbums");
        bind(albums);

    }
    /*public void cbClick(View v) {
        CheckBox cb = findViewById(R.id.cbCompleted);
        Intent intent = getIntent();
        Todo todo = intent.getParcelableExtra("objAlbums");
        todo.setCompleted(cb.isChecked());
    }*/

    private void bind(Albums obj) {
        TextView tv = findViewById(R.id.tvId);
        tv.setText(obj.getId()+"");
        tv = findViewById(R.id.tvIdUser);
        tv.setText(obj.getUserId()+"");
        tv = findViewById(R.id.tvTitle);
        tv.setText(obj.getTitle());
        //CheckBox cb = findViewById(R.id.cbCompleted);
        //cb.setChecked(obj.isCompleted());
    }
}