package com.example.materialsignup;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView = findViewById(R.id.grid_view);

        ArrayList<CourseModel> corseModelArraylist = new ArrayList<CourseModel>();

        corseModelArraylist.add(new CourseModel("Android", R.drawable.ic_launcher_foreground));
        corseModelArraylist.add(new CourseModel("Audio", R.drawable.baseline_audiotrack_24));
        corseModelArraylist.add(new CourseModel("Battery", R.drawable.baseline_battery_charging_full_24));
        corseModelArraylist.add(new CourseModel("Camera", R.drawable.baseline_camera_alt_24));
        corseModelArraylist.add(new CourseModel("Download", R.drawable.baseline_file_download_24));
        corseModelArraylist.add(new CourseModel("Filter", R.drawable.baseline_filter_alt_24));
        corseModelArraylist.add(new CourseModel("Emoji", R.drawable.baseline_emoji_emotions_24));
        corseModelArraylist.add(new CourseModel("Duo", R.drawable.baseline_duo_24));
        corseModelArraylist.add(new CourseModel("Done", R.drawable.baseline_file_download_done_24));
        corseModelArraylist.add(new CourseModel("Extension", R.drawable.baseline_extension_24));

        CourseGVAdapter adapter = new CourseGVAdapter(this, corseModelArraylist);
        gridView.setAdapter(adapter);

    }
}