package com.example.cola.mynewsclient.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cola.mynewsclient.R;
import com.example.cola.mynewsclient.adapter.NewsMainViewPagerFragmentAdapter;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Cola on 2017/8/13.
 */

public class NewsMainFragment extends Fragment {

    @InjectView(R.id.news_main_fragment_view_tab_layout)
    TabLayout newMainFragmentViewTabLayout;
    @InjectView(R.id.news_main_fragment_view_view_pager)
    ViewPager newsMainFragmentViewViewPager;

    private ArrayList<String> tabTittlesArrayList;
    private ArrayList<Fragment> fragmentArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTabTittlesAndFragments();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.news_main_frament_view, null);
        ButterKnife.inject(this ,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        newMainFragmentViewTabLayout.setTabMode(TabLayout.MODE_FIXED);
        NewsMainViewPagerFragmentAdapter viewPagerFragmentAdapter = new NewsMainViewPagerFragmentAdapter(getFragmentManager(),
                tabTittlesArrayList,fragmentArrayList);
        newsMainFragmentViewViewPager.setAdapter(viewPagerFragmentAdapter);
        newMainFragmentViewTabLayout.setupWithViewPager(newsMainFragmentViewViewPager);
    }

    private void getTabTittlesAndFragments(){
        tabTittlesArrayList = new ArrayList<>();
        tabTittlesArrayList.add("热点");
        tabTittlesArrayList.add("热点");
        tabTittlesArrayList.add("热点");
        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new NewsOneFragment());
        fragmentArrayList.add(new NewsTwoFragment());
        fragmentArrayList.add(new NewsThreeFragment());
    }
}
