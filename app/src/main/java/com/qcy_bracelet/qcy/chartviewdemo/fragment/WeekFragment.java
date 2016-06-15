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
public class WeekFragment extends Fragment {
    private ChartView chartView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.week_fragment, container, false);
        chartView = (ChartView) view.findViewById(R.id.chartview);
        setViewTwo();
        return view;
    }

    private void setViewTwo() {
        chartView.setYMaxValue(100);
        chartView.setYMinValue(0);
        List<ChartView.ChartData> chartDatas = new ArrayList<>();
        chartDatas.add(new ChartView.ChartData(0.2f, "", "1周"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "2周"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "3周"));
        chartDatas.add(new ChartView.ChartData(0.8f, "", "4周"));
        chartDatas.add(new ChartView.ChartData(1.0f, "", "5周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "6周"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "7周"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "8周"));
        chartDatas.add(new ChartView.ChartData(0.8f, "", "9周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "10周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "11周"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "12周"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "13周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "14周"));
        chartDatas.add(new ChartView.ChartData(0.0f, "", "15周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "16周"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "17周"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "18周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "19周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "20周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "21周"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "22周"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "23周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "24周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "25周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "26周"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "27周"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "28周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "29周"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "30周"));

        chartView.setData(chartDatas);
        chartView.startChart();
    }
}
