package permissionutils;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;

/**
 * Created by Pratik Vyas on 16/11/18.
 */

public class UsagePermission extends Activity {
    PermissionUtils permissionUtils;
    ArrayList<String> permissions = new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        permissionUtils = new PermissionUtils(UsagePermission.this);
        permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
        permissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        permissions.add(Manifest.permission.READ_EXTERNAL_STORAGE);
        permissions.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        runtimePermissionChecker();
    }
    private void runtimePermissionChecker() {
        permissionUtils.check_permission(permissions, "Explain here why the app needs permissions", 1);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        permissionUtils.onRequestPermissionsResult(requestCode,permissions,grantResults);
    }
}
