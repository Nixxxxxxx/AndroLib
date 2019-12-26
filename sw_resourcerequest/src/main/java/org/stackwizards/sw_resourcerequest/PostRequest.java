package org.stackwizards.sw_resourcerequest;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class PostRequest {

    public static void JSON_DATA_WEB_CALL(Context appContext, final IPostRequestHandler handler) {
        handler.PreRequest();
        String GET_JSON_DATA_HTTP_URL = handler.GetURL();

        RequestQueue queue = Volley.newRequestQueue(appContext);

        StringRequest postRequest = new StringRequest(com.android.volley.Request.Method.POST, GET_JSON_DATA_HTTP_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            Log.d("Response", response);
                            handler.OnSuccess(jsonArray);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.d("Response", "failed: " + response);
                            handler.OnError();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", error.toString());
                        handler.OnError();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                return handler.GetPostParams();
            }
        };
        queue.add(postRequest);
    }

}
