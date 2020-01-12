package com.example.myapplication.ui.nutrition;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class FoodBankFragment extends Fragment {

    private FoodBankViewModel foodbankViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        foodbankViewModel =
                ViewModelProviders.of(this).get(FoodBankViewModel.class);
        View root = inflater.inflate(R.layout.fragment_foodbank, container, false);
        final TextView textView = root.findViewById(R.id.text_foodbank);
        foodbankViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        final ImageView img = root.findViewById(R.id.img_foodbank);
        foodbankViewModel.getDrawable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer i) {
                img.setImageResource(i.intValue());

            }
        });
        return root;
    }
}