package com.my.mvp.recyclerview.adabter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.my.mvp.R;
import com.my.mvp.recyclerview.model.Model_one;
import java.util.List;

public class CustomAdabter extends RecyclerView.Adapter<CustomAdabter.customView> {


    private List<Model_one> model_oneList;

    public CustomAdabter(List<Model_one> model_oneList) {
        this.model_oneList = model_oneList;
    }

    @NonNull
    @Override
    public customView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.body_recyclerview,parent,false);

        return new customView(view);
    }
    @Override
    public void onBindViewHolder(@NonNull customView holder, int position) {

        Model_one model=model_oneList.get(position);
        holder.textView.setText(model.getName());
        holder.imageView.setImageResource(model.getImage());

        holder.rel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==0)
                {
                    Toast.makeText(view.getContext(), "1", Toast.LENGTH_SHORT).show();
                }
                else if (position==1)
                {
                    Toast.makeText(view.getContext(), "2", Toast.LENGTH_SHORT).show();
                }
                else if (position==2)
                {
                    Toast.makeText(view.getContext(), "3", Toast.LENGTH_SHORT).show();
                }
                //and ...
            }
        });

    }

    @Override
    public int getItemCount() {
        return model_oneList.size();
    }

    public class customView extends RecyclerView.ViewHolder
    {
        RelativeLayout rel1;
        TextView textView;
        ImageView imageView;

        public customView(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.textR1);
            imageView=itemView.findViewById(R.id.imageR1);
            rel1=itemView.findViewById(R.id.rel1);
        }
    }

}
