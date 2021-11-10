public class Microtransistor implements Speed {
    private SpeedometerInMiles speedometerInMiles;

    public Microtransistor(SpeedometerInMiles speedometerInMiles) {
        this.speedometerInMiles = speedometerInMiles;
    }

    @Override
    public void showSpeedInKM() {
        this.speedometerInMiles.checkSpeed();
        this.speedometerInMiles.showSpeed();
    }
}
