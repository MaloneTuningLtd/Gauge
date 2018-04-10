package de.nitri.gaugedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.nitri.gauge.Gauge;

public class DualGaugeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dual_gauge);

        final Gauge gaugeBack = findViewById(R.id.gauge_back);
        final Gauge gaugeFront = findViewById(R.id.gauge_front);

        gaugeBack.moveToValue(3);
        gaugeFront.moveToValue(5);
    }
}
