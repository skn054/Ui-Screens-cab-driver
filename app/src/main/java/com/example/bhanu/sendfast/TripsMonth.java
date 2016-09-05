package com.example.bhanu.sendfast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by bhanu kiran on 29/07/2016.
 */
public class TripsMonth extends Fragment {
    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        myview=inflater.inflate(R.layout.trips_month,container,false);
        GraphView graphView= (GraphView) myview.findViewById(R.id.graph);
        graphView.setTitle("Trips/Month");
        graphView.setTitleTextSize(45);
        StaticLabelsFormatter labelsFormatter = new StaticLabelsFormatter(graphView);
        labelsFormatter.setHorizontalLabels(new String[]{"Jan","Feb","Mar","April","May","June"});
        labelsFormatter.setVerticalLabels(new String[]{"100","150","200","250","300","400","500"});
        graphView.getGridLabelRenderer().setLabelFormatter(labelsFormatter);
        LineGraphSeries<DataPoint> series=new LineGraphSeries<>(new DataPoint[]{
           new DataPoint(1,3),
                new DataPoint(2,5),
                new DataPoint(3,6),
                new DataPoint(4,5),
                new DataPoint(5,8),
                new DataPoint(6,10),
        });
        graphView.addSeries(series);
        return  myview;
    }
}
