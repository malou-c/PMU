package com.example.app_lab1;

/**
 * Class math functions
 * @version 1.0
 */
public class MyMath {

    /**
     * Static method for finding the minimum in an array
     * @param arr - array int values
     * @return min (int)
     */
    public static int Min(int[] arr)
    {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (mini > arr[i]){
                mini = arr[i];
            }
        }
        return mini;
    }

    
    /**
     * Static method for finding the minimum of two elements
     * @param x - first arg
     * @param y - second arg
     * @return min (int)
     */
    public static int Min(int x, int y)
    {
        if (x <= y)
            return x;
        else
            return y;
    }

    /**
     * Static method for finding the maximum in an array
     * @param arr - array int values
     * @return max (int)
     */
    public static int Max(int[] arr)
    {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (mini < arr[i]){
                mini = arr[i];
            }
        }
        return mini;
    }

    /**
     * Static method for finding the maximum of two elements
     * @param x - first arg
     * @param y - second arg
     * @return max (int)
     */
    public static int Max(int x, int y)
    {
        if (x >= y)
            return x;
        else
            return y;
    }
}
