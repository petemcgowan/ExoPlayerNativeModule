package com.exoplayernativemodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ExoPlayerModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactContext;

    ExoPlayerModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "ExoPlayerModule";
    }

    // Here is where you can expose methods to React Native.
    // For example, let's expose a method to start playing a track.
    @ReactMethod
    public void playTrack(String url) {
        // implement your ExoPlayer logic here
    }

    // add more methods as required for controlling ExoPlayer
}
