package com.hritik.epamtask10_Hritik;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageTask 
{
	public static void main(String[] args) 
	{
        IntStream stream = IntStream.of(42,43,143);
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) 
        {
            System.out.println(obj.getAsDouble());
        } 
        else 
        {
            System.out.println(-1);
        }
    }
}
