package com.example.tabexperiment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    // add an integer member variable and use it in the constructor
    int nNumOfTabs;
    public PagerAdapter( FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.nNumOfTabs = NumOfTabs;
    }
    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default:return null;
        }
    }
    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return nNumOfTabs;
    }
}
