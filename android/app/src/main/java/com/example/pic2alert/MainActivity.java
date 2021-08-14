package com.example.medicine_reminder;

import android.os.Bundle;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    GeneratedPluginRegistrant.registerWith(this);
//  }

  @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
            GeneratedPluginRegistrant.registerWith(flutterEngine);
//            new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
//                            .setMethodCallHandler(
//                                (call, result) -> {
//                                 // GeneratedPluginRegistrant.registerWith(this);
//                                     // Your existing code
//                                      }
//                            );
        }
}

