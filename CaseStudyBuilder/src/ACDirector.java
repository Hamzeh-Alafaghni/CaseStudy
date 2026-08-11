public class ACDirector {

    private ACBuilder acBuilder;

    public ACDirector(ACBuilder acBuilder) {
        this.acBuilder = acBuilder;
    }

    public void build() {
        acBuilder.buildCapacity();
        acBuilder.buildCompressorType();
        acBuilder.buildRefrigerant();
        acBuilder.buildFilterType();
        acBuilder.buildDisplayType();
        acBuilder.buildSmartFeatures();
    }
}