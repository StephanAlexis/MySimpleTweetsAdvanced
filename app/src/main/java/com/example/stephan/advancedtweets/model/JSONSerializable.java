package com.example.stephan.advancedtweets.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by stephan  .
 */

public interface JSONSerializable {
    void configureFromJSON(JSONObject jsonObject) throws JSONException;
}
