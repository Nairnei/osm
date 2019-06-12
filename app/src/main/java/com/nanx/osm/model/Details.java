package com.nanx.osm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Details {

    private int place_id;
    private int parent_place_id;
    private String osm_type;
    private int osm_id;
    private String category;
    private String type;
    private String admin_level;
    private String localname;
    private Names names;
    private Addresstags addresstags;
    private Object housenumber;
    private String calculated_postcode;
    private String country_code;
    private String indexed_date;
    private double importance;
    private double calculated_importance;
    private Extratags extratags;
    private String calculated_wikipedia;
    private int rank_address;
    private int rank_search;
    private boolean isarea;
    private Centroid centroid;
    private Geometry geometry;

    public int getPlace_id() {

        return place_id;
    }

    public void setPlace_id(int place_id) {

        this.place_id = place_id;
    }

    public int getParent_place_id() {

        return parent_place_id;
    }

    public void setParent_place_id(int parent_place_id) {

        this.parent_place_id = parent_place_id;
    }

    public String getOsm_type() {

        return osm_type;
    }

    public void setOsm_type(String osm_type) {

        this.osm_type = osm_type;
    }

    public int getOsm_id() {

        return osm_id;
    }

    public void setOsm_id(int osm_id) {

        this.osm_id = osm_id;
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

    public String getAdmin_level() {

        return admin_level;
    }

    public void setAdmin_level(String admin_level) {

        this.admin_level = admin_level;
    }

    public String getLocalname() {

        return localname;
    }

    public void setLocalname(String localname) {

        this.localname = localname;
    }

    public Names getNames() {

        return names;
    }

    public void setNames(Names names) {

        this.names = names;
    }

    public Addresstags getAddresstags() {

        return addresstags;
    }

    public void setAddresstags(Addresstags addresstags) {

        this.addresstags = addresstags;
    }

    public Object getHousenumber() {

        return housenumber;
    }

    public void setHousenumber(Object housenumber) {

        this.housenumber = housenumber;
    }

    public String getCalculated_postcode() {

        return calculated_postcode;
    }

    public void setCalculated_postcode(String calculated_postcode) {

        this.calculated_postcode = calculated_postcode;
    }

    public String getCountry_code() {

        return country_code;
    }

    public void setCountry_code(String country_code) {

        this.country_code = country_code;
    }

    public String getIndexed_date() {

        return indexed_date;
    }

    public void setIndexed_date(String indexed_date) {

        this.indexed_date = indexed_date;
    }

    public double getImportance() {

        return importance;
    }

    public void setImportance(double importance) {

        this.importance = importance;
    }

    public double getCalculated_importance() {

        return calculated_importance;
    }

    public void setCalculated_importance(double calculated_importance) {

        this.calculated_importance = calculated_importance;
    }

    public Extratags getExtratags() {

        return extratags;
    }

    public void setExtratags(Extratags extratags) {

        this.extratags = extratags;
    }

    public String getCalculated_wikipedia() {

        return calculated_wikipedia;
    }

    public void setCalculated_wikipedia(String calculated_wikipedia) {

        this.calculated_wikipedia = calculated_wikipedia;
    }

    public int getRank_address() {

        return rank_address;
    }

    public void setRank_address(int rank_address) {

        this.rank_address = rank_address;
    }

    public int getRank_search() {

        return rank_search;
    }

    public void setRank_search(int rank_search) {

        this.rank_search = rank_search;
    }

    public boolean isIsarea() {

        return isarea;
    }

    public void setIsarea(boolean isarea) {

        this.isarea = isarea;
    }

    public Centroid getCentroid() {

        return centroid;
    }

    public void setCentroid(Centroid centroid) {

        this.centroid = centroid;
    }

    public Geometry getGeometry() {

        return geometry;
    }

    public void setGeometry(Geometry geometry) {

        this.geometry = geometry;
    }

    public static class Names {
        /**
         * name : Pariser Platz
         * name:be : Парыжская плошча
         * name:de : Pariser Platz
         * name:es : Plaza de París
         * name:he : פאריזר פלאץ
         * name:ko : 파리저 광장
         * name:la : Forum Parisinum
         * name:ru : Парижская площадь
         * name:uk : Паризька площа
         * name:zh : 巴黎廣場
         */

        private String name;
        @SerializedName("name:be")
        private String _$NameBe286; // FIXME check this code
        @SerializedName("name:de")
        private String _$NameDe187; // FIXME check this code
        @SerializedName("name:es")
        private String _$NameEs181; // FIXME check this code
        @SerializedName("name:he")
        private String _$NameHe143; // FIXME check this code
        @SerializedName("name:ko")
        private String _$NameKo252; // FIXME check this code
        @SerializedName("name:la")
        private String _$NameLa33; // FIXME check this code
        @SerializedName("name:ru")
        private String _$NameRu322; // FIXME check this code
        @SerializedName("name:uk")
        private String _$NameUk129; // FIXME check this code
        @SerializedName("name:zh")
        private String _$NameZh273; // FIXME check this code

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public String get_$NameBe286() {

            return _$NameBe286;
        }

        public void set_$NameBe286(String _$NameBe286) {

            this._$NameBe286 = _$NameBe286;
        }

        public String get_$NameDe187() {

            return _$NameDe187;
        }

        public void set_$NameDe187(String _$NameDe187) {

            this._$NameDe187 = _$NameDe187;
        }

        public String get_$NameEs181() {

            return _$NameEs181;
        }

        public void set_$NameEs181(String _$NameEs181) {

            this._$NameEs181 = _$NameEs181;
        }

        public String get_$NameHe143() {

            return _$NameHe143;
        }

        public void set_$NameHe143(String _$NameHe143) {

            this._$NameHe143 = _$NameHe143;
        }

        public String get_$NameKo252() {

            return _$NameKo252;
        }

        public void set_$NameKo252(String _$NameKo252) {

            this._$NameKo252 = _$NameKo252;
        }

        public String get_$NameLa33() {

            return _$NameLa33;
        }

        public void set_$NameLa33(String _$NameLa33) {

            this._$NameLa33 = _$NameLa33;
        }

        public String get_$NameRu322() {

            return _$NameRu322;
        }

        public void set_$NameRu322(String _$NameRu322) {

            this._$NameRu322 = _$NameRu322;
        }

        public String get_$NameUk129() {

            return _$NameUk129;
        }

        public void set_$NameUk129(String _$NameUk129) {

            this._$NameUk129 = _$NameUk129;
        }

        public String get_$NameZh273() {

            return _$NameZh273;
        }

        public void set_$NameZh273(String _$NameZh273) {

            this._$NameZh273 = _$NameZh273;
        }
    }


    public static class Addresstags {
        /**
         * postcode : 10117
         */

        private String postcode;

        public String getPostcode() {

            return postcode;
        }

        public void setPostcode(String postcode) {

            this.postcode = postcode;
        }
    }


    public static class Extratags {
        /**
         * wikidata : Q156716
         * wikipedia : de:Pariser Platz
         */

        private String wikidata;
        private String wikipedia;

        public String getWikidata() {

            return wikidata;
        }

        public void setWikidata(String wikidata) {

            this.wikidata = wikidata;
        }

        public String getWikipedia() {

            return wikipedia;
        }

        public void setWikipedia(String wikipedia) {

            this.wikipedia = wikipedia;
        }
    }


    public static class Centroid {
        /**
         * type : Point
         * coordinates : [13.3786822618517,52.5163654]
         */

        private String type;
        private List<Double> coordinates;

        public String getType() {

            return type;
        }

        public void setType(String type) {

            this.type = type;
        }

        public List<Double> getCoordinates() {

            return coordinates;
        }

        public void setCoordinates(List<Double> coordinates) {

            this.coordinates = coordinates;
        }
    }


    public static class Geometry {
        /**
         * type : Point
         * coordinates : [13.3786822618517,52.5163654]
         */

        private String type;
        private List<Double> coordinates;

        public String getType() {

            return type;
        }

        public void setType(String type) {

            this.type = type;
        }

        public List<Double> getCoordinates() {

            return coordinates;
        }

        public void setCoordinates(List<Double> coordinates) {

            this.coordinates = coordinates;
        }
    }
}
