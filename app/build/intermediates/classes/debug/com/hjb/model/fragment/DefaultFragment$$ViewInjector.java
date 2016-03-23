// Generated code from Butter Knife. Do not modify!
package com.hjb.model.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DefaultFragment$$ViewInjector {
  public static void inject(Finder finder, final com.hjb.model.fragment.DefaultFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558535, "field 'photo'");
    target.photo = (uk.co.senab.photoview.PhotoView) view;
  }

  public static void reset(com.hjb.model.fragment.DefaultFragment target) {
    target.photo = null;
  }
}
