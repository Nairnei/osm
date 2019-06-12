package com.nanx.osm.service;

import com.nanx.osm.model.Details;
import com.nanx.osm.model.Reverse;
import com.nanx.osm.model.Search;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface OsmApi {


    //https://nominatim.openstreetmap.org/search/<query>?<params>
    @GET("/search?")
    Call<Search> getSearch(@Query("q") String params, @Query("format") String format);


    //https://nominatim.openstreetmap.org/details?osmtype=[N|W|R]&osmid=<value>&class=<value>
    @GET("/details?")
    Call<Details> getDetail(@Query("osmtype") String osmType, @Query("osmid") int osmid, @Query("format") String format);


    @GET("reverse?")
    Call<Reverse> getReverse(@Query("lat") double lat, @Query("lon") double lon, @Query("format") String format);
}
