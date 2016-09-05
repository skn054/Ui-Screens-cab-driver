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
import com.jjoe64.graphview.series.PointsGraphSeries;

/**
 * Created by bhanu kiran on 29/07/2016.
 */
public class TripsDay extends Fragment{
    View myview;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        myview=inflater.inflate(R.layout.trips_day,container,false);
        GraphView graphView= (GraphView) myview.findViewById(R.id.graph);
        graphView.setTitle("Trips/Day");
        graphView.setTitleTextSize(45);
        StaticLabelsFormatter labelsFormatter = new StaticLabelsFormatter(graphView);
        labelsFormatter.setHorizontalLabels(new String[]{"Morning","Afternoon","Evening"});
        graphView.getGridLabelRenderer().setLabelFormatter(labelsFormatter);
       BarGraphSeries<DataPoint> graphSeries=new BarGraphSeries<>(new DataPoint[]{
          new DataPoint(1,9),
               new DataPoint(2,6),
               new DataPoint(3,7)
       });
        graphView.addSeries(graphSeries);
        return myview;
    }
}
