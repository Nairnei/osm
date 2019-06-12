package com.nanx.osm.view.Home;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nanx.osm.R;
import com.nanx.osm.model.Details;
import com.nanx.osm.model.Reverse;
import com.nanx.osm.model.Search;
import com.nanx.osm.presenter.HomePresenter;
import com.nanx.osm.util.Dialog;

import java.util.Iterator;



public class HomeActivity extends AppCompatActivity implements HomeView {

    HomePresenter homePresenter;
    ProgressDialog progressDialog;
    Button buttonSearch;
    Button buttonReverse;
    Button buttonDetails;

    EditText editTextSearch;
    EditText editTextDetailsType;
    EditText editTextDetailsId;
    EditText editTextReverseLon;
    EditText editTextReverseLat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //BIND
        editTextSearch = findViewById(R.id.editTextSearch);
        editTextDetailsType = findViewById(R.id.editTextDetailsType);
        editTextDetailsId = findViewById(R.id.editTextDetailsId);
        editTextReverseLon = findViewById(R.id.editTextReverseLon);
        editTextReverseLat = findViewById(R.id.editTextReverseLat);

        buttonSearch = findViewById(R.id.buttonSearch);
        buttonDetails = findViewById(R.id.buttonDetails);
        buttonReverse = findViewById(R.id.buttonReverse);

        homePresenter = new HomePresenter(this);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                homePresenter.getSearchOsm(
                        editTextSearch.getText().toString(),
                        "geojson");

            }
        });

        buttonDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                homePresenter.getDetailsOsm(
                        editTextDetailsType.getText().toString(),
                        Integer.parseInt(editTextDetailsId.getText().toString()),
                        "json");

            }
        });

        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                homePresenter.getReverseOsm(
                        Double.parseDouble(editTextReverseLat.getText().toString()),
                        Double.parseDouble(editTextReverseLon.getText().toString()),
                        "jsonv2");

            }
        });


    }

    @Override
    public void showSearch(Search body) {

        Iterator it = body.getFeatures().iterator();

        while (it.hasNext()) {
            Search.Features features = (Search.Features) it.next();
            Dialog.showDialog(this, features.getProperties().getDisplay_name(), "Search");
        }
        endProgress();
    }

    @Override
    public void showDetails(Details body) {

        Dialog.showDialog(this, body.getCategory() + "\n" + body.getType() + "\n" + body.getLocalname(), "Details");
        endProgress();
    }

    @Override
    public void showReverse(Reverse body) {

        Dialog.showDialog(this, body.getDisplay_name(), "Reverse");
        endProgress();
    }

    @Override
    public void showError(String message) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        endProgress();
    }

    @Override
    public void startProgress() {

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("loading");
        progressDialog.show();
    }

    @Override
    public void endProgress() {

        if (progressDialog != null) {
            progressDialog.dismiss();
        }

    }
}
