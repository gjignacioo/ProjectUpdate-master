package timothy.hernandez.com.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);
    }
    public void home(View v){
        Intent i = null;
        if(v.getId() == R.id.homepage){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }


    }
}
