package matvidako.hr.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        LinearLayout root = (LinearLayout) findViewById(R.id.root);
        for(int i = 0; i < root.getChildCount(); i++) {
            root.getChildAt(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String message = getString(R.string.launch_msg, button.getText());
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
