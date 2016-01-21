package com.hjb.model.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

import com.hjb.model.base.BaseActivity;
import com.hjb.model.fragment.DefaultFragment;
import com.hjb.utils.Tools;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity {

    @InjectView(R.id.content_fl)
    FrameLayout contentFl;
    @InjectView(R.id.main_tab_host)
    FragmentTabHost mainTabHost;

    private Class tabHostFragment[] = {DefaultFragment.class, DefaultFragment.class, DefaultFragment.class};
    private int tabHostImg[] = {R.drawable.tab_1_btn, R.drawable.tab_2_btn, R.drawable.tab_3_btn};
    private String[] tabHostNames = Tools.getStringArray(R.array.main_tab_host);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        setTitleTv("首页");
        init();
    }


    public void init() {
        mainTabHost.setup(this, getSupportFragmentManager(), R.id.content_fl);
        for (int i = 0; i < tabHostFragment.length; i++) {
            //为每一个Tab按钮设置图标、文字和内容
            TabSpec tabSpec = mainTabHost.newTabSpec(tabHostNames[i]).setIndicator(getTabItemView(i));
            //将Tab按钮添加进Tab选项卡中
            mainTabHost.addTab(tabSpec, tabHostFragment[i], null);
            TabWidget tabWidget = mainTabHost.getTabWidget();
            tabWidget.setGravity(Gravity.CENTER_VERTICAL);
            tabWidget.setDividerDrawable(null);
            //可设置Tab区域的背景
//            mainTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.选择器);
        }
    }

    private View getTabItemView(int index) {
        View view = Tools.inflate(R.layout.main_tab_item);
        ImageView tabimg = (ImageView) view.findViewById(R.id.tab_img);
        TextView tabtv = (TextView) view.findViewById(R.id.tab_tv);
        tabimg.setImageResource(tabHostImg[index]);
        tabtv.setText(tabHostNames[index]);
        return view;
    }

}
