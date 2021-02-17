package com.my.mvp;

import androidx.recyclerview.widget.RecyclerView;

public interface PresenterContract {


    interface  View
    {
        void firstMethod(RecyclerView recyclerView);

        void secondMethod(RecyclerView recyclerView);

    }

    interface Presenter
    {
        void ProjectRun1();

        void ProjectRun2();

    }

}
