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

public class EasyRecipeFragment extends Fragment {

    private EasyRecipeViewModel easyrecipeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        easyrecipeViewModel =
                ViewModelProviders.of(this).get(EasyRecipeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_easyrecipe, container, false);
        final TextView textView = root.findViewById(R.id.text_easyrecipe);
        /*easyrecipeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */

        final ImageView img = root.findViewById(R.id.img_easyrecipe);
        img.setImageDrawable(this.getResources().getDrawable(R.drawable.easyrecipe));
        /*easyrecipeViewModel.getDrawable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer i) {
                img.setImageResource(i.intValue());

            }
        });

         */
        return root;
    }
}