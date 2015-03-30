package com.maidbrigade.maidbrigade;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class activity_gift_certificate extends ActionBarActivity {
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_gift_certificate);

        sp=(Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> ar= ArrayAdapter.createFromResource(this,R.array.Gift, android.R.layout.simple_list_item_1);
        ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp.setAdapter(ar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_gift_certificate, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {

            case R.id.Home:
                Intent Home = new Intent(this, MainActivity.class);
                startActivity(Home);
                return true;
            case R.id.User:
                Intent User = new Intent(this, UserProfileActivity.class);
                startActivity(User);
                return true;
            case R.id.Free:
                Intent Free = new Intent(this, free_estimate.class);
                startActivity(Free);
                return true;

            case R.id.Quality:
                Intent Quality = new Intent(this, activity_quality_card.class);
                startActivity(Quality);
                return true;

            case R.id.Gift:
                Intent Gift = new Intent(this, activity_gift_certificate.class);
                startActivity(Gift);
                return true;


            case R.id.job:
                Intent job = new Intent(this, job.class);
                startActivity(job);
                return true;

            case R.id.Green:
                Intent Green = new Intent(this, green__cleaning_page.class);
                startActivity(Green);
                return true;

            case R.id.Why:
                Intent Why = new Intent(this, why_hair_us_page.class);
                startActivity(Why);
                return true;

            case R.id.Contact:
                Intent Contact = new Intent(this, ContactUsActivity.class);
                startActivity(Contact);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
