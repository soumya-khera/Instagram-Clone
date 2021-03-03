package com.example.soumyakhera.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iC7h64vZwD3qnQsvmX6FSGlAHrPpLR8vzHqCPbF4")
                .clientKey("dfzpFqtoP1Qnls4HqDyEZ1SMEjPQ5JbPqFLBg0it")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
