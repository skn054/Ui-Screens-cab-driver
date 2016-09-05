package com.example.bhanu.sendfast;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bhanu kiran on 28/07/2016.
 */
public class SixthFragment extends Fragment {
    View myview;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.sixth_layout,container,false);
        button= (Button) myview.findViewById(R.id.button);
        final TextView result= (TextView) myview.findViewById(R.id.text_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text= (EditText) myview.findViewById(R.id.amount);
                EditText comm= (EditText) myview.findViewById(R.id.commision);
                String amt1=text.getText().toString();
                String amt=comm.getText().toString();
                double amount=0;
                double commision=0;

                if(amt1.length()>0) {
                    amount = Double.parseDouble(amt1);
                }
                if(amt.length()>0)
                {
                    commision=Double.parseDouble(amt);
                }

                if(amount<=0||commision<=0)
                {
                    Toast.makeText(getActivity(),"Inavid Amount or Commision Entered",Toast.LENGTH_LONG).show();
                }
                else {
                    double res=(commision/100)*amount;
                    res=amount-res;
                    String ans=String.valueOf(res);
                    result.setText("Your Amount after Deduction of Uber's Commision is :Rs "+ans);


                }
            }
        });


        return myview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



}
