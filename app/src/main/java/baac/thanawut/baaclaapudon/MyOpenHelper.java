package baac.thanawut.baaclaapudon;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by BAAC on 19/10/2558.
 */
public class MyOpenHelper extends SQLiteOpenHelper{
    // Explicit  การประกาศตัวแปร
    private static final String DATABASE_NAME = "BAAC.db";  // การประกาศตัวแปรใช้ในภายใน class เท่านั้น เป็นแบบค่าคงที่ไม่สามารถแก้ไขได้
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE (_id integer primary key, User text, Password text, Name text); "; // ช่องแรกจะต้องเป็น _id เท่านั้น
    private static final String CREATE_FOOD_TABLE = "create table foodTABLE (_id integer primary key, Food text, Source text, Price text); ";


    // ถ้าตั้งชื่อเดียวกับ Class จะเป็น Constructor
    // ถ้า Constructor ทำงานจะทำหน้าที่ต่อท่อไปยัง context
    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION); // super จะทำงานอัตโนมัติ

    } // end constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);
        sqLiteDatabase.execSQL(CREATE_FOOD_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
} // Main Class นี่คือคลาสหลัก
