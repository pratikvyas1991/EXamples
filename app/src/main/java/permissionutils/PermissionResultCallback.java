package permissionutils;

import java.util.ArrayList;

/**
 * Created by Pratik Vyas on 5/11/18.
 */

public interface PermissionResultCallback {
    void PermissionGranted(int request_code);
    void PartialPermissionGranted(int request_code, ArrayList<String> granted_permissions);
    void PermissionDenied(int request_code);
    void NeverAskAgain(int request_code);
}
