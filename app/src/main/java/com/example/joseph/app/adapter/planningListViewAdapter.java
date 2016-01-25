package com.example.joseph.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.joseph.app.R;
import com.example.joseph.app.helper.PlanningInfo;
import com.google.gson.JsonArray;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.widget.TextView;

/**
 * Created by Clément on 25/01/2016.
 */
public class planningListViewAdapter extends BaseAdapter {
    private ArrayList<PlanningInfo> planningInfos;
    private LayoutInflater inflater;

    public planningListViewAdapter(Context _context, ArrayList<PlanningInfo> planningInfos) {
        this.planningInfos = planningInfos;
        inflater = (LayoutInflater) _context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.custom_planning_row, null);

        PlanningInfo pi = planningInfos.get(position);
        ((TextView) vi.findViewById(R.id.planningModule)).setText(pi.getModule());
        ((TextView) vi.findViewById(R.id.planningCourse)).setText(pi.getTitle());
        ((TextView) vi.findViewById(R.id.planningStart)).setText(pi.getStart());
        ((TextView) vi.findViewById(R.id.planningEnd)).setText(pi.getEnd());

        return vi;
    }

    @Override
    public int getCount() {
        return planningInfos.size();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

}