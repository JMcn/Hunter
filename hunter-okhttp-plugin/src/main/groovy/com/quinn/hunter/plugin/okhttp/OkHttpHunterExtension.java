package com.quinn.hunter.plugin.okhttp;

import com.quinn.hunter.transform.RunVariant;

/**
 * Created by Quinn on 07/10/2018.
 */
public class OkHttpHunterExtension {

    public RunVariant runVariant = RunVariant.ALWAYS;

    @Override
    public String toString() {
        return "OkHttpHunterExtension{" +
                "runVariant=" + runVariant +
                '}';
    }
}
