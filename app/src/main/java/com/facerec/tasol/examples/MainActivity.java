package com.facerec.tasol.examples;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentA.ChangeValue {
    FragmentA fragmentA;
    FragmentB fragmentB;
    private static String TAG = "%%%ACtivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.message_fragment, fragmentA);
        transaction.add(R.id.send_fragment, fragmentB);

        transaction.commit();

    }


    @Override
    public void change(String s) {
        if(fragmentB ==null){
            fragmentB = new FragmentB();
        }
        fragmentB.updateValue(s);
    }

    public void openFragmentC(Fragment fragment){
        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.send_fragment, fragment);
        transaction.commit();
    }

}
