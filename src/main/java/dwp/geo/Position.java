package dwp.geo;

public class Position {
    public double latitude;
    public double longitude;

    public Position(double latitude, double longitude) {
        setPosition(latitude, longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setPosition(double latitude, double longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    @Override
    public String toString() {
        return String.format("Position(%f,%f)", latitude, longitude);
    }
}
