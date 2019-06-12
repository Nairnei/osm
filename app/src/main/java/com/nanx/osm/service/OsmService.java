package com.nanx.osm.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class OsmService {

    private Retrofit retrofit = null;

    String baseUrl = " https://nominatim.openstreetmap.org";

    public OsmApi getLocalService() {

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(OsmApi.class);
    }
}
