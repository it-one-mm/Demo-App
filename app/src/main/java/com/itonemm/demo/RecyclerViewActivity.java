package com.itonemm.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.itonemm.demo.models.Product;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private ArrayList<Product> products = new ArrayList<>();
    private RecyclerView productListRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        for (int i=1; i<=100000; i++) {
            int red = (int) Math.floor(Math.random() * 256);
            int green = (int) Math.floor(Math.random() * 256);
            int blue = (int) Math.floor(Math.random() * 256);

            products.add(new Product(
                    Color.rgb(red, green, blue),
                    "Product #" + i,
                    i * 5,
                    i * 100));
        }

        productListRecyclerView = findViewById(R.id.rv_product_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        productListRecyclerView.setLayoutManager(layoutManager);

        productListRecyclerView.setHasFixedSize(true);

        ProductAdapter adapter = new ProductAdapter();

        productListRecyclerView.setAdapter(adapter);

    }

    class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_list_view, viewGroup, false);

            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {

            productViewHolder.colorView.setBackgroundColor(products.get(i).getColor());
            productViewHolder.nameTextView.setText(products.get(i).getName());
            productViewHolder.stockTextView.setText(products.get(i).getStock() + "");
            productViewHolder.priceTextView.setText(products.get(i).getPrice() + "");

        }

        @Override
        public int getItemCount() {
            return products.size();
        }

        class ProductViewHolder extends RecyclerView.ViewHolder {

            View colorView;
            TextView nameTextView;
            TextView stockTextView;
            TextView  priceTextView;

            public ProductViewHolder(@NonNull View itemView) {
                super(itemView);

                colorView = itemView.findViewById(R.id.view_color);
                nameTextView = itemView.findViewById(R.id.tv_name);
                stockTextView = itemView.findViewById(R.id.tv_stock);
                priceTextView = itemView.findViewById(R.id.tv_price);
            }
        }
    }
}
