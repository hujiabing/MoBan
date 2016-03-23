// Generated code from Butter Knife. Do not modify!
package com.hjb.model.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.hjb.model.activity.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558526, "field 'contentFl'");
    target.contentFl = (android.widget.FrameLayout) view;
    view = finder.findRequiredView(source, 2131558527, "field 'mainTabHost'");
    target.mainTabHost = (android.support.v4.app.FragmentTabHost) view;
    view = finder.findRequiredView(source, 2131558525, "field 'tabFindFragmentTitle'");
    target.tabFindFragmentTitle = (android.support.design.widget.TabLayout) view;
  }

  public static void reset(com.hjb.model.activity.MainActivity target) {
    target.contentFl = null;
    target.mainTabHost = null;
    target.tabFindFragmentTitle = null;
  }
}
