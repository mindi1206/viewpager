package com.example.viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    public FragmentTwo() {
        // Required empty public constructor
    }

    public static FragmentTwo newInstance() {
        Bundle args = new Bundle();
        FragmentTwo fragment = new FragmentTwo();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
}
