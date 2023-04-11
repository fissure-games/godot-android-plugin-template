package com.fissuregames.godot.template;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;

public class MyGodotSingleton extends GodotPlugin {

    public MyGodotSingleton(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "MyGodotPlugin";
    }
}
