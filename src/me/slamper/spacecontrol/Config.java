package me.slamper.spacecontrol;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Config extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}