package jintana.kd_p.ac.th.showtest.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import jintana.kd_p.ac.th.showtest.R;

public class FoodAdapter extends BaseAdapter{

    private Context context;
    private  String[] imageSrting, foodString, priceString, detailString;

    public FoodAdapter(Context context, String[] imageSrting, String[] foodString, String[] priceString, String[] detailString) {
        this.context = context;
        this.imageSrting = imageSrting;
        this.foodString = foodString;
        this.priceString = priceString;
        this.detailString = detailString;

    }

    @Override
    public int getCount() {
        return foodString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_food, parent,false);
        TextView foodTextView = view.findViewById(R.id.txtfood);
        TextView priceTextView= view.findViewById(R.id.textPrice);
        TextView detailTextView= view.findViewById(R.id.textDetail);
        ImageView imageView = view.findViewById(R.id.imvFood);

        foodTextView.setText(foodString[position]);
        priceTextView.setText(priceString[position]);
        detailTextView.setText(detailString[position]);

        Picasso.get().load(imageSrting[position]).into(imageView);

        return view;
    }
}
