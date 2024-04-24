package com.example.materialsignup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CourseGVAdapter extends ArrayAdapter<CourseModel> {

    Context context;
    ArrayList<CourseModel> CourseModelArraylist;

    public CourseGVAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArraylist) {
        super(context, R.layout.grid_layout, courseModelArraylist);
        this.context = context;
        CourseModelArraylist = courseModelArraylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;

        if (listitemView == null){
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_layout, parent, false);
        }

        CourseModel courseModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.text_view);
        ImageView courseIV = listitemView.findViewById(R.id.image_view);

        courseTV.setText(courseModel.getCourse_name());
        courseIV.setImageResource(courseModel.getImgid());
        return listitemView;

    }
}
