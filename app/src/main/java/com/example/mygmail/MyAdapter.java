package com.example.mygmail;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class MyAdapter extends BaseAdapter {

    Context context;
    List<MyModel> items;

    public MyAdapter(Context context, List<MyModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_custom_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textAvatar = convertView.findViewById(R.id.txt_avatar);
            viewHolder.username = convertView.findViewById(R.id.txt_username);
            viewHolder.message = convertView.findViewById(R.id.txt_message);
            viewHolder.time = convertView.findViewById(R.id.txt_time);
            viewHolder.imageStar = convertView.findViewById(R.id.img_star);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final MyModel item = items.get(position);
        viewHolder.textAvatar.setText(item.getTextAvatar());
        viewHolder.username.setText(item.getUsername());
        viewHolder.message.setText(item.getMessage());
        viewHolder.time.setText(item.getTime());
        viewHolder.imageStar.setImageResource(item.getImageStar());

        viewHolder.imageStar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (item.getImageStar() == R.drawable.ic_baseline_star_border_24) {
                        item.setImageStar(R.drawable.ic_baseline_star_24);
                    } else {
                        item.setImageStar(R.drawable.ic_baseline_star_border_24);
                    }
                    notifyDataSetChanged();
                }
        });
        return convertView;
    }

    private class ViewHolder {
        TextView textAvatar;
        TextView username;
        TextView message;
        TextView time;
        ImageView imageStar;
    }

}

