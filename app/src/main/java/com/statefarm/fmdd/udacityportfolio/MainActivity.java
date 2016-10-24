package com.statefarm.fmdd.udacityportfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_build_it_bigger)
    Button mButtonBigger;
    @BindView(R.id.button_capstone)
    Button mButtonCapstone;
    @BindView(R.id.button_go_ubiquitous)
    Button mButtonGoUbi;
    @BindView(R.id.button_make_your_app_material)
    Button mButtonMaterial;
    @BindView(R.id.button_popular_movies)
    Button mButtonMovies;
    @BindView(R.id.button_stock_hawk)
    Button mButtonStocks;

    @Nullable
    @OnClick({R.id.button_stock_hawk, R.id.button_popular_movies,
            R.id.button_make_your_app_material, R.id.button_go_ubiquitous,
    R.id.button_capstone, R.id.button_build_it_bigger})
    public void onButtonClick(Button button) {
        Toast.makeText(this, "Button: " + button.getText(), Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}
