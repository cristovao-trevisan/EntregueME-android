package com.example.cristovao.entregueme;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowActiveListsFragment extends Fragment {
    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.show_active_lists, container, false);
        listView = (ListView) view.findViewById(R.id.show_active_lists);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {


            }
        });

        String[] lists_array =getActivity().getResources().getStringArray(R.array.active_lists_HARDCODED);
        ArrayAdapter<String> notAdapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1 , lists_array);
        listView.setAdapter(notAdapter);
        return view;
    }
}
