package phystech.learn.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        b1.setText("BIG BUTTON");
    }

    TextView textView;
    Button b1;
    Switch s1;
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            textView.setText("gjasdgflajsf");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        s1 = findViewById(R.id.switch1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragment f = BlankFragment.newInstance();
                transaction.add(R.id.linear,f);
                transaction.commit();
            }
        });
        Log.d("Activity lifecycle","OnCreatre");
    }
}