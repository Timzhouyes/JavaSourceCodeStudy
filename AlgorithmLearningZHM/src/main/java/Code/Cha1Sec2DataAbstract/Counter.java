package Code.Cha1Sec2DataAbstract;

public class Counter {

    Integer countTime;

    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        //Then can make sure the class is a 'Counter' class and do type convert
        Counter c = (Counter) x;
        if (this.countTime != c.countTime) return false;
        return true;
    }
}
