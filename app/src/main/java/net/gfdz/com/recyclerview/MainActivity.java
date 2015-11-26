package net.gfdz.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private SimplerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();
        initView();
        mAdapter=new SimplerAdapter(this,mDatas);
        mRecyclerView.setAdapter(mAdapter);
        //设置ReycilerView的布局管理
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        //设置ReycilerView的item间分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));

    }

    private void initView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.recycilerview);
    }

    private void initDatas() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i <= 'z'; i++) {
            mDatas.add(""+(char)i);
        }
    }
}
