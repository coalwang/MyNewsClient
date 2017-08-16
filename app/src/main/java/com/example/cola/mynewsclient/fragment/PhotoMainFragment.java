package com.example.cola.mynewsclient.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cola.mynewsclient.application.MyApplication;

/**
 * Created by Cola on 2017/8/13.
 */

public class PhotoMainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(MyApplication.getMyContext());
        textView.setText("这是Fragment");
        return textView;
    }
}
