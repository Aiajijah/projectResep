package com.example.projectresep;

import java.io.Serializable;
import java.util.List;

public class Resep implements Serializable {
    private List<IsiResep> results;

    public Resep(List<IsiResep> results) {
        this.results = results;
    }

    public List<IsiResep> getResults() {
        return results;
    }

    public void setResults(List<IsiResep> results) {
        this.results = results;
    }
}