package com.qcy_bracelet.qcy.chartviewdemo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.qcy_bracelet.qcy.chartviewdemo.fragment.DayFragment;
import com.qcy_bracelet.qcy.chartviewdemo.fragment.MonthFragment;
import com.qcy_bracelet.qcy.chartviewdemo.fragment.WeekFragment;

public class MainActivity extends Activity implements View.OnClickListener {


    private TextView day;
    private TextView week;
    private TextView month;
    private DayFragment mDayFragment;
    private WeekFragment mWeekFragment;
    private MonthFragment mMonthFragment;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 隐藏状态栏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        initView();
        setDefaultFragment();

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setDefaultFragment() {
        mFragmentManager = getFragmentManager();
        mTransaction = mFragmentManager.beginTransaction();
        day.setBackground(getResources().getDrawable(R.drawable.text_bg));
        mDayFragment = new DayFragment();
        mTransaction.replace(R.id.frame, mDayFragment);
        mTransaction.commit();
    }

    private void initView() {
        day = (TextView) findViewById(R.id.day);
        week = (TextView) findViewById(R.id.week);
        month = (TextView) findViewById(R.id.month);

        day.setOnClickListener(this);
        week.setOnClickListener(this);
        month.setOnClickListener(this);
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        FragmentManager fragment=getFragmentManager();
        FragmentTransaction transaction=fragment.beginTransaction();
        switch (v.getId()) {
            case R.id.day:
                if (mDayFragment == null) {
                    mDayFragment = new DayFragment();
                }
                month.setBackgroundColor(Color.WHITE);
                week.setBackgroundColor(Color.WHITE);
                day.setBackground(getResources().getDrawable(R.drawable.text_bg));
                transaction.replace(R.id.frame, mDayFragment);
                break;
            case R.id.week:
                if (mWeekFragment == null) {
                    mWeekFragment = new WeekFragment();
                }
                month.setBackgroundColor(Color.WHITE);
                day.setBackgroundColor(Color.WHITE);
                week.setBackground(getResources().getDrawable(R.drawable.text_bg));
                transaction.replace(R.id.frame, mWeekFragment);
                break;
            case R.id.month:
                if (mMonthFragment == null) {
                    mMonthFragment = new MonthFragment();
                }
                week.setBackgroundColor(Color.WHITE);
                day.setBackgroundColor(Color.WHITE);
                month.setBackground(getResources().getDrawable(R.drawable.text_bg));
                transaction.replace(R.id.frame, mMonthFragment);
                break;
        }
        transaction.commit();
    }

}
