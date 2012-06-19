package com.dropbox.android.sample;

import java.util.ArrayList;
import java.util.Iterator;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class myListView extends ListActivity {

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view);
		savedInstanceState = getIntent().getExtras(); 
		ArrayList<DropBoxBean> thumbs = (ArrayList<DropBoxBean>) savedInstanceState.get("obj");
		
		String obj[] = new String[thumbs.size()];
		Iterator<DropBoxBean> iter = thumbs.iterator();
		int i = 0;
		while(iter.hasNext())
		{
			obj[i] = iter.next().getFileName();
			System.out.println("FileName::: " + obj[i]);
			i++;
		}
//		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_view,obj)); 
        ListView lv = (ListView) findViewById(R.id.listView_ID1);
        lv.setTextFilterEnabled(true);
        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,obj));
	}

}
