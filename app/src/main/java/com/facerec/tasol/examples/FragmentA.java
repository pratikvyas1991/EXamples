package com.facerec.tasol.examples;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by tasol on 7/9/18.
 */

public class FragmentA extends Fragment {
    Button btn_action;
    EditText et_input;
    TextView txt_value_a;
    private static String TAG = "%%%FragmentA";
    ChangeValue changeValue;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);

        txt_value_a = (TextView)view.findViewById(R.id.txt_value_a);
        btn_action = (Button)view.findViewById(R.id.btn_action);
        et_input = (EditText)view.findViewById(R.id.et_input);

        btn_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeValue.change(et_input.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            changeValue = (ChangeValue)context;
        }catch (Exception je){
            je.printStackTrace();
        }
    }

    public interface ChangeValue {
        public void change(String s);
    }
}
