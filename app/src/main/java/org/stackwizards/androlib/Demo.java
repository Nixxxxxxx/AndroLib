package org.stackwizards.androlib;

import android.util.Log;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.stackwizards.sw_resourcerequest.IPostRequestHandler;
import java.util.HashMap;
import java.util.Map;

public class Demo implements IPostRequestHandler {
    @Override
    public String GetURL() {
        return "http://stackwizards.org/event/getevent.php";
    }

    @Override
    public Map<String, String> GetPostParams() {
        Map<String, String> params = new HashMap<String, String>();
        return params;
    }

    @Override
    public void PreRequest() {

    }

    @Override
    public void OnError() {

    }

    @Override
    public void OnSuccess(JSONArray jsonArray) {
        Gson gson = new Gson();
        Eventin[] events = gson.fromJson(jsonArray.toString(), Eventin[].class);
        for (int i = 0; i < events.length; i++) {
            Log.i("POSTREQUEST", events[i].title + " xzxxzx " + events[i].id);
        }
    }
}
