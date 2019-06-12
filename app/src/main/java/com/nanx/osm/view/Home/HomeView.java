package com.nanx.osm.view.Home;

import com.nanx.osm.model.Details;
import com.nanx.osm.model.Reverse;
import com.nanx.osm.model.Search;



public interface HomeView {


    void showSearch(Search body);

    void showDetails(Details body);

    void showReverse(Reverse body);

    void showError(String message);

    void startProgress();

    void endProgress();
}
