package com.qcy_bracelet.qcy.chartviewdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qcy_bracelet.qcy.chartviewdemo.R;
import com.qcy_bracelet.qcy.chartviewdemo.chart.CharterLine;
import com.qcy_bracelet.qcy.chartviewdemo.chart.CharterXLabels;
import com.qcy_bracelet.qcy.chartviewdemo.chart.CharterYLabels;
import com.qcy_bracelet.qcy.chartviewdemo.views.ChartView;

/**
 * Created by Kevin on 2016/6/13.
 * Email：1026karma@gmail.com
 * Github：karmalove
 */
public class WeekFragment extends Fragment {
    private ChartView chartView;
    private CharterXLabels mCharterLineXLabel;
    private CharterYLabels mCharterLineYLabel2;
    private CharterLine mCharterLine;
    private String[] valuesY = new String[]{"优秀", "一般", "良好", "非常", "差劣", "超级"};

    private String[] valueX = new String[]{"1周", "2周", "3周", "4周", "5周", "6周", "7周", "8周", "9周", "10周", "11周", "12周", "13周", "14周", "15周", "16周", "17周", "18周", "19周", "20周", "21周", "22周", "23周", "24周", "25周", "26周", "27周", "28周", "29周", "30周", "31周"};

    private float[] value = new float[]{0, 5, 3, 1, 4, 3, 2, 3, 4, 3, 1, 4, 3, 6, 2, 4, 3, 1, 4, 3, 5, 1, 4, 3, 1, 4, 3, 0, 4, 4, 3, 1, 4, 3, 0};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.week_fragment, container, false);
        //chartView = (ChartView) view.findViewById(R.id.chartview);
        mCharterLineXLabel=(CharterXLabels) view.findViewById(R.id.charter_line_XLabel);
        mCharterLineYLabel2=(CharterYLabels)view.findViewById(R.id.charter_line_YLabel2);
        mCharterLine=(CharterLine)view.findViewById(R.id.charter_line);
        setViewOne();
        //setViewTwo();
        return view;
    }

   /* private void setViewTwo() {
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
    }*/

    private void setViewOne() {
        mCharterLineXLabel.setStickyEdges(true);
        mCharterLineXLabel.setValues(valueX);
        mCharterLineYLabel2.setValues(valuesY);
        mCharterLineYLabel2.setStickyEdges(true);
        mCharterLine.setValues(value);

    }
}
