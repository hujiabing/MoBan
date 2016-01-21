package com.hjb.model.base;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import com.hjb.model.activity.R;
import com.hjb.utils.Tools;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by hjb on 2016/1/13.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSystemBarTint();

    }

    /**
     * 设置沉浸式
     */
    private void setSystemBarTint() {
        //只对api19以上版本有效
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
        }
        //为状态栏着色
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setStatusBarTintResource(R.color.app_blue);
    }

    @TargetApi(19)
    private void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    protected void setTitleTv(String str) {
        Toolbar tool_bar = (Toolbar) findViewById(R.id.tool_bar);
        tool_bar.setTitleTextColor(Tools.getResourcesColor(R.color.whitesmoke));
        tool_bar.setTitle(str);
    }

    protected void setTitleBackgroundColor(int color) {
        Toolbar tool_bar = (Toolbar) findViewById(R.id.tool_bar);
        tool_bar.setBackgroundColor(color);
    }

    protected void set(int color) {
        Toolbar tool_bar = (Toolbar) findViewById(R.id.tool_bar);

    }

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
