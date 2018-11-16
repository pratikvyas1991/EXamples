package com.facerec.tasol.examples;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Pratik Vyas on 14/11/18.
 */

public class SearchAlgoAct extends Activity {
    Button btn_start, btn_stop, btn_start_linear;
    List<String> citiesA, citiesB;
    List<String> temp1, temp2;

    Timer mTimer;
    int count = 0;
    String TAG = "%^%^Search";
    String match = "";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo);
        btn_stop = (Button) findViewById(R.id.btn_stop);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_start_linear = (Button) findViewById(R.id.btn_start_linear);

        populateCities();

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iterate();
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopIteration();
            }
        });

        btn_start_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iterateLinear();
            }
        });
    }

    private void stopIteration() {
        count = 0;
        if (mTimer != null) {
            mTimer.cancel();
        }
    }

    private void iterate() {
        mTimer = new Timer();
        mTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                peformBinarySearching();
            }
        }, 0, 20);
    }

    private void iterateLinear() {
        mTimer = new Timer();
        mTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                performLinearSerch();
            }
        }, 0, 20);
    }

    private void peformBinarySearching() {
        count++;
        if (citiesA != null && citiesA.size() > 0) {
            if (citiesB != null && citiesB.size() > 0) {
                int pos1 = citiesB.size() / 2;
                boolean isAnotherNeeded = true;
                for (String str : citiesA) {
                    for (int i = 0; i < pos1; i++) {
                        if (str.equalsIgnoreCase(citiesB.get(i))) {
                            isAnotherNeeded = false;
                            match = str;
                            break;
                        }
                    }
                    if (isAnotherNeeded) {
                        for (int i = pos1 + 1; i < citiesB.size(); i++) {
                            if (str.equalsIgnoreCase(citiesB.get(i))) {
                                match = str + " second loop";
                                break;
                            }
                        }
                    }
                }
            }
        }
        Log.v(TAG, " Found : " + match);
        Log.v(TAG, " Time  : " + count);
    }

    private void performLinearSerch() {
        count++;
        if (citiesA != null && citiesA.size() > 0) {
            if (citiesB != null && citiesB.size() > 0) {
                boolean isAnotherNeeded = true;
                for (String str : citiesA) {
                    for (int i = 0; i < citiesB.size(); i++) {
                        if (str.equalsIgnoreCase(citiesB.get(i))) {
                            match = str;
                            break;
                        }
                    }
                }
            }
        }
        Log.v(TAG, " Found : " + match);
        Log.v(TAG, " Time  : " + count);
    }

    private void populateCities() {
        citiesA = new ArrayList<>();
        citiesA.add("Ahmedabad");
        citiesA.add("Mumbai");
        citiesA.add("Anand");
        citiesA.add("Baroda");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");
        citiesA.add("Chennai");
        citiesA.add("Banglore");
        citiesA.add("Bhopale");
        citiesA.add("Indore");
        citiesA.add("Ujjain");

        citiesB = new ArrayList<>();
        citiesB.add("Kolkata");

        citiesB.add("Doro Oo");
        citiesB.add("San Jacinto");
        citiesB.add("Rosario");
        citiesB.add("San José El Ídolo");
        citiesB.add("Popova");
        citiesB.add("Hongsihu");
        citiesB.add("Stepanivka");
        citiesB.add("Gorki Vtoryye");
        citiesB.add("North Battleford");
        citiesB.add("Jayapura");
        citiesB.add("Oele");
        citiesB.add("Nevers");
        citiesB.add("Tabuadelo");
        citiesB.add("Yongping");
        citiesB.add("Naples");
        citiesB.add("Churubamba");
        citiesB.add("Bongouanou");
        citiesB.add("Yëlkino");
        citiesB.add("Temeke");
        citiesB.add("Nol");
        citiesB.add("Sorochinsk");
        citiesB.add("Mari");
        citiesB.add("Baş Göynük");
        citiesB.add("Herálec");
        citiesB.add("Independencia");
        citiesB.add("Ajuy");
        citiesB.add("Langnga");
        citiesB.add("Nanterre");
        citiesB.add("Viamão");
        citiesB.add("Quillo");
        citiesB.add("Rosario");
        citiesB.add("Karang Kulon");
        citiesB.add("Niba");
        citiesB.add("Stony Hill");
        citiesB.add("Nueva Germania");
        citiesB.add("Cawayan");
        citiesB.add("Leon");
        citiesB.add("Taboc");
        citiesB.add("Junqueiro");
        citiesB.add("Höfn");
        citiesB.add("Itamaraju");
        citiesB.add("Richmond");
        citiesB.add("Sendai");
        citiesB.add("Ljungby");
        citiesB.add("Iḩsim");
        citiesB.add("Soba");
        citiesB.add("Kassel");
        citiesB.add("Kampong Cham");
        citiesB.add("Puerto Colombia");
        citiesB.add("Emiliano Zapata");
        citiesB.add("urla");
        citiesB.add("Ojo de Agua");
        citiesB.add("Diaofeng");
        citiesB.add("Struga");
        citiesB.add("Baroda");
        citiesB.add("Ghār al Milḩ");
        citiesB.add("Kota Kinabalu");
        citiesB.add("San Lorenzo");
        citiesB.add("Sirājganj");
    }
}
