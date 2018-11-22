package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static timothy.hernandez.com.finalproject.R.layout.activity_cats;

public class cats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_cats);
    }
    public void home(View v){
        Intent i = null;
        if(v.getId() == R.id.homepage){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }


    }
}
