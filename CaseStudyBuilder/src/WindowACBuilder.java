public class WindowACBuilder implements ACBuilder{

    private final AC ac = new AC("WINDOW AC");

    @Override
    public void buildCapacity() {
        ac.setCapacity("1.5 Ton - suitable for medium rooms");
    }

    @Override
    public void buildCompressorType() {
        ac.setCompressorType("Rotary Compressor (Fixed Speed)");
    }

    @Override
    public void buildRefrigerant() {
        ac.setRefrigerant("R410A Gas");
    }

    @Override
    public void buildFilterType() {
        ac.setFilterType("Standard Washable Dust Filter");
    }

    @Override
    public void buildDisplayType() {
        ac.setDisplayType("Digital Panel with physical buttons");
    }

    @Override
    public void buildSmartFeatures() {
        ac.setSmartFeatures("Remote Control operated (No Wi-Fi)");
    }

    @Override
    public AC getAC() {
        return ac;
    }
}
