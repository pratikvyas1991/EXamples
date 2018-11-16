package networking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Pratik Vyas on 16/11/18.
 */

public class UsageNet extends Activity {
    private SOService mService;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        mService = ApiUtils.getSOService();

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(Constants.TASK, Constants.TASK_POSTSCORE_BOARD);
            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("name", "");
            jsonObject1.put("email", "");
            jsonObject1.put("score", "");
            jsonObject.put(Constants.TASKDATA, jsonObject1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mService.addScore(jsonObject).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.body() != null) {
                    String json = "";
                    try {
                        json = response.body().string();

                        Log.v("", "onResponse: " + json);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.v("", "" + t.getMessage());
            }
        });
    }
}
