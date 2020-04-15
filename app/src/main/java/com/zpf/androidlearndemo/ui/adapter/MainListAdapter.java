package com.zpf.androidlearndemo.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.zpf.androidlearndemo.R;

import java.util.List;

public class MainListAdapter extends ArrayAdapter<MainListAdapter.MainItem> {

    private int mLayoutId;

    private List<MainItem> mItems;

    public MainListAdapter(Context context, int layoutId, List<MainItem> items) {
        super(context, layoutId, items);
        mLayoutId = layoutId;
        mItems = items;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public MainItem getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainItem item = mItems.get(position);
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(getContext()).inflate(mLayoutId, parent, false);
        ImageView itemHead = view.findViewById(R.id.list_main_item_head_img);
        TextView itemText = view.findViewById(R.id.list_main_item_text);
        itemHead.setImageResource(item.getItemHead());
        itemText.setText(item.getItemText());
        return view;
    }

    public static class MainItem {
        int itemHead;
        String itemText;

        public MainItem(int itemHead, String itemText) {
            this.itemHead = itemHead;
            this.itemText = itemText;
        }

        public int getItemHead() {
            return itemHead;
        }

        public String getItemText() {
            return itemText;
        }
    }
}
