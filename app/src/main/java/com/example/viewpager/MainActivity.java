package com.example.viewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.viewpager.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    int PAGE_INDEX;
    ViewPager viewPager;
    TabLayout tabLayout;
    TestPageAdapter testPageAdapter;

    FragmentOne one;
    FragmentTwo two;
    FragmentThree three;
    FragmentFour four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PAGE_INDEX = 0;

        viewPager = findViewById(R.id.pager);
        testPageAdapter = new TestPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(testPageAdapter);
        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        one = new FragmentOne();
        two = new FragmentTwo();
        three = new FragmentThree();
        four = new FragmentFour();

        // 뷰페이저 페이지 변경 리스너 등록
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.getTabAt(0).setIcon(R.drawable.face_blue);
                tabLayout.getTabAt(1).setIcon(R.drawable.heart_blue);
                tabLayout.getTabAt(2).setIcon(R.drawable.calendar_blue);
                tabLayout.getTabAt(3).setIcon(R.drawable.clock_blue);

                // PAGE_INDEX = position;
                PAGE_INDEX = 0;
                // 페이지 선택 시 이벤트 작성
                switch (position) {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.face_pink);
                        PAGE_INDEX = 0;
                        break;
                    case 1:

                        tabLayout.getTabAt(1).setIcon(R.drawable.heart_pink);
                        // 페이지 번호 갱신
                        PAGE_INDEX = 1;
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.calendar_pink);
                        // 페이지 번호 갱신
                        PAGE_INDEX = 2;
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.clock_pink);
                        // 페이지 번호 갱신
                        PAGE_INDEX = 3;

                        break;

                    default:
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        tabLayout.setupWithViewPager(viewPager);

        // tabLayout 아이콘 설정
        tabLayout.getTabAt(0).setIcon(R.drawable.face_blue);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart_blue);
        tabLayout.getTabAt(2).setIcon(R.drawable.calendar_blue);
        tabLayout.getTabAt(3).setIcon(R.drawable.clock_blue);
    }
    // 페이지 어답터
    public class TestPageAdapter extends FragmentStatePagerAdapter {
        private final int PAGE_NUMBER = 4;

        public TestPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return one;
                case 1:
                    return two;
                case 2:
                    return three;
                case 3:
                    return four;
                default:
                    return null;
            }
        }

        public int getCount() {
            return PAGE_NUMBER;
        }

        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "face";
                case 1:
                    return "heart";
                case 2:
                    return "calendar";
                case 3:
                    return "clock";
                default:
                    return null;
            }
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }

    }
}
