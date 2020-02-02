package com.itonemm.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.itonemm.demo.models.Product;

import java.util.ArrayList;
import java.util.Set;

public class ICustomListViewActivity extends AppCompatActivity {

    private ArrayList<Product> products = new ArrayList<>();
    private ListView productListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icustom_list_view);

        for (int i=1; i<=1000; i++) {
            int red = (int) Math.floor(Math.random() * 256);
            int green = (int) Math.floor(Math.random() * 256);
            int blue = (int) Math.floor(Math.random() * 256);

            products.add(new Product(
                    Color.rgb(red, green, blue),
                    "Product #" + i,
                    i * 5,
                    i * 100));
        }

        productListView = findViewById(R.id.list_view_product);

        ProductAdapter adapter = new ProductAdapter();
        productListView.setAdapter(adapter);

    }

    private class ProductAdapter extends BaseAdapter {


        Set<View> viewSet = new ArraySet<View>();

        @Override
        public int getCount() {
            return products.size();
        }

        @Override
        public Object getItem(int position) {
            return products.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {

            ProductViewHolder viewHolder;

            if (view == null) {
                LayoutInflater inflater = LayoutInflater.from(ICustomListViewActivity.this);
                view = inflater.inflate(R.layout.custom_list_view, null);

                viewHolder = new ProductViewHolder();

                viewHolder.colorView = view.findViewById(R.id.view_color);
                viewHolder.nameTextView = view.findViewById(R.id.tv_name);
                viewHolder.stockTextView = view.findViewById(R.id.tv_stock);
                viewHolder.priceTextView = view.findViewById(R.id.tv_price);

                view.setTag(viewHolder);

            } else {
                viewHolder = (ProductViewHolder) view.getTag();
            }

            final Product product = products.get(position);

            viewHolder.colorView.setBackgroundColor(product.getColor());
            viewHolder.nameTextView.setText(product.getName());
            viewHolder.stockTextView.setText(product.getStock() + "");
            viewHolder.priceTextView.setText(product.getPrice() + "");

            viewSet.add(view);

            Log.d(CustomListViewActivity.class.getSimpleName(), "Index: "+ position +" : "+view + " Size: " + viewSet.size());

            return view;
        }

        public class ProductViewHolder {
            public View colorView;
            public TextView nameTextView;
            public TextView stockTextView;
            public TextView  priceTextView;
        }
    }
}
