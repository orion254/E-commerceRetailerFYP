package com.ecommerce.merchant.fypproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.Objects;

public class ContactUsActivity extends AppCompatActivity {
    private Toolbar contenttoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        contenttoolbar = findViewById(R.id.contactUsToolbar);
        setSupportActionBar(contenttoolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(getResources().getString(R.string.contactus));

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public  boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
