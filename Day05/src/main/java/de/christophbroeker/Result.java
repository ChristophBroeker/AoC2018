package de.christophbroeker;

class Result {

    private final String unit;

    private final StringBuilder resultPolymer;

    Result(final String unit, final StringBuilder resultPolymer){
        this.unit = unit;
        this.resultPolymer = resultPolymer;
    }

    String getUnit() {
        return unit;
    }

    StringBuilder getResultPolymer() {
        return resultPolymer;
    }
}
