package ReflectionStudy

class ChildClass extends ParentClass {
    String childName;
    int childAge;
    String childBirthday;

    void printChildMsg() {
        System.out.println("Child attributes are: childAge: " + childAge + " childName " + childName);
    }
}
