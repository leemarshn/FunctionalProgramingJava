package com.company;

import java.util.List;
import java.util.stream.Stream;

public class Demos {
    public static void main(String[] args) {
        int	stream	=	Stream.of("w",	"o",	"l",	"f!")
                .reduce(5,	(i, s)	->	i+s.length(), Integer::sum);
        //System.out.println(length);	//	5
    }
}
