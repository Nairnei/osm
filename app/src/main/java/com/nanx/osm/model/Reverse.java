package com.nanx.osm.model;

import java.util.List;



public class Reverse {

    private String place_id;
    private String licence;
    private String osm_type;
    private String osm_id;
    private String lat;
    private String lon;
    private String place_rank;
    private String category;
    private String type;
    private String importance;
    private String addresstype;
    private String display_name;
    private String name;
    private Address address;
    private List<String> boundingbox;

    public String getPlace_id() {

        return place_id;
    }

    public void setPlace_id(String place_id) {

        this.place_id = place_id;
    }

    public String getLicence() {

        return licence;
    }

    public void setLicence(String licence) {

        this.licence = licence;
    }

    public String getOsm_type() {

        return osm_type;
    }

    public void setOsm_type(String osm_type) {

        this.osm_type = osm_type;
    }

    public String getOsm_id() {

        return osm_id;
    }

    public void setOsm_id(String osm_id) {

        this.osm_id = osm_id;
    }

    public String getLat() {

        return lat;
    }

    public void setLat(String lat) {

        this.lat = lat;
    }

    public String getLon() {

        return lon;
    }

    public void setLon(String lon) {

        this.lon = lon;
    }

    public String getPlace_rank() {

        return place_rank;
    }

    public void setPlace_rank(String place_rank) {

        this.place_rank = place_rank;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getImportance() {

        return importance;
    }

    public void setImportance(String importance) {

        this.importance = importance;
    }

    public String getAddresstype() {

        return addresstype;
    }

    public void setAddresstype(String addresstype) {

        this.addresstype = addresstype;
    }

    public String getDisplay_name() {

        return display_name;
    }

    public void setDisplay_name(String display_name) {

        this.display_name = display_name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    public List<String> getBoundingbox() {

        return boundingbox;
    }

    public void setBoundingbox(List<String> boundingbox) {

        this.boundingbox = boundingbox;
    }

    public static class Address {
        /**
         * road : Autopista Pedro Eugenio Aramburu
         * village : El Triángulo
         * state_district : Partido de Malvinas Argentinas
         * state : Buenos Aires
         * postcode : 1.619
         * country : Argentina
         * country_code : ar
         */

        private String road;
        private String village;
        private String state_district;
        private String state;
        private String postcode;
        private String country;
        private String country_code;

        public String getRoad() {

            return road;
        }

        public void setRoad(String road) {

            this.road = road;
        }

        public String getVillage() {

            return village;
        }

        public void setVillage(String village) {

            this.village = village;
        }

        public String getState_district() {

            return state_district;
        }

        public void setState_district(String state_district) {

            this.state_district = state_district;
        }

        public String getState() {

            return state;
        }

        public void setState(String state) {

            this.state = state;
        }

        public String getPostcode() {

            return postcode;
        }

        public void setPostcode(String postcode) {

            this.postcode = postcode;
        }

        public String getCountry() {

            return country;
        }

        public void setCountry(String country) {

            this.country = country;
        }

        public String getCountry_code() {

            return country_code;
        }

        public void setCountry_code(String country_code) {

            this.country_code = country_code;
        }
    }
}
