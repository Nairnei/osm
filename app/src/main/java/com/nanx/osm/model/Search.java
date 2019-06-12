package com.nanx.osm.model;

import java.util.List;



public class Search {

    private String type;
    private String licence;
    private List<Features> features;

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getLicence() {

        return licence;
    }

    public void setLicence(String licence) {

        this.licence = licence;
    }

    public List<Features> getFeatures() {

        return features;
    }

    public void setFeatures(List<Features> features) {

        this.features = features;
    }

    public static class Features {
        /**
         * type : Feature
         * properties : {"place_id":"35811445","osm_type":"node","osm_id":"2846295644","display_name":"17, Strada Pictor Alexandru Romano, Bukarest, Bucharest, Sector 2, Bucharest, 023964, Romania","place_rank":"30","category":"place","type":"house","importance":0.62025}
         * bbox : [26.1156689,44.4354754,26.1157689,44.4355754]
         * geometry : {"type":"Point","coordinates":[26.1157189,44.4355254]}
         */

        private String type;
        private Properties properties;
        private Geometry geometry;
        private List<Double> bbox;

        public String getType() {

            return type;
        }

        public void setType(String type) {

            this.type = type;
        }

        public Properties getProperties() {

            return properties;
        }

        public void setProperties(Properties properties) {

            this.properties = properties;
        }

        public Geometry getGeometry() {

            return geometry;
        }

        public void setGeometry(Geometry geometry) {

            this.geometry = geometry;
        }

        public List<Double> getBbox() {

            return bbox;
        }

        public void setBbox(List<Double> bbox) {

            this.bbox = bbox;
        }

        public static class Properties {
            /**
             * place_id : 35811445
             * osm_type : node
             * osm_id : 2846295644
             * display_name : 17, Strada Pictor Alexandru Romano, Bukarest, Bucharest, Sector 2, Bucharest, 023964, Romania
             * place_rank : 30
             * category : place
             * type : house
             * importance : 0.62025
             */

            private String place_id;
            private String osm_type;
            private String osm_id;
            private String display_name;
            private String place_rank;
            private String category;
            private String type;
            private double importance;

            public String getPlace_id() {

                return place_id;
            }

            public void setPlace_id(String place_id) {

                this.place_id = place_id;
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

            public String getDisplay_name() {

                return display_name;
            }

            public void setDisplay_name(String display_name) {

                this.display_name = display_name;
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

            public double getImportance() {

                return importance;
            }

            public void setImportance(double importance) {

                this.importance = importance;
            }
        }


        public static class Geometry {
            /**
             * type : Point
             * coordinates : [26.1157189,44.4355254]
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
}
