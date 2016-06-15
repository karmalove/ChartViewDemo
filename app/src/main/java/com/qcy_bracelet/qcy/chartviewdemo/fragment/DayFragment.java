package com.qcy_bracelet.qcy.chartviewdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qcy_bracelet.qcy.chartviewdemo.R;
import com.qcy_bracelet.qcy.chartviewdemo.views.ChartView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2016/6/13.
 * Email：1026karma@gmail.com
 * Github：karmalove
 */
public class DayFragment extends Fragment {
    private ChartView chartView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.day_fragment, container, false);
        chartView = (ChartView) view.findViewById(R.id.chartview);
        setViewTwo();
        return view;
    }

    private void setViewTwo() {
        chartView.setYMaxValue(100);
        chartView.setYMinValue(0);
        List<ChartView.ChartData> chartDatas = new ArrayList<>();
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/01"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "01/02"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "01/03"));
        chartDatas.add(new ChartView.ChartData(0.8f, "", "01/04"));
        chartDatas.add(new ChartView.ChartData(1.0f, "", "01/05"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/06"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "01/07"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "01/08"));
        chartDatas.add(new ChartView.ChartData(0.8f, "", "01/10"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/11"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/12"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "01/13"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "01/14"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/15"));
        chartDatas.add(new ChartView.ChartData(0.0f, "", "01/16"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/17"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "01/18"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "01/19"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/20"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/21"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/22"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "01/23"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "01/24"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/25"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/26"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/27"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "01/28"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "01/29"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/30"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/31"));

        chartView.setData(chartDatas);
        chartView.startChart();
    }
}
