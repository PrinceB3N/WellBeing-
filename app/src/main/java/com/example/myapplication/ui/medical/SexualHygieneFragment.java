package com.example.myapplication.ui.medical;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class SexualHygieneFragment extends Fragment {
    private SexualHygieneViewModel shViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //shViewModel =
        //ViewModelProviders.of(this).get(SexualHygieneViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sexualhygiene, container, false);
        //final TextView textView = root.findViewById(R.id.text_sexualhygiene);
        final ImageView img = root.findViewById(R.id.img_hygiene);
        img.setImageDrawable(this.getResources().getDrawable(R.drawable.sexualhygiene));
        return root;
    }
}
