package uz.onclass.foodorderappserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



import uz.onclass.foodorderappserver.Interface.ItemClickListener;
import uz.onclass.foodorderappserver.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    public TextView menuName;
    public ImageView imgView;

    public ItemClickListener itemClickListener;


    public MenuViewHolder(View itemView) {
        super(itemView);

        menuName = (TextView) itemView.findViewById(R.id.name_menu);
        imgView = (ImageView) itemView.findViewById(R.id.img_menu);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        itemClickListener.onClick(v, getAdapterPosition(), false);


    }


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}