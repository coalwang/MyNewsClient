package com.example.cola.mynewsclient.api;

import com.example.cola.mynewsclient.bean.NewsMainFirstBean;
import com.example.cola.mynewsclient.bean.NewsMainFirstDescribeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Cola on 2017/8/15.
 * 管理api的接口
 */

public interface NewMainFirstApi {

    /**
     * 获取最新的新闻列表
     * @return
     */
    @GET("api/4/news/latest")
    Observable<NewsMainFirstBean> getLatestNews();

    /**
     * 根据id获取某一条新闻的详细内容
     * @param id
     * @return
     */
    @GET("api/4/news/{id}")
    Observable<NewsMainFirstDescribeBean> getDescribeNews(@Path("id") String id);
}
