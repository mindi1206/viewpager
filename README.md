# ViewPager
![image](https://user-images.githubusercontent.com/33975923/77199017-78a3fc00-6b2b-11ea-80ba-2fb7fc2f68de.gif)
* 카카오톡의 스와이프 메뉴 하단.ver
* viewpager, tablayout
* gradle 의 library dependency, sdk버전을 꼭 확인하세요

* .java 파일의 import에 따라 레이아웃 태그가 달라져요
```java
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentManager;
    import androidx.fragment.app.FragmentStatePagerAdapter;
    import androidx.viewpager.widget.ViewPager;
```
일 경우 레이아웃 파일은
```xml
<androidx.viewpager.widget.ViewPager
    android:id="@+id/pager"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    />
<com.google.android.material.tabs.TabLayout
    android:id="@+id/tab"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_alignParentBottom="true"

    app:tabIndicatorColor="#EB8C97"
    app:tabIndicatorHeight="3dp"
    app:tabSelectedTextColor="#EB8C97"
    app:tabTextColor="#87CEEB" />
    
```

```java
    import android.support.design.widget.TabLayout;
    import android.support.v4.app.Fragment;
    import android.support.v4.app.FragmentManager;
    import android.support.v4.app.FragmentStatePagerAdapter;
    import android.support.v4.app.*;
    import android.support.v4.view.ViewPager;
    import android.support.v7.app.AppCompatActivity;
```
일 경우 레이아웃 파일은

```xml
 <android.support.v4.view.ViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />

    <android.support.design.widget.TabLayout
        android:id="@+id/tab"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_gravity="bottom"
        app:tabIndicatorColor="#ffcc00"
        app:tabIndicatorHeight="3dp"
        app:tabSelectedTextColor="#ffcc00"
        app:tabTextColor="#87CEEB" />
```
이 됩니다.


