package com.hjb.model.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.hjb.model.activity.R;
import com.hjb.utils.Tools;

/**
 * Created by hjb on 2016/1/13.
 */
public class DefaultFragment extends Fragment {

    private View view;
    private WebView webview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(Tools.getContext(), R.layout.fragment_defult, null);
        webview = (WebView) view.findViewById(R.id.webView);
//        webview.setInitialScale(1);
        webview.setWebViewClient(new webViewClient());

//        WebSettings mSettings = webview.getSettings();
//        mSettings.setUseWideViewPort(true);//web1就是你自己定义的窗口对象。
//        mSettings.setLoadWithOverviewMode(true);
//        mSettings.setJavaScriptEnabled(true);
//        mSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//        mSettings.setAppCacheEnabled(false);
//        // mSettings.setLayoutAlgorithm(LayoutAlgorithm.NORMAL);
//        mSettings.setBuiltInZoomControls(false);
//        mSettings.setUseWideViewPort(true);
//        boolean bo = NetWorkUtil.isNetworkAvailable(this);
//        if (bo) {
            webview.loadUrl("http://www.baidu.com");
//        } else {
//            ToastUtil.longShowToast("联网失败，请检查您的网络连接");
//        }
        return view;
    }
    class webViewClient extends WebViewClient {

        //重写shouldOverrideUrlLoading方法，使点击链接后不使用其他的浏览器打开。

        @Override

        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);

            //如果不需要其他对点击链接事件的处理返回true，否则返回false

            return true;

        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
