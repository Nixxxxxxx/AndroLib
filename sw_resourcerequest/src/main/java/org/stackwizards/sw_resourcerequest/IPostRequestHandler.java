package org.stackwizards.sw_resourcerequest;

import org.json.JSONArray;

import java.util.Map;

public interface IPostRequestHandler {
    String GetURL();
    Map<String, String> GetPostParams();
    void PreRequest();
    void OnError();
    void OnSuccess(JSONArray jsonArray);

}
