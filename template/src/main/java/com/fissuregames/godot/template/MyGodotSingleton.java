package com.fissuregames.godot.template;

import android.util.Log;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;
import org.godotengine.godot.plugin.UsedByGodot;

import java.util.HashSet;
import java.util.Set;

public class MyGodotSingleton extends GodotPlugin {

    public MyGodotSingleton(Godot godot) {
        super(godot);
    }

    @UsedByGodot
    public void sayHello() {
        Log.i("MyGodotPlugin", "Hello from Java!");
        emitSignal("my_signal", 42);
    }

    @NonNull
    @Override
    public Set<SignalInfo> getPluginSignals() {
        Set<SignalInfo> signals = new HashSet<>();
        signals.add(new SignalInfo("my_signal", Integer.class));
        return signals;
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "MyGodotPlugin";
    }
}
