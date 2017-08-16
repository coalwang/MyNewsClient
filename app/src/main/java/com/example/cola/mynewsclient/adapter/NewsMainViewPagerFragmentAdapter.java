package com.example.cola.mynewsclient.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Cola on 2017/8/13.
 */

public class NewsMainViewPagerFragmentAdapter extends FragmentPagerAdapter{

    private ArrayList<String> tabTittlesArrayList;
    private ArrayList<Fragment> fragmentsArrayList;

    public NewsMainViewPagerFragmentAdapter(FragmentManager fm, ArrayList<String> tabTittlesArrayList
            , ArrayList<Fragment> fragmentsArrayList) {
        super(fm);
        this.tabTittlesArrayList = tabTittlesArrayList;
        this.fragmentsArrayList = fragmentsArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsArrayList.get(position);
    }

    @Override
    public int getCount() {
        return tabTittlesArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
         return tabTittlesArrayList.get(position);
    }
}
