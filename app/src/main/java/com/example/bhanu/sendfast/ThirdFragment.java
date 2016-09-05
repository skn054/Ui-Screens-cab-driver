package com.example.bhanu.sendfast;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.GraphViewXML;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

/**
 * Created by bhanu kiran on 28/07/2016.
 */
public class ThirdFragment extends Fragment {
    View myview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.third_layout,container,false);
        GraphView graphView= (GraphView) myview.findViewById(R.id.graph);
        graphView.setTitle("Kms Travelled/Day");
        graphView.setTitleTextSize(45);
        StaticLabelsFormatter labelsFormatter = new StaticLabelsFormatter(graphView);
        labelsFormatter.setHorizontalLabels(new String[]{"Mon","Tue","Wed","Thur","Fri","Today"});
        labelsFormatter.setVerticalLabels(new String[]{"100km","150km","200km","250km","300km","400km","500km"});
        graphView.getGridLabelRenderer().setLabelFormatter(labelsFormatter);
        PointsGraphSeries<DataPoint> series=new PointsGraphSeries<DataPoint>(new DataPoint[]{ new DataPoint(0, 1),
                // new DataPoint(0, 3),
                new DataPoint(1, 3),
                new DataPoint(2, 6),
                new DataPoint(3, 2),
                new DataPoint(4, 5),
                new DataPoint(5,8)});
        graphView.addSeries(series);
        return myview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
