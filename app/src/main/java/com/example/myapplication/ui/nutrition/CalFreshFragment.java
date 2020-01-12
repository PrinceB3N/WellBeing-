package com.example.myapplication.ui.nutrition;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class CalFreshFragment extends Fragment {

    private CalFreshViewModel calfreshViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        calfreshViewModel =
                ViewModelProviders.of(this).get(CalFreshViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calfresh, container, false);
        final TextView textView = root.findViewById(R.id.text_calfresh);
        final ImageView img = root.findViewById(R.id.img_calfresh);
        calfreshViewModel.getDrawable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer i) {
                img.setImageResource(i.intValue());
            }
        });
        calfreshViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}