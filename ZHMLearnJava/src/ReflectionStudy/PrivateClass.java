package ReflectionStudy;

public class PrivateClass {
    private String MSG = "Original";

    private void output(String para1, int para2) {
        System.out.println(para1 + " " + para2);
    }

    public String getMSG() {
        return MSG;
    }
}
