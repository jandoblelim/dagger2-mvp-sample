package devskywalker.dagger2_mvp_sample.mainscreen;

import java.util.List;

import devskywalker.dagger2_mvp_sample.Post;

/**
 * Created by devskywalker on 3/11/16.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
