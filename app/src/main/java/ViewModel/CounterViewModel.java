package ViewModel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by rishabh on 19/2/18.
 */

public class CounterViewModel extends ViewModel {

    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
