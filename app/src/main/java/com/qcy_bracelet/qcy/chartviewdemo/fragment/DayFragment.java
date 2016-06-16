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
public class DayFragment extends Fragment {
    private ChartView chartView;
    private CharterXLabels mCharterLineXLabel;
    private CharterYLabels  mCharterLineYLabel2;
    private CharterLine mCharterLine;
    private String[] valuesY = new String[]{"优秀", "一般", "良好", "非常", "差劣", "超级"};

    private String[] valueX = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

    private float[] value = new float[]{0, 5, 3, 1, 4, 3, 2, 3, 4, 3, 1, 4, 3, 6, 2, 4, 3, 1, 4, 3, 5, 1, 4, 3, 1, 4, 3, 0, 4, 4, 3, 1, 4, 3, 0};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.day_fragment, container, false);
        //chartView = (ChartView) view.findViewById(R.id.chartview);
        //setViewTwo();
        mCharterLineXLabel=(CharterXLabels) view.findViewById(R.id.charter_line_XLabel);
        mCharterLineYLabel2=(CharterYLabels)view.findViewById(R.id.charter_line_YLabel2);
        mCharterLine=(CharterLine)view.findViewById(R.id.charter_line);
        setViewOne();
        return view;
    }

   /* private void setViewTwo() {
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
    }*/
   private void setViewOne() {
       mCharterLineXLabel.setStickyEdges(true);
       mCharterLineXLabel.setValues(valueX);
       mCharterLineYLabel2.setValues(valuesY);
       mCharterLineYLabel2.setStickyEdges(true);
       mCharterLine.setValues(value);

   }

}
