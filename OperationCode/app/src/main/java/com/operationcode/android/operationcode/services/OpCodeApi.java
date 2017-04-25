package com.operationcode.android.operationcode.services;

import android.widget.ArrayAdapter;

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
}
