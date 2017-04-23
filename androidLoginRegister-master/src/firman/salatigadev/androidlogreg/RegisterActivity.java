package firman.salatigadev.androidlogreg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
 
public class RegisterActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View ke register.xml
        setContentView(R.layout.register);
 
        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
 
        // Mengambil link ke Login form
        loginScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View arg0) {
                // Menutup tampilan screen register
                // Beralih ke Login Screen/menutup screen register
                finish();
            }
        });
    }
}
