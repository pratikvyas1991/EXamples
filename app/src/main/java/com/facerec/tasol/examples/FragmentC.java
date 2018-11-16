package com.facerec.tasol.examples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tasol on 7/9/18.
 */

public class FragmentC extends Fragment{
    private static String TAG = "%%%FragmentB";
    TextView txt_value_b;
    Button btn_action;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c,container,false);
        Bundle bundle = this.getArguments();

        btn_action = (Button)view.findViewById(R.id.btn_action);
        txt_value_b = (TextView)view.findViewById(R.id.txt_value_b);
        if(bundle!=null){
            String val = bundle.getString("value");
            txt_value_b.setText(val);
        }
        return view;
    }
}
