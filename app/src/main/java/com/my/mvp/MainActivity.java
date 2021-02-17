package com.my.mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import com.my.mvp.recyclerview.adabter.CustomAdabter;
import com.my.mvp.recyclerview.model.Model_one;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity implements PresenterContract.View{


    private PresenterContract.Presenter presenter;
    private List<Model_one> list1,list2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view=getWindow().getDecorView().getRootView();
        presenter=new MainActivityPresenter(this,view);

    }




    public void button1(View view)
    {
        presenter.ProjectRun1();
    }

    public void button2(View view)
    {
        presenter.ProjectRun2();
    }


    @Override
    public void firstMethod(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list1=new ArrayList<>();
        recyclerView.setAdapter(new CustomAdabter(list1));
        setInsert1();
    }

    @Override
    public void secondMethod(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list2=new ArrayList<>();
        recyclerView.setAdapter(new CustomAdabter(list2));
        setInsert2();
    }








//---------------create lists----------------------------

    private void setInsert1() {
        list1.add(new Model_one("1",R.drawable.ic_launcher));
        list1.add(new Model_one("2",R.drawable.ic_launcher));
        list1.add(new Model_one("3",R.drawable.ic_launcher));
    }


    private void setInsert2() {
        list2.add(new Model_one("one",R.drawable.ic_launcher));
        list2.add(new Model_one("two",R.drawable.ic_launcher));
        list2.add(new Model_one("three",R.drawable.ic_launcher));
    }




}