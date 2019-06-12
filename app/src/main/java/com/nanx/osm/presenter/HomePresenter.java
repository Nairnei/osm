package com.nanx.osm.presenter;

import com.nanx.osm.model.Details;
import com.nanx.osm.model.Reverse;
import com.nanx.osm.model.Search;
import com.nanx.osm.service.OsmService;
import com.nanx.osm.view.Home.HomeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class HomePresenter {

    HomeView homeView;
    OsmService osmService;


    public HomePresenter(HomeView homeView) {

        this.homeView = homeView;

        if (this.osmService == null) {
            this.osmService = new OsmService();
        }

    }

    public void getSearchOsm(String location, String format) {

        homeView.startProgress();
        Call<Search> requestSearchOsm = osmService
                .getLocalService()
                .getSearch(location, format);

        requestSearchOsm.enqueue(new Callback<Search>() {
            @Override
            public void onResponse(Call<Search> call, Response<Search> response) {

                homeView.showSearch(response.body());
            }

            @Override
            public void onFailure(Call<Search> call, Throwable t) {

                homeView.showError(t.getMessage());

            }
        });
    }

    public void getReverseOsm(double lat, double lon, String format) {

        homeView.startProgress();
        Call<Reverse> requestReverse = osmService
                .getLocalService()
                .getReverse(lat, lon, format);

        requestReverse.enqueue(new Callback<Reverse>() {
            @Override
            public void onResponse(Call<Reverse> call, Response<Reverse> response) {

                homeView.showReverse(response.body());
            }

            @Override
            public void onFailure(Call<Reverse> call, Throwable t) {

                homeView.showError(t.getMessage());
            }
        });
    }

    ;

    public void getDetailsOsm(String osmType, final int osmid, final String format) {

        homeView.startProgress();
        Call<Details> requestDetails = osmService
                .getLocalService()
                .getDetail(osmType, osmid, format);


        requestDetails.enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {

                homeView.showDetails(response.body());
            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {

                homeView.showError(t.getMessage());
            }
        });
    }


}
