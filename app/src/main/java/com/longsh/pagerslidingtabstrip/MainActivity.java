package com.longsh.pagerslidingtabstrip;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import com.longsh.longshlibrary.PagerSlidingTabStrip;

/**
 * Created by q805699513 on 2017/5/16.
 * longshaohua
 */

public class MainActivity extends AppCompatActivity {

    private PagerSlidingTabStrip tabs;
    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;
    private FourFragment fourFragment;
    private FiveFragment fiveFragment;
    private HeiheiFragment heiheiFragment;
    private NoMoreFragment noMoreFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabs.setViewPager(pager);
//        pager.setOffscreenPageLimit(6);
        setTabsValue();
        //设置小红点,item从0开始计算
//        tabs.setMsgToast(1, true);
        tabs.setMsgToast(0, true);
        tabs.setMsgToast(4, true);
        tabs.setMsgToast(6, true);

//        tabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                if (position == 2) {
//                    //第二个取消小红点
//                    tabs.setMsgToast(2, false);
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
    }

    private void setTabsValue() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        // 设置Tab底部选中的指示器Indicator的高度
        tabs.setIndicatorHeight(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2.5f, dm));
        // 设置Tab底部选中的指示器 Indicator的颜色
        tabs.setIndicatorColorResource(R.color.colorPrimary);
        //设置指示器Indicatorin是否跟文本一样宽，默认false
        tabs.setIndicatorinFollowerTv(true);
        //设置小红点提示，item从0开始计算，true为显示，false为隐藏
//        tabs.setMsgToast(2, true);
        //设置红点滑动到当前页面自动消失,默认为true
        tabs.setMsgToastPager(true);
        //设置Tab标题文字的颜色
        //tabs.setTextColor(R.color.***);
        // 设置Tab标题文字的大小
        tabs.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 15, dm));
        // 设置选中的Tab文字的颜色
        tabs.setSelectedTextColorResource(R.color.colorPrimary);
        //设置Tab底部分割线的高度
        tabs.setUnderlineHeight(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1f, dm));
        //设置Tab底部分割线的颜色
        //tabs.setUnderlineColorResource(R.color.colorGray);
        // 设置点击某个Tab时的背景色,设置为0时取消背景色tabs.setTabBackground(0);
//        tabs.setTabBackground(R.drawable.bg_tab);
        tabs.setTabBackground(0);
        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        //     "我的的", "看过我", "新职位", "第四个", "第五个", "嘿嘿", "没有啦"
        private final String[] titles = {"我的的啊啊啊", "看过我", "新职位", "第四个", "第五个的哦", "嘿嘿", "没有啦"};


        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }


        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    if (oneFragment == null) {
                        oneFragment = new OneFragment();
                    }
                    return oneFragment;
                case 1:
                    if (twoFragment == null) {
                        twoFragment = new TwoFragment();
                    }
                    return twoFragment;

                case 2:
                    if (threeFragment == null) {
                        threeFragment = new ThreeFragment();
                    }
                    return threeFragment;
                case 3:
                    if (fourFragment == null) {
                        fourFragment = new FourFragment();
                    }
                    return fourFragment;
                case 4:
                    if (fiveFragment == null) {
                        fiveFragment = new FiveFragment();
                    }
                    return fiveFragment;
                case 5:
                    if (heiheiFragment == null) {
                        heiheiFragment = new HeiheiFragment();
                    }
                    return heiheiFragment;
                case 6:
                    if (noMoreFragment == null) {
                        noMoreFragment = new NoMoreFragment();
                    }
                    return noMoreFragment;
                default:

                    return null;
            }
        }
    }
}
