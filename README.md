# PagerSlidingTabStrip

一款android指示器TabLayout、PagerSlidingTabStrip，仿Boss直聘，带有红点未读提示
---

# Example

<image src="https://github.com/q805699513/PagerSlidingTabStrip/blob/master/image/no1.gif?raw=true" width="300px"/> <image src="https://github.com/q805699513/PagerSlidingTabStrip/blob/master/image/no2.gif?raw=true" width="300px"/>  
<image src="https://github.com/q805699513/PagerSlidingTabStrip/blob/master/image/no3.png?raw=true" width="300px"/>  <image src="https://github.com/q805699513/PagerSlidingTabStrip/blob/master/image/no4.png?raw=true" width="300px"/>
<image src="https://github.com/q805699513/PagerSlidingTabStrip/blob/master/image/no5.png?raw=true" width="300px"/>
---

# Usage

### Gradle

```groovy
dependencies {
 compile 'com.longsh:PagerSlidingTabStrip:1.0.0' 
}

```



### 使用
```java
    ViewPager pager = (ViewPager) findViewById(R.id.pager);
    tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
    pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    tabs.setViewPager(pager);
    //pager.setOffscreenPageLimit(6);
    //设置参数
    setTabsValue();
    
     //例：设置第三个tab小红点显示，item从0开始计算，true为显示，false为隐藏，默认为全部隐藏
      //tabs.setMsgToast(2, true);
      
    //MyPagerAdapter为普通的FragmentPagerAdapter
    public class MyPagerAdapter extends FragmentPagerAdapter {...略}
    
```

### 设置参数setTabsValue();
```java
    private void setTabsValue() {
          DisplayMetrics dm = getResources().getDisplayMetrics();
          // 设置Tab底部选中的指示器Indicator的高度
          tabs.setIndicatorHeight(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2.5f, dm));
          // 设置Tab底部选中的指示器 Indicator的颜色
          tabs.setIndicatorColorResource(R.color.colorPrimary);
          //设置指示器Indicatorin是否跟文本一样宽，默认false
          tabs.setIndicatorinFollowerTv(false);
          //设置小红点提示，item从0开始计算，true为显示，false为隐藏，默认为全部隐藏
      //    tabs.setMsgToast(2, true);
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
```

###  XML布局代码
```java
 <com.longsh.longshlibrary.PagerSlidingTabStrip
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        />
        
    <android.support.v4.view.ViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

###  如果你需要监听viewpager的滑动状态setOnPageChangeListener
```java
    tabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
           //if (position == 2) {
                //手动隐藏第二个小红点，tabs.setMsgToastPager(false);该方法为false时才需要手动隐藏。
                //tabs.setMsgToast(2, false);
           //}
        }
        
        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });
```


###  使用参考类
[使用参考类](https://github.com/q805699513/PagerSlidingTabStrip/blob/master/app/src/main/java/com/longsh/pagerslidingtabstrip/MainActivity.java)

### Version: 1.0.0

  有其他需求可以给我提Issues，喜欢可以给个star，鼓励作者更新0.0
  
  
## License
```text

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```



