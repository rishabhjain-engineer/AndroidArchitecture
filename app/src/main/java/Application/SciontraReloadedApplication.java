package Application;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import dagger.ApiComponent;
import dagger.ApiModule;
import dagger.AppModule;
import dagger.DaggerApiComponent;

/**
 * Created by rishabh on 19/2/18.
 */

public class SciontraReloadedApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    public ApiComponent getNetComponent() {
        return mApiComponent;
    }
}
