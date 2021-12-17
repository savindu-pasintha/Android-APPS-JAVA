package com.Retrofit_Rest_Api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataSet {

    @SerializedName("total")
    @Expose
    private String total;

    @SerializedName("totalHits")
    @Expose
    private String totalHits;

    @SerializedName("hits")
    @Expose
    private List<HitsList> hits;

    public DataSet(String total, String totalHits, List<HitsList> hits) {
        this.total = total;
        this.totalHits = totalHits;
        this.hits = hits;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(String totalHits) {
        this.totalHits = totalHits;
    }

    public List<HitsList> getHits() {
        return hits;
    }

    public void setHits(List<HitsList> hits) {
        this.hits = hits;
    }
}
