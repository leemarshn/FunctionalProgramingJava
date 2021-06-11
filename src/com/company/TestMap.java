package com.company;


import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestMap {
    public static void main(String[] args) {


        Stream<String>	stream	=	Stream.of("w",	"o",	"l",	"f!");
        int	length	=	stream.reduce(0,	(i,	s)	->	i+s.length(),	(a,	b)	->
                a+b);
    }
}
