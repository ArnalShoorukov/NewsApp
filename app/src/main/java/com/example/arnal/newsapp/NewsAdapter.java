package com.example.arnal.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arnal on 2/4/17.
 */

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Activity context, ArrayList<News> news){super(context, 0, news);}

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_news, parent, false);
        }
        News currentNews = getItem(position);

        TextView newsTitle = (TextView) listView.findViewById(R.id.titleView);
        newsTitle.setText(currentNews.getTitle());

        TextView section = (TextView) listView.findViewById(R.id.sectionView);
        section.setText(currentNews.getSection());

        TextView dateView = (TextView) listView.findViewById(R.id.publishedView);
        dateView.setText(currentNews.getPublishedDate());

        return listView;
    }
}
