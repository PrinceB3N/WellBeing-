package com.example.myapplication.ui.fitness;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class AthleticsFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //shViewModel =
        //ViewModelProviders.of(this).get(SexualHygieneViewModel.class);
        View root = inflater.inflate(R.layout.fragment_athletics, container, false);
        //final TextView textView = root.findViewById(R.id.text_sexualhygiene);
        final ImageView img = root.findViewById(R.id.img_athletics);
        img.setImageDrawable(this.getResources().getDrawable(R.drawable.wellbeingfinal_08));
        return root;
    }
}
