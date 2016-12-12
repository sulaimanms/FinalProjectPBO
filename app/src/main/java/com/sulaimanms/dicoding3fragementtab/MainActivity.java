package com.sulaimanms.dicoding3fragementtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sulaimanms.dicoding3fragementtab.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Luas");

        //inisiasi tab and pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set objek adapter ke dalam viewpager
        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //set textcolor pd tab
        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark), getResources().getColor(android.R.color.white));
        //set tab ke viewpager
        tabs.setupWithViewPager(pager);
        //agar tab berafa di posisi yg proposional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
