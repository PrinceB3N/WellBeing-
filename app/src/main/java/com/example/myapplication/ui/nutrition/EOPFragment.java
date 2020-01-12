package com.example.myapplication.ui.nutrition;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
    private WebView webView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*eopViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        eopViewModel =
                ViewModelProviders.of(this).get(EOPViewModel.class);
        View root = inflater.inflate(R.layout.fragment_eop, container, false);
        final TextView textView = root.findViewById(R.id.text_eop);
        final ImageView img = root.findViewById(R.id.img_eop);
        super.onCreate(savedInstanceState);

        webView = (WebView) root.findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(
                "http://eop.sa.ucsb.edu/");

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });
        /*eopViewModel.getDrawable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer i) {
                img.setImageResource(i.intValue());

            }
        });

         */
        return root;
    }
}