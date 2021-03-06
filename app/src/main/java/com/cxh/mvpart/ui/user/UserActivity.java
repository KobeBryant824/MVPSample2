package com.cxh.mvpart.ui.user;

import android.widget.FrameLayout;

import com.cxh.mvpart.R;
import com.cxh.mvpart.base.BaseActivity;
import com.cxh.mvpart.util.ActivityUtils;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * @author Hai (haigod7[at]gmail[dot]com)
 *         2017/3/6
 */
public class UserActivity extends BaseActivity {

    @BindView(R.id.content)
    FrameLayout mContent;
    @Inject
    UserFragment mUserFragment;

    @Override
    public int getLayoutID() {
        return R.layout.activity_user;
    }

    @Override
    protected void refreshState() {

    }

    @Override
    protected void initViewsAndEvents() {
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mUserFragment, R.id.content);
    }

}
