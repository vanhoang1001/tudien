package pluralsight.com.horizontalrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImageUrls = new ArrayList<>();

    //
   // MyCustomAdapter dataAdapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();

        //get listview tu da rea
       // displaylistView();
    }

//    private void displaylistView() {
//        ArrayList<States> stateList= new ArrayList<States>();
//        States states= new States("HL","hello",false);
//        stateList.add(states);
//        states= new States("CK","chickend",false);
//        stateList.add(states);
//        states= new States("P","Pig",false);
//        stateList.add(states);
//        states= new States("D","Dog",false);
//        stateList.add(states);
//
//        dataAdapter= new MyCustomAdapter(this,R.layout.layout_tudatra,stateList);
//        ListView listView=(ListView) findViewById(R.id.listTudatra);
//        listView.setAdapter(dataAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                States states1=(States) adapterView.getItemAtPosition(i);
//                Toast.makeText(getApplicationContext(), "click on row", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//    }
//
//    private class MyCustomAdapter extends ArrayAdapter<States>
//    {
//        private ArrayList<States> statesList;
//                public MyCustomAdapter(Context context, int textview, ArrayList<States> statesList)
//                {
//                    super(context, textview,statesList);
//                    this.statesList= new ArrayList<States>();
//                    this.statesList.addAll(statesList);
//                }
//    }
//    private class ViewHoder
//    {
//        TextView code;
//        CheckBox name;
//    }

    //hinh main

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add(R.drawable.vietanh);
        mNames.add("Tra từ Việt - Anh");

        mImageUrls.add(R.drawable.tucuaban);
        mNames.add("Từ của bạn");

        mImageUrls.add(R.drawable.tudatra);
        mNames.add("Từ đã tra");

        mImageUrls.add(R.drawable.tuquantrong);
        mNames.add("Từ quan trọng");

         initRecyclerView();

    }
//layout main
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }
    //menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        return super.onCreateOptionsMenu(menu);
    }
}

















