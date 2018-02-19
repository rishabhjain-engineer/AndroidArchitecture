package reloaded.sciontra.hs.com.sciontrareloaded.application;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by rishabh on 19/2/18.
 */

public class SciontraReloadedApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if(LeakCanary.isInAnalyzerProcess(this)){
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
