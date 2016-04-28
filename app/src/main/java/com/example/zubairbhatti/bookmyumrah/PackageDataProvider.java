package com.example.zubairbhatti.bookmyumrah;

/**
 * Created by Zubair Bhatti on 4/12/2016.
 */
public class PackageDataProvider {
    private int package_poster_resource;
    private String package_title;
    private String package_rating;
    private String package_customer_rating;

    public PackageDataProvider(String package_title, String package_rating, String package_customer_rating){

        //this.setPackage_poster_resource(package_poster_resource);
        this.setPackage_title(package_title);
        this.setPackage_rating(package_rating);
        this.setPackage_customer_rating(package_customer_rating);

    }
/*

    public int getPackage_poster_resource() {
        return package_poster_resource;
    }

    public void setPackage_poster_resource(int package_poster_resource) {
        this.package_poster_resource = package_poster_resource;
    }
*/

    public String getPackage_title() {
        return package_title;
    }

    public void setPackage_title(String package_title) {
        this.package_title = package_title;
    }

    public String getPackage_rating() {
        return package_rating;
    }

    public void setPackage_rating(String package_rating) {
        this.package_rating = package_rating;
    }
    public String getPackage_customer_rating() {
        return package_rating;
    }

    public void setPackage_customer_rating(String package_customer_rating) {
        this.package_customer_rating = package_customer_rating;
    }
}



