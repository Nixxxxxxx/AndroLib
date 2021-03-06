package org.stackwizards.androlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import org.stackwizards.sw_dialog.InfoDialog;
import org.stackwizards.sw_resourcerequest.PostRequest;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfoDialog.showCustomDialog(this, R.raw.demo_text);

        PostRequest.JSON_DATA_WEB_CALL(this, new Demo());
    }


}
