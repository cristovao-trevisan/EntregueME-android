package com.example.cristovao.entregueme;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DrawerItemClickListener implements ListView.OnItemClickListener {
    private Context activity;
    public DrawerItemClickListener(Context activity){
        this.activity = activity;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(activity, ShowListsActivity.class);
                activity.startActivity(intent);
                break;
            case 4:
                intent = new Intent(activity, DeliveryActivity.class);
                activity.startActivity(intent);
                break;
        }
        ((MainActivity)activity).clearSelection();
    }

}

