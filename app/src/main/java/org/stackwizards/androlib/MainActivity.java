package org.stackwizards.androlib;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements FilterInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfoDialog.showCustomDialog(this, R.raw.demo_text);
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public View getView() {
        return findViewById(android.R.id.content);
    }

    @Override
    public void filterPositionAndCity(IDataAdapter gda) {

    }
}
