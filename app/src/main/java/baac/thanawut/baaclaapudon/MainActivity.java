package baac.thanawut.baaclaapudon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private  UserTABLE objUserTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create & Connected DATABASE
        createAndConnected();  // สร้าง Method


    } // end Main Method

    private void createAndConnected() {

        objUserTABLE = new UserTABLE(this);

    } // end createAndConnected

}  // end Main Class
