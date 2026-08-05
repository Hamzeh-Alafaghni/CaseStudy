public class SplitACBuilder implements ACBuilder{
    private final AC ac = new AC("SPLIT AC");

    @Override
    public void buildCapacity() {
        ac.setCapacity("2.0 Ton - suitable for large rooms");
    }

    @Override
    public void buildCompressorType() {
        ac.setCompressorType("Dual Inverter Compressor (Energy Saving)");
    }

    @Override
    public void buildRefrigerant() {
        ac.setRefrigerant("R32 Eco-friendly Gas");
    }

    @Override
    public void buildFilterType() {
        ac.setFilterType("Anti-Bacterial and PM 2.5 Filter");
    }

    @Override
    public void buildDisplayType() {
        ac.setDisplayType("Hidden LED Display on indoor unit");
    }

    @Override
    public void buildSmartFeatures() {
        ac.setSmartFeatures("Wi-Fi enabled, Compatible with Alexa and Google Assistant");
    }

    @Override
    public AC getAC() {
        return ac;
    }
}
