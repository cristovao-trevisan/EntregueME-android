package com.example.cristovao.entregueme;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ListView notificationsList;

    public void clearSelection(){
        mDrawerList.setItemChecked(mDrawerList.getSelectedItemPosition(), false);
    }

    public void closeDrawer(){
        mDrawerLayout.closeDrawer(Gravity.RIGHT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNavigationDrawerItemTitles= getResources().getStringArray(R.array.navigation_drawer_items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.right_drawer);

        ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[5];

        String[] navigation_drawer_items_array = getResources().getStringArray(R.array.navigation_drawer_items_array);

        drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_lists, navigation_drawer_items_array[0]);
        drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_add, navigation_drawer_items_array[1]);
        drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_profile, navigation_drawer_items_array[2]);
        drawerItem[3] = new ObjectDrawerItem(R.drawable.ic_payments, navigation_drawer_items_array[3]);
        drawerItem[4] = new ObjectDrawerItem(R.drawable.ic_deliver, navigation_drawer_items_array[4]);

        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.listview_item_row, drawerItem);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener(this));


        notificationsList = (ListView) findViewById(R.id.notifications);
        String[] notifications_array = getResources().getStringArray(R.array.notifications_array_HARDCODED);
        ArrayAdapter<String> notAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notifications_array);
        notificationsList.setAdapter(notAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(R.id.menu_button == id){
            mDrawerLayout.openDrawer(Gravity.RIGHT);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
