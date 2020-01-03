package GenericStudy.GenericClass;

public class GenericClassExample<SB> {
    private SB key;

    public GenericClassExample(SB key) {
        this.key = key;
    }

    public SB getKey() {
        return key;
    }
}
