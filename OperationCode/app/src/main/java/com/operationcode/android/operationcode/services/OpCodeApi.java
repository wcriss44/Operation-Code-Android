package com.operationcode.android.operationcode.services;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.operationcode.android.operationcode.fragments.Bootcamps;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpCodeApi {
    //private final String SCHOLARSHIP_URL = "";
    private final String CODE_SCHOOL_URL = "https://api.operationcode.org/api/v1/code_schools";

    public OpCodeApi(){

    }
    public void getScholarships(ArrayAdapter<String> items){

        String[] scholarships = {"CodeConf, Los Angeles, June 27-29, 2016",
        "GitMerge, New York City, April 5, 2016",
        "Ruby on Ales, March 31   April 1, 2016",
        "Open Source   Feelings, Seattle, WA, July 22-23, 2016",
        "Node Summit, San Francisco, CA, July 27-28, 2016",
        "Code on the Beach, Atlantic Beach, FL, August 12-14, 2016",
        "360iDev, August 21-24, 2016"};

        for(int i = 0; i < scholarships.length; i++){
            items.add(scholarships[i]);
        }
    }
    public void getBootcamps(ArrayAdapter<String> items){

        new GetMethodDemo().execute(CODE_SCHOOL_URL);
        if (Bootcamps.bootcamps != null){
            try {
                JSONObject json = new JSONObject(Bootcamps.bootcamps);
                for (int i = 0; i < json.getJSONArray("va_approved").length(); i++) {
                    JSONObject object = (JSONObject) json.getJSONArray("va_approved").get(i);
                    items.add(object.getString("name"));
                    items.add(object.getString("url"));
                    items.add(object.getString("address1"));
                    items.add(object.getString("city") + ", " + object.getString("state") + " " + object.getString("zip"));
                    items.add("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
