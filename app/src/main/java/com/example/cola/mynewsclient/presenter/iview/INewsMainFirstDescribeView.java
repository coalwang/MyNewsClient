package com.example.cola.mynewsclient.presenter.iview;

import com.example.cola.mynewsclient.bean.NewsMainFirstDescribeBean;

/**
 * Created by Cola on 2017/8/15.
 */

public interface INewsMainFirstDescribeView {

    /**
     * 视图逻辑，给布局中的各个控件绑定数据
     * @param newsMainFirstDescribeBean
     */
    void showDesccribeData(NewsMainFirstDescribeBean newsMainFirstDescribeBean);
}
