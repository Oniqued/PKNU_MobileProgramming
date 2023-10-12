package com.example.assignment01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ViewPageSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
    }

    public void onBackButtonClicked(android.view.View view) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 클릭했어요", Toast.LENGTH_LONG).show();
    }

    public void callKim(android.view.View view) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);
    }

    public void callBob(android.view.View view) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);
    }
}