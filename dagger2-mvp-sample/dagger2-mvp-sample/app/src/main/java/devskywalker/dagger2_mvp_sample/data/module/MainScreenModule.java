package devskywalker.dagger2_mvp_sample.data.module;

import dagger.Module;
import dagger.Provides;
import devskywalker.dagger2_mvp_sample.mainscreen.MainScreenContract;
import devskywalker.dagger2_mvp_sample.util.CustomScope;

/**
 * Created by devskywalker on 3/11/16.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
