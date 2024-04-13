package io.fairyproject.library;

import io.fairyproject.FairyLaunch;
import io.fairyproject.log.Log;
import io.fairyproject.plugin.Plugin;

@FairyLaunch
public class FairyLibPlugin extends Plugin {

    @Override
    public void onPluginEnable() {
        Log.info("Fairy Lib Plugin enabled.");
    }

}
