package GenericStudy.GenericClass;


public class GenericClassTesting {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        GenericClassExample<Integer> genericInteger = new GenericClassExample<Integer>(123);
        GenericClassExample<String> genericString = new GenericClassExample<String>("Hello");

        System.out.println("genericInteger is " + genericInteger.getKey());
        System.out.println("genericString is " + genericString.getKey());

        System.out.println("********Below is without real parameter of type*******");
        GenericClassExample generic = new GenericClassExample(123);
        GenericClassExample generic2 = new GenericClassExample("String");

        System.out.println("Generic is " + generic.getKey());
        System.out.println("Generic2 is " + generic2.getKey());

        System.out.println("*********Below is Wildcard example***************");
        GenericClassExample<Integer> gInteger = new GenericClassExample<>(123);
        GenericClassExample<Number> gNumber = new GenericClassExample<>(456);
        showValue(gInteger);

        System.out.println("************");
//        GenericClassExample gExample = new GenericClassExample();
        Object obj = genericMethod(Class.forName("GenericStudy.GenericClass.GenericClassImpl"));
        System.out.println(obj);
    }

    public static void showValue(GenericClassExample<?> obj) {
        System.out.println("Key value is " + obj.getKey());
    }

    public static <SB> SB genericMethod(Class<SB> sbClass) throws InstantiationException, IllegalAccessException {
        SB instance = sbClass.newInstance();
        return instance;
    }

}
