package com.example.fabiofilho.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void onClickPopularMoviesButton(View view) {
        showToast(getDefaultMessage(getResources().getString(R.string.portfolio_activity_button_popular_movies)));
    }

    public void onClickStockHawkButton(View view) {
        showToast(getDefaultMessage(getResources().getString(R.string.portfolio_activity_button_stock_hawk)));
    }

    public void onClickBuiltItBiggerButton(View view) {
        showToast(getDefaultMessage(getResources().getString(R.string.portfolio_activity_button_build_it_bigger)));
    }

    public void onClickMakeAppMaterialButton(View view) {
        showToast(getDefaultMessage(getResources().getString(R.string.portfolio_activity_button_make_app_material)));
    }

    public void onClickGoUbiquitousButton(View view) {
        showToast(getDefaultMessage(getResources().getString(R.string.portfolio_activity_button_go_ubiquitous)));
    }

    public void onClickCapstoneMyAppButton(View view) {
        showToast(getDefaultMessage(getResources().getString(R.string.portfolio_activity_button_capstone_my_app).split(":")[0]));
    }


    private String getDefaultMessage(String mMainMessage){

        return getResources().getString(R.string.portfolio_activity_text_default_toast_message_start)
             + " " + mMainMessage.toLowerCase() + " "
             + getResources().getString(R.string.portfolio_activity_text_default_toast_message_end);
    }

    private void showToast(String mMessage){

        Toast.makeText(getApplicationContext(), mMessage, Toast.LENGTH_SHORT).show();
    }

}
