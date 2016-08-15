package com.example.zhangpei874.testproject;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.activity_test_tv)
    TextView activityTestTv;
    @BindView(R.id.activity_test_listview)
    ListView activityTestListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);//必须在setContetView后面
        init();
    }


    public void init() {
//        View view = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
//        ButterKnife.bind(this,view);
//        TextView tv = ButterKnife.findById(view, R.id.activity_test_tv);
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += i;
        }
//        int i = 1 / 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

        }



        SparseArray<String> sparseArray=new SparseArray<>();


        SparseArrayCompat<String> stringSparseArrayCompat=new SparseArrayCompat<>();

        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        if (list != null) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        for (int i = 0; i < 30; i++) {

        }
        Object o = null;
        o.toString();
        if (o == null) {

        }




    }


    @OnClick(R.id.activity_test_tv)
    public void textClick() {

    }

    @OnClick(R.id.activity_test_tv)
    public void textClick(View view) {

    }

    @OnItemClick(R.id.activity_test_listview)
    public void listviewItemClick() {

    }


//    static class ViewHolder {
//        @BindView(R.id.activity_test_tv)
//        TextView activityTestTv;
//        @BindView(R.id.activity_test_listview)
//        ListView activityTestListview;
//
//        ViewHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }
}
