package ReflectionStudy;

public class FinalFieldClassWithConstructor {
    private final String FINAL;

    public FinalFieldClassWithConstructor() {
        this.FINAL = "FINAL VALUE";
    }

    public String getFINAL() {
        return FINAL;
    }
}
