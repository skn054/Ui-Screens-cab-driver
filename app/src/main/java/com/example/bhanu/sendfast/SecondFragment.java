package com.example.bhanu.sendfast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

/**
 * Created by bhanu kiran on 28/07/2016.
 */
public class SecondFragment extends Fragment {
    View myview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myview=inflater.inflate(R.layout.second_layout,container,false);
        GraphView graphView= (GraphView) myview.findViewById(R.id.graph);
        graphView.setTitle("Earnings/Month");
        graphView.setTitleTextSize(45);
        StaticLabelsFormatter labelsFormatter = new StaticLabelsFormatter(graphView);
        labelsFormatter.setHorizontalLabels(new String[]{"Jan","Feb","Mar","April","May","June"});
        labelsFormatter.setVerticalLabels(new String[]{"10K","15K","20K","25K","30K","40K","50K"});
        graphView.getGridLabelRenderer().setLabelFormatter(labelsFormatter);
        BarGraphSeries<DataPoint> barGraphSeries=new BarGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, 1),
                // new DataPoint(0, 3),
                new DataPoint(1, 3),
                new DataPoint(2, 6),
                new DataPoint(3, 7),
                new DataPoint(4, 5),
                new DataPoint(5,8)
        });
        graphView.addSeries(barGraphSeries);
        return myview;
    }
}
