package johnivan.fajardo.com.fajardojohnivanlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4IT-H", "onStart will execute");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H", "onResume will execute");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H", "onStop will execute");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H", "onRestart will execute");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H", "onDestroy will execute");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H", "onPause will execute");
    }

    public void Activity1(android.view.View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.act2) {

            setContentView(R.layout.activity2);

        } else if(v.getId()==R.id.map){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6126661,120.9879215"));
            chooser= Intent.createChooser(i, "Choose a Map");
            startActivity(chooser);

        }
    }

    public void Activity2(android.view.View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.act1) {
            setContentView(R.layout.activity1);

        } else if(v.getId()==R.id.map){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6142522,120.9823558"));
            chooser= Intent.createChooser(i, "Choose a Map");
            startActivity(chooser);

        }
    }



}
