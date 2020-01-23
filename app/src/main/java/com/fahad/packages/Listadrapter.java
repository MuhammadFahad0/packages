package com.fahad.packages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class Listadrapter extends BaseAdapter {
    private Context context; //context
    private ArrayList<product> items; //data source of the list adapter

    //public constructor
    public Listadrapter(Context context, ArrayList<product> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return items.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.customm, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final product currentItem = (product) getItem(position);
        viewHolder.Title.setText(currentItem.getTitle());
        viewHolder.Duration.setText(Html.fromHtml("<b> Duration: </b> " +currentItem.getDuration().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));
        viewHolder.Volume.setText(Html.fromHtml("<b> Volume: </b> " +currentItem.getVolume().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));
        viewHolder.Activation.setText(Html.fromHtml("<b> Activaton: </b> " +currentItem.getActivation().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));
        viewHolder.Deactivation.setText(Html.fromHtml("<b> Deactivation: </b> " +currentItem.getDeactivation().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));
        viewHolder.Remaining.setText(Html.fromHtml("<b> Volume: </b> " +currentItem.getRemaining().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));
        viewHolder.Info.setText(Html.fromHtml("<b> Info: </b> " +currentItem.getInfo().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));
        viewHolder.Price.setText(Html.fromHtml("<b> Price: </b> " +currentItem.getPrice().replace("\\n", System.getProperty("line.separator")).replace(">", "Then Replay")));

        viewHolder.Acti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(currentItem.getActivation().equals("N/A"))
                {
                    Toast.makeText(context,"Not Available from Company",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Uri number = Uri.parse(String.format("tel:%s", Uri.encode(currentItem.getActivation())));
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                    context.startActivity(callIntent);

                }
                    }
        });


        viewHolder.Deacti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(currentItem.getDeactivation().equals("N/A"))
                {
                    Toast.makeText(context,"Not Available from Company",Toast.LENGTH_SHORT).show();
                }
                else
                {
                Uri number = Uri.parse(String.format("tel:%s", Uri.encode(currentItem.getDeactivation())));
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                context.startActivity(callIntent);
            }}
        });


        viewHolder.Rem_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(currentItem.getRemaining().equals("N/A"))
                {
                    Toast.makeText(context,"Not Available from Company",Toast.LENGTH_SHORT).show();
                }
                else
                {
                Uri number = Uri.parse(String.format("tel:%s", Uri.encode(currentItem.getRemaining())));
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                context.startActivity(callIntent);
            }}
        });


        return convertView;
    }

    private class ViewHolder {
        Button Acti_btn;
        Button Deacti_btn;
        Button Rem_btn;
        TextView Title;
        TextView Duration;
        TextView Volume;
        TextView Activation;
        TextView Deactivation;
        TextView Remaining;
        TextView Info;
        TextView Price;

        public ViewHolder(View view) {
            Acti_btn = view.findViewById(R.id.acti);
            Deacti_btn = view.findViewById(R.id.deacti);
            Rem_btn = view.findViewById(R.id.remain);
            Title = (TextView)view.findViewById(R.id.title);
            Duration = (TextView)view.findViewById(R.id.duration);
            Volume = (TextView)view.findViewById(R.id.volume);
            Activation = (TextView)view.findViewById(R.id.activation);
            Deactivation = (TextView)view.findViewById(R.id.deactivation);
            Remaining = (TextView)view.findViewById(R.id.remaining);
            Info = (TextView)view.findViewById(R.id.info);
            Price = (TextView)view.findViewById(R.id.price);
        }
    }
}