package com.example.whatsapp_clone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("K95BRG6TwiCR1rBPOdOdxtVcnfo3whDTPkRUTTMS")
                // if defined
                .clientKey("DauipdutLkU6U7kmZOt0EtL1s81Y89g89HfTREW8")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
