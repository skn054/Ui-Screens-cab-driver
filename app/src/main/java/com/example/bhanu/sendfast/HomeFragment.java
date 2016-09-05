package com.example.bhanu.sendfast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by bhanu kiran on 28/07/2016.
 */
public class HomeFragment extends Fragment {
    View myview;
    String email="";



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        myview=inflater.inflate(R.layout.home_layout,container,false);


        //

        return myview;
    }
}
