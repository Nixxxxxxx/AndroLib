package org.stackwizards.sw_resourcerequest;

import android.content.Context;
import android.util.Log;
import android.view.View;

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

    public static void JSON_DATA_WEB_CALL(Context appContext) {
//        progressBar.setVisibility(View.VISIBLE);

        String GET_JSON_DATA_HTTP_URL = "http://stackwizards.org/event/getevent.php";

        RequestQueue queue = Volley.newRequestQueue(appContext);

        StringRequest postRequest = new StringRequest(com.android.volley.Request.Method.POST, GET_JSON_DATA_HTTP_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // response
//                        Log.d("Response", response);
//                        progressBar.setVisibility(View.GONE);
                        try {
                            JSONArray jlist = new JSONArray(response);
//                            JSON_PARSE_DATA_AFTER_WEBCALL(jlist);
                            Log.d("Response", response);
//                          WHAT TODO ON SUCCESS
                        } catch (JSONException e) {
                            e.printStackTrace();
//                            GetDataAdapter1.clear();
//                            viewPager.setAdapter(new CustomPagerAdapter(MainActivity.this, GetDataAdapter1));
//                            baseLogo.setImageResource(R.drawable.no_result);
//                            baseLogo.setVisibility(View.VISIBLE);
                            Log.d("Response", "failed: " + response);

                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.d("Error.Response", error.toString());
//                        Toast.makeText(MainActivity.this, "Data Retrieval failed,\nTimeout error" +
//                                "Check your internet connection \nTrying again with default filter automatically", Toast.LENGTH_LONG).show();
//                        JSON_DATA_WEB_CALL("", "");
//                        progressBar.setVisibility(View.GONE);

//                        reload.setVisibility(View.VISIBLE);

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                //add your parameters here as key-value pairs
//                params.put("title", title);
////
//                if(!start.equals("null")) {
//                    params.put("edate", start);
//                }
//                params.put("country", country);
//                params.put("company", company);

                return params;
            }
        };
        queue.add(postRequest);
    }

}
