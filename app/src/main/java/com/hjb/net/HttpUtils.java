package com.hjb.net;

import com.hjb.model.application.MyApplication;
import com.squareup.okhttp.OkHttpClient;

/**
 * 作者:  hjb
 * 时间: 2016/1/21.
 * 网络请求
 */
public class HttpUtils {

    /**
     * 请求失败:服务器错误
     */
    public static final int ERROR_SERVER = 500;

    /**
     * 请求失败:URL 无效
     */
    public static final int ERROR_URL = 404;
    /**
     * 请求失败: 请求无法理解
     */
    public static final int ERROR_REQUEST = 400;

    /**
     * 请求失败:服务器没有响应
     */
    public static final int ERROR_RESNPONSE = 0;

    /**
     * 请求失败:服务器请求 返回 false
     */
    public static final int ERROR_FALSE = 222;
    /**
     * 请求失败:服务器请求 返回 不是json
     */
    public static final int ERROR_DATA = 333;
    /**
     * 请求失败:网络不可用
     */
    public static final int ERROR_NETWORK = 444;

    public static OkHttpClient client = new OkHttpClient();

    private static boolean inHome;
    public static void post(){

    }

}
