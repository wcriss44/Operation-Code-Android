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
    public void getBootcamps(ArrayAdapter<String> items, RequestQueue queue){
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, CODE_SCHOOL_URL, null,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        System.out.println("made it to response");
                        try {
                            for (int i = 0; i < response.getJSONArray("va_approved").length(); i++) {
                                JSONObject object = (JSONObject) response.getJSONArray("va_approved").get(i);

                            }

                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        Log.d("Response", response.toString());
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println("found and error");
                        Log.d("Error.Response", error.toString());
                    }
                }
        );
        queue.add(getRequest);

        //new GetMethodDemo().execute(CODE_SCHOOL_URL);
    }
}
