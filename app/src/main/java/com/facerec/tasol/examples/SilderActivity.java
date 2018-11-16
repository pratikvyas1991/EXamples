package com.facerec.tasol.examples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by tasol on 15/10/18.
 */

public class SilderActivity extends Activity {
    Button mBtnSlider,btn_mirror,btn_switch,btn_switch_scale,btn_vp;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        mBtnSlider = (Button)findViewById(R.id.btn_slider);
        btn_mirror = (Button)findViewById(R.id.btn_mirror);
        btn_switch = (Button)findViewById(R.id.btn_switch);
        btn_switch_scale = (Button)findViewById(R.id.btn_switch_scale);
        btn_vp = (Button)findViewById(R.id.btn_vp);


        mBtnSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SilderActivity.this,SingleTouchImageViewActivity.class));
            }
        });

        btn_mirror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SilderActivity.this,MirroringExampleActivity.class));
            }
        });
        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SilderActivity.this,SwitchImageExampleActivity.class));
            }
        });
        btn_switch_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SilderActivity.this,SwitchScaleTypeExampleActivity.class));
            }
        });
        btn_vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SilderActivity.this,ViewPagerExampleActivity.class));
            }
        });
    }
}
