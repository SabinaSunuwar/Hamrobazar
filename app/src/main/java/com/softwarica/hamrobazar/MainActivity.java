package com.softwarica.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.softwarica.hamrobazar.adapter.ViewPagerAdapter;
import com.softwarica.hamrobazar.fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new LoginFragment());

        viewPager.setAdapter(adapter);

    }
}
