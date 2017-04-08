package ingenium.simplequizapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    GridView grd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grd=(GridView)findViewById(R.id.grid_xml);

        String[] text={

                "Number QZ",
                "Spelling QZ",
                "Fruit QZ",
                "Number QZ",
                "Spelling QZ",
                "Fruit QZ",
                "Number QZ",
                "Spelling QZ",
                "Fruit QZ",
                "Number QZ",
                "Spelling QZ",
                "Fruit QZ",
        };

        int[] img={
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,
                R.drawable.qz,

        };

        GridViewAdapter adapter=new GridViewAdapter(this,text,img);
        grd.setAdapter(adapter);

        grd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){

                    case 0:
                        startActivity(new Intent(MainActivity.this,NumberActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,SpellingqzActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,FruitqzActivity.class));
                        break;
                }

            }
        });


    }



}
