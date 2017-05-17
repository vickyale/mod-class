package com.jcodee.mod1class6.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jcodee.mod1class6.Fragments.FotoFragment;
import com.jcodee.mod1class6.MainActivity;

/**
 * Created by alumno on 16/05/17.
 */

public class FotoAdapter extends FragmentPagerAdapter {
    public FotoAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        FotoFragment fragment = new FotoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("posicion",position);


        return fragment;
    }

    @Override
    public int getCount() {
        return MainActivity.listaFotos.size();
    }
}
