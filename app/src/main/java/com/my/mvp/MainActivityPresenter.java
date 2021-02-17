package com.my.mvp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivityPresenter implements PresenterContract.Presenter {

    private View viewc;
    private PresenterContract.View view;
    private RecyclerView recyclerView1,recyclerView2;

    public MainActivityPresenter(PresenterContract.View view,View view1) {
        this.view = view;
        viewc=view1;
    }


    @Override
    public void ProjectRun1() {
        recyclerView1=viewc.findViewById(R.id.recyclerview1);
        view.firstMethod(recyclerView1);
    }

    @Override
    public void ProjectRun2() {
        recyclerView2=viewc.findViewById(R.id.recyclerview2);
        view.secondMethod(recyclerView2);
    }

}
