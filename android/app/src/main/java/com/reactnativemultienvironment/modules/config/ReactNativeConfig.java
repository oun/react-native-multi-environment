package com.reactnativemultienvironment.modules.config;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.reactnativemultienvironment.BuildConfig;

import java.util.HashMap;
import java.util.Map;

public class ReactNativeConfig extends ReactContextBaseJavaModule {
  public ReactNativeConfig(ReactApplicationContext reactApplicationContext) {
    super(reactApplicationContext);
  }

  @Override
  public String getName() {
    return "ReactNativeConfig";
  }

  @Nullable
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put("buildEnvironment", BuildConfig.ENVIRONMENT);
    return constants;
  }
}