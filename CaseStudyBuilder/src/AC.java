public class AC {
    private String capacity;
    private String compressorType;
    private String refrigerant;
    private String filterType;
    private String displayType;
    private String smartFeatures;
    private String acType;

    public AC(String acType) {
        this.acType = acType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    public String getRefrigerant() {
        return refrigerant;
    }

    public void setRefrigerant(String refrigerant) {
        this.refrigerant = refrigerant;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getSmartFeatures() {
        return smartFeatures;
    }

    public void setSmartFeatures(String smartFeatures) {
        this.smartFeatures = smartFeatures;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------").append(acType).append("---------------------\n");
        sb.append(" Capacity: ").append(capacity);
        sb.append("\n Compressor: ").append(compressorType);
        sb.append("\n Refrigerant: ").append(refrigerant);
        sb.append("\n Filter: ").append(filterType);
        sb.append("\n Display: ").append(displayType);
        sb.append("\n Smart Features: ").append(smartFeatures);
        sb.append("\n");
        return sb.toString();
    }
}
