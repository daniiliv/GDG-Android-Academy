package com.example.reportslist;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ReportsListAdapter.ReportsListAdapterOnClickHandler {

    private RecyclerView reportsListRecyclerView;
    private ReportsListAdapter reportsListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        /*
         * Using findViewById, we get a reference to our RecyclerView from xml. This allows us to
         * do things like set the adapter of the RecyclerView and toggle the visibility.
         */
        reportsListRecyclerView = findViewById(R.id.recyclerview_reports);

        /*
         * LinearLayoutManager can support HORIZONTAL or VERTICAL orientations. The reverse layout
         * parameter is useful mostly for HORIZONTAL layouts that should reverse for right to left
         * languages.
         */
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        reportsListRecyclerView.setLayoutManager(layoutManager);

        /*
         * Use this setting to improve performance if you know that changes in content do not
         * change the child layout size in the RecyclerView
         */
        reportsListRecyclerView.setHasFixedSize(true);

        // COMPLETED (11) Pass in 'this' as the ForecastAdapterOnClickHandler
        /*
         * The ForecastAdapter is responsible for linking our weather data with the Views that
         * will end up displaying our weather data.
         */
        reportsListAdapter = new ReportsListAdapter(this);

        reportsListAdapter.setReportsData(ReportsData.getReports());

        /* Setting the adapter attaches it to the RecyclerView in our layout. */
        reportsListRecyclerView.setAdapter(reportsListAdapter);
    }

    /**
     * This method is overridden by our MainActivity class in order to handle RecyclerView item
     * clicks.
     *
     * @param reportName The weather for the day that was clicked
     */
    @Override
    public void onClick(String reportName) {
        Context context = this;
        Toast.makeText(context, reportName, Toast.LENGTH_SHORT)
                .show();
    }
}