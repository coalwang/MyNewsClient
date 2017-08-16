package com.example.cola.mynewsclient.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cola.mynewsclient.application.MyApplication;

import java.util.ArrayList;

/**
 * Created by Cola on 2017/8/11.
 */

public class MyViewPagerAdapter extends PagerAdapter {

    private ArrayList<String> tabTittlesArrayList;

    public MyViewPagerAdapter(ArrayList<String> tabTittlesArrayList){
        this.tabTittlesArrayList = tabTittlesArrayList;
    }

    @Override
    public int getCount() {
        return tabTittlesArrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(MyApplication.getMyContext());
        textView.setText(tabTittlesArrayList.get(position));
        textView.setGravity(Gravity.FILL);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTittlesArrayList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}
