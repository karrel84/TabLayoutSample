package com.karrel.tablayoutsample.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.karrel.tablayoutsample.view.TabFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rell on 2017. 10. 11..
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> titles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    public void addFragment(TabFragment tabFragment, String title) {
        fragments.add(tabFragment);
        titles.add(title);
        notifyDataSetChanged();
    }
}
