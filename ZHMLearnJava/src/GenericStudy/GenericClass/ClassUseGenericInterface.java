package GenericStudy.GenericClass;

import java.util.Random;

public class ClassUseGenericInterface implements GenericInterface<String> {
    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
