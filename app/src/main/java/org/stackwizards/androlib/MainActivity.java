package org.stackwizards.androlib;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;



import org.json.JSONArray;
import org.json.JSONException;
import org.stackwizards.sw_dialog.InfoDialog;
import org.stackwizards.sw_resourcerequest.PostRequest;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        InfoDialog.showCustomDialog(this, R.raw.demo_text);

        PostRequest.JSON_DATA_WEB_CALL(this);
    }




}
