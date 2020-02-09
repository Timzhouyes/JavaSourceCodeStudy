package NoteByMyself.Cha1Sec1;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Here is the example of Page 27. Learning how to use StdDraw.
 */
public class DrawingExamples {
    public static void main(String[] args) {
        double N;
        N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i < 100; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }
}
