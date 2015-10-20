package baac.thanawut.baaclaapudon;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private  UserTABLE objUserTABLE;
    private  FoodTABLE objFoodTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create & Connected DATABASE
        createAndConnected();  // สร้าง Method

        // Tester Add New Value
        // testerAdd();

        // Delete All SQLite
        deleteAllSQLite();

    } // end Main Method

    private void deleteAllSQLite(){

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase("BAAC.db",MODE_PRIVATE,null);
        objSqLiteDatabase.delete("userTABLE",null,null);
        objSqLiteDatabase.delete("foodTABLE",null,null);

    } // end deleteAll

    private void testerAdd(){
        objUserTABLE.addNewUser("testUser","testPassword","ทดสอบ");
        objFoodTABLE.addNewFood("ลาบ","testSource","50");
    } // end method testerAdd

    private void createAndConnected() {

        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);

    } // end createAndConnected

}  // end Main Class
