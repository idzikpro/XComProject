package pl.idzikpro.xcom.tools;


import java.util.*;

public class Tools {

    static Random random = new Random();

    public static int drawNumber(int left, int right) {
        return random.nextInt(right - left + 1) + left;
    }

}