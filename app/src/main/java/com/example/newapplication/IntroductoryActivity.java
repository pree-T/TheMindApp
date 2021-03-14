package com.example.newapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import org.jetbrains.annotations.NotNull;

public class IntroductoryActivity extends AppCompatActivity {
    ImageView img;
    LottieAnimationView lottieAnimationView;
    TextView tv;
    private static final int Num_pages=3;
    private ViewPager viewPager;
    private ScreenSlidePagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);
        img=findViewById(R.id.imageView);
        tv=findViewById(R.id.textView);
        lottieAnimationView=findViewById(R.id.lottie);


        viewPager=findViewById(R.id.pager);
        pagerAdapter= new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);



        img.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        tv.animate().translationY(2500).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }
    private static class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{
        public ScreenSlidePagerAdapter(@NonNull @NotNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @NotNull
        @Override
        public Fragment getItem(int position) {
            switch(position)
            {
                case 0:
                    return new OnBoardingFragment1();
                case 1:
                    return new OnBoardingFragment2();
                case 2:
                    return new OnBoardingFragment3();

            }
            return null;
        }

        @Override
        public int getCount() {
            return Num_pages;
        }
    }
}