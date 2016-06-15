package com.qcy_bracelet.qcy.chartviewdemo.fragment;

import android.app.Fragment;
import android.graphics.PixelFormat;
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
public class MonthFragment extends Fragment {
    private ChartView chartView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().getWindow().setFormat(PixelFormat.TRANSLUCENT);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.month_fragemnt, container, false);
        chartView = (ChartView) view.findViewById(R.id.chartview);
        setViewTwo();
        return view;
    }

    private void setViewTwo() {
        chartView.setYMaxValue(100);
        chartView.setYMinValue(0);
        List<ChartView.ChartData> chartDatas = new ArrayList<>();
        chartDatas.add(new ChartView.ChartData(0.2f, "", "1月"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "2月"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "3月"));
        chartDatas.add(new ChartView.ChartData(0.8f, "", "4月"));
        chartDatas.add(new ChartView.ChartData(1.0f, "", "5月"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "6月"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "7月"));
        chartDatas.add(new ChartView.ChartData(0.6f, "", "8月"));
        chartDatas.add(new ChartView.ChartData(0.8f, "", "9月"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "10月"));
        chartDatas.add(new ChartView.ChartData(0.2f, "", "11月"));
        chartDatas.add(new ChartView.ChartData(0.4f, "", "12月"));
        /*chartDatas.add(new ChartView.ChartData(0.6f, "", "01/14"));
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
        chartDatas.add(new ChartView.ChartData(0.2f, "", "01/31"));*/

        chartView.setData(chartDatas);
        chartView.startChart();
    }
}
