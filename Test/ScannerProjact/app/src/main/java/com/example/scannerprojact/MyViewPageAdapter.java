package com.example.scannerprojact;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.scannerprojact.fragment.Page1Fragment;
import com.example.scannerprojact.fragment.Page2Fragment;
import com.example.scannerprojact.fragment.Page3Fragment;

public class MyViewPageAdapter extends FragmentStateAdapter {
    public MyViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Page1Fragment();
            case 1:
                return  new Page2Fragment();
            case 2:
                return new Page3Fragment();
            default:
                return new Page1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
