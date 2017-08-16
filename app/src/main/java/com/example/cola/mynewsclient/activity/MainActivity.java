package com.example.cola.mynewsclient.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.cola.mynewsclient.R;
import com.example.cola.mynewsclient.fragment.NewsMainFragment;
import com.example.cola.mynewsclient.fragment.PhotoMainFragment;
import com.example.cola.mynewsclient.fragment.SettingMainFragment;
import com.example.cola.mynewsclient.fragment.VideoMainFragment;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Cola on 2017/8/11.
 */

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.main_tool_bar)
    Toolbar mainToolBar;
    @InjectView(R.id.main_bottom_navigation_bar)
    BottomNavigationBar mainBottomNavigationBar;
    private ArrayList<Fragment> fragments;
    private long touchTime = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏ActionBar
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initViews();
    }

    private void initViews(){
        setMainToolBarAttributes();
        setBottomNavigationBarAttributes();

    }

    /**
     * 初始化Fragment
     */
    private ArrayList<Fragment> getFragmentsArrayList(){
        fragments = new ArrayList<>();
        fragments.add(new NewsMainFragment());
        fragments.add(new PhotoMainFragment());
        fragments.add(new VideoMainFragment());
        fragments.add(new SettingMainFragment());
        return fragments;

    }

    /**
     * 设置BottomNavigationBar的相关属性
     */
    private void setBottomNavigationBarAttributes(){

        //设置进入页面的时候的默认Fragment
        getFragmentsArrayList();

        //设置模式（MODE_DEFAULT:如果Item的个数<=3就会使用MODE_FIXED模式，否则使用MODE_SHIFTING模式。MODE_FIXED 是填充模式，未选中的Item会显示文字，没有移位动画。MODE_SHIFTING:
        //移位模式，未选中的Item不会显示文字，选中的会显示文字。在切换的时候会有一个像移位的动画
        mainBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        //设置背景样式（ BACKGROUND_STYLE_STATIC 点击的时候没有水波纹效果，
        // BACKGROUND_STYLE_RIPPLE 点击的时候有水波纹效果，如果设置的Mode为MODE_FIXED，
        // 将使用BACKGROUND_STYLE_STATIC 。如果Mode为MODE_SHIFTING将使用BACKGROUND_STYLE_RIPPLE。）
        mainBottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        mainBottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.ic_launcher,"图片").setActiveColor("#00FF7F")).
                addItem(new BottomNavigationItem(R.mipmap.ic_launcher,"图片").setActiveColor("#00FF7F")).
                addItem(new BottomNavigationItem(R.mipmap.ic_launcher,"图片").setActiveColor("#00FF7F")).
                addItem(new BottomNavigationItem(R.mipmap.ic_launcher,"图片").setActiveColor("#00FF7F")).
                setFirstSelectedPosition(0).
                initialise();
        setDefaultFragment();
        //监听实现方法
        mainBottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                if(fragments != null){
                    if(position < fragments.size()){
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        Fragment willShowFragment = fragments.get(position);
                        fragmentTransaction.replace(R.id.main_frame_layout, willShowFragment);
                        fragmentTransaction.commit();
                    }
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    /**
     * 设置默认选中的的Fragment
     */
    private void setDefaultFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame_layout, new NewsMainFragment());
        fragmentTransaction.commit();
    }

    /**
     * 重写back按键的点击事件
     */
    @Override
    public void onBackPressed() {
        //系统当前时间减去当前按下时间
        //如果大于2000，表示没有很快按下去，只给出提示
        //否则，连续按下，则退出
        long time = System.currentTimeMillis() - touchTime;
        if(time > 2000){
            Toast.makeText(getApplicationContext(), "请再点击一次确认退出", Toast.LENGTH_SHORT).show();
            touchTime = System.currentTimeMillis();
        }else {
            super.onBackPressed();
        }

    }

    /**
     * 设置toolBar相关属性
     */
    private void setMainToolBarAttributes(){
        mainToolBar.setBackgroundColor(Color.TRANSPARENT);
        mainToolBar.setTitleTextColor(Color.BLACK);
        mainToolBar.setTitle("ColaWang");
        mainToolBar.setSubtitle("News");
        mainToolBar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mainToolBar.setNavigationIcon(R.mipmap.ic_launcher);
        //toolBar的菜单点击事件
        mainToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        //setSupportActionBar()这个设置必须在以上设置的后面才能有效果
        setSupportActionBar(mainToolBar);
        //设置NavigationBar的点击事件
        //这个必须放在 setSupportActionBar(mainToolBar);的后面才有效果
        mainToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"点击了ToolBarNavigationIcon", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * toolbar使用的时候，需要重写该方法来设置菜单布局
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tool_bar_menu, menu);
        return true;
    }
}
