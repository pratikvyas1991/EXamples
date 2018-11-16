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

public class FragmentB extends Fragment{
    private static String TAG = "%%%FragmentB";
    TextView txt_value_b;
    Button btn_action;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        btn_action = (Button)view.findViewById(R.id.btn_action);
        txt_value_b = (TextView)view.findViewById(R.id.txt_value_b);

        btn_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentC fragmentC =new FragmentC();
                Bundle bundle =new Bundle();
                bundle.putString("value","Welcome To C frag");
                fragmentC.setArguments(bundle);
                ((MainActivity)getActivity()).openFragmentC(fragmentC);
            }
        });
        return view;
    }

    public void updateValue(String str){
        txt_value_b.setText(str);
    }


}
