package com.example.cola.mynewsclient.presenter.iview;

import com.example.cola.mynewsclient.bean.NewsMainFirstBean;

/**
 * Created by Cola on 2017/8/15.
 */

public interface INewsMainFirstFragmentView {

    /**
     * 接口中的方法默认是public或者是abstract，可以省略
     * @param newsMainFirstBean
     * 视图逻辑，给布局中的各个控件绑定数据
     */
     void showData(NewsMainFirstBean newsMainFirstBean);
}
