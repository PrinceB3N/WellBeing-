package com.example.myapplication.ui.nutrition;

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

public class EOPFragment extends Fragment {

    private EOPViewModel eopViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eopViewModel =
                ViewModelProviders.of(this).get(EOPViewModel.class);
        View root = inflater.inflate(R.layout.fragment_eop, container, false);
        final TextView textView = root.findViewById(R.id.text_eop);
        /*eopViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        final ImageView img = root.findViewById(R.id.img_eop);
        eopViewModel.getDrawable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer i) {
                img.setImageResource(i.intValue());

            }
        });
        return root;
    }
}