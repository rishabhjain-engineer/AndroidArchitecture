package dagger;

/**
 * Created by android1 on 19/2/18.
 */

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Belal on 12/2/2017.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    //void inject(MainActivity activity);
}
