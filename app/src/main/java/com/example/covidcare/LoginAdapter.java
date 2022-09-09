package com.example.covidcare;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalCount;

    public LoginAdapter(@NonNull FragmentManager fm, Context context,int totalCount) {
        super(fm);
        this.context =context;
        this.totalCount = totalCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LoginFragement loginFragement = new LoginFragement();
                return loginFragement;
            case 1:
                RegistrationFragment registrationFragment = new RegistrationFragment();
                return registrationFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalCount;
    }
}
