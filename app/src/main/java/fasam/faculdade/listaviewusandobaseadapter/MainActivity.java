package fasam.faculdade.listaviewusandobaseadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.CursorAdapter;

import android.os.Bundle;

import android.widget.ListView;


import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    int icon [] ={R.drawable.um , R.drawable.dois, R.drawable.tres,R.drawable.quatro,R.drawable.cinco};

    String number [] = {"UM", "DOIS" ,"TRÊS","QUANTRO","CINCO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.ListView);

        lv.setAdapter(new PessonalizandoAdapter(MainActivity.this, icon, number));

    }
}