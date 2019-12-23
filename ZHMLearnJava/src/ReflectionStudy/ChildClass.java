package ReflectionStudy;

class ChildClass extends ParentClass {
    public String childName;
    public int childAge;
    public String childBirthday;

    public void printChildMsg() {
        System.out.println("Child attributes are: childAge: " + childAge + " childName " + childName);
    }
}
