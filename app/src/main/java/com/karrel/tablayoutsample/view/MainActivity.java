package com.karrel.tablayoutsample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.karrel.tablayoutsample.R;
import com.karrel.tablayoutsample.databinding.ActivityMainBinding;
import com.karrel.tablayoutsample.presenter.MainPresenter;
import com.karrel.tablayoutsample.presenter.MainPresenterImpl;
import com.karrel.tablayoutsample.view.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainPresenter presenter;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        presenter = new MainPresenterImpl();

        setupViewPager();
    }

    private void setupViewPager() {

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(TabFragment.newInstance("hello", "nice"), "hello");
        adapter.addFragment(TabFragment.newInstance("hello", "nice"), "hello2");
        adapter.addFragment(TabFragment.newInstance("hello", "nice"), "hello3");
        adapter.addFragment(TabFragment.newInstance("hello", "nice"), "hello4");
        adapter.addFragment(TabFragment.newInstance("hello", "nice"), "hello5");

        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
}
