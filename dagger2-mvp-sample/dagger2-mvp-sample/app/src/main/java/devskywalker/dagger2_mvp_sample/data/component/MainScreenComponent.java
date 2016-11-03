package devskywalker.dagger2_mvp_sample.data.component;

import dagger.Component;
import devskywalker.dagger2_mvp_sample.NetComponent;
import devskywalker.dagger2_mvp_sample.mainscreen.MainActivity;
import devskywalker.dagger2_mvp_sample.data.module.MainScreenModule;
import devskywalker.dagger2_mvp_sample.util.CustomScope;

/**
 * Created by devskywalker on 3/11/16.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
