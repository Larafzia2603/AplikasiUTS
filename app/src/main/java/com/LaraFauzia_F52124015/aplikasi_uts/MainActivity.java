package com.LaraFauzia_F52124015.aplikasi_uts;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvTeman;
    private ArrayList<TemanModel> listTeman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTeman = findViewById(R.id.lv_teman);
        listTeman = new ArrayList<>();
        listTeman.add(new TemanModel(
                "Alya Nadira",
                "F52124011",
                "Gym, Badminton",
                R.drawable.dira
        ));
        listTeman.add(new TemanModel(
                "Nur Ainun",
                "F52124024",
                "Menulis, Membaca",
                R.drawable.ainun
        ));
        listTeman.add(new TemanModel(
                "Yulianingsih",
                "F52124004",
                "Design & Fotografi",
                R.drawable.yuli
        ));
        listTeman.add(new TemanModel(
                "Nur Amelia",
                "F52124017",
                "Memasak",
                R.drawable.amel
        ));
        listTeman.add(new TemanModel(
                "Zahra",
                "F52124035",
                "Menyanyi",
                R.drawable.zahra
        ));

        // Memasang Custom Adapter ke ListView
        TemanAdapter adapter = new TemanAdapter(this, listTeman);
        lvTeman.setAdapter(adapter);
    }
}