package com.company;


//listing 4
// Map one stream to another.

import java.util.*;
import java.util.stream.*;

class StreamDemo4 {

    public static void main(String[] args) {

        // A list of double values.
        ArrayList<Double> myList = new ArrayList<>( );

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // Map the square root of the elements in myList to a new stream.
//        Stream<Double> sqrtRootStrm = myList.stream().map(Math::sqrt);

        // Find the product to the square roots.

        OptionalDouble average = myList.stream()
               .mapToDouble(aDouble -> aDouble)
                .max();
                //.orElse(Double.NaN);

        System.out.println(average);


        



    }


}