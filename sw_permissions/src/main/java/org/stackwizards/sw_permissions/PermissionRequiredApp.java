package org.stackwizards.sw_permissions;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class PermissionRequiredApp extends AppCompatActivity {
    public void getStoragePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            requestPermissions(new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        }
    }

    public void getStoragePermission(List<String> permissions) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            for(String permission : permissions) {
                requestPermissions(new String[]{permission}, 1);
            }
        }
    }
}
