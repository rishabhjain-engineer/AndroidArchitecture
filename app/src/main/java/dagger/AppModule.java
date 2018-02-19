package dagger;

import android.app.Application;


/**
 * Created by android1 on 19/2/18.
 */

public class AppModule {
    private Application mApplication;

    AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
