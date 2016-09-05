package com.example.bhanu.navdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.GraphViewXML;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by bhanu kiran on 27/07/2016.
 */
public class FirstFragment extends Fragment
{

    View myview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.first_layout,container,false);
       GraphView graphView= (GraphView) myview.findViewById(R.id.graph);
        graphView.setTitle("Earnings/Day");
        graphView.setTitleTextSize(40);
        StaticLabelsFormatter labelsFormatter = new StaticLabelsFormatter(graphView);
        labelsFormatter.setHorizontalLabels(new String[]{"Mon","Tue","Wed","Thur","Fri","Today"});
        labelsFormatter.setVerticalLabels(new String[]{"1000","1500","2000","2500","3000","4000","5000"});
        graphView.getGridLabelRenderer().setLabelFormatter(labelsFormatter);
       LineGraphSeries<DataPoint> series=new LineGraphSeries<DataPoint>(new DataPoint[]{ new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(1.5, 3),
                new DataPoint(2, 2),
                new DataPoint(2.5, 6),
       new DataPoint(3,5),
       new DataPoint(3.5,7),
       new DataPoint(4,8)});
        graphView.addSeries(series);
        return myview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
