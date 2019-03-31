package leetcode.contests.contest_130;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryPrefixDivisibleByFive {
    BinaryPrefixDivisibleByFive binaryPrefixDivisibleByFive;

    @BeforeEach
    public void init() {
        binaryPrefixDivisibleByFive = new BinaryPrefixDivisibleByFive();
    }
/*
    @Test
    public void fistBinaryPrefixDivisibleByFive() {
        List<Boolean> result = binaryPrefixDivisibleByFive.prefixesDivBy5(new int[]{0, 1, 1});
        result.forEach(data -> System.out.print(data));
        //Assertions.assertEquals(Arrays.asList(new boolean[]{true,false,false}),result);
        System.out.println("");
    }

    @Test
    public void secondBinaryPrefixDivisibleByFive() {
        List<Boolean> result = binaryPrefixDivisibleByFive.prefixesDivBy5(new int[]{1, 1, 1});
        result.forEach(data -> System.out.print(data));
        System.out.println("");
    }

    @Test
    public void thirdBinaryPrefixDivisibleByFive() {
        List<Boolean> result = binaryPrefixDivisibleByFive.prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1});
        result.forEach(data -> System.out.print(data));
        System.out.println("");
    }




    @Test
    public void fourthBinaryPrefixDivisibleByFive() {
        List<Boolean> result = binaryPrefixDivisibleByFive.prefixesDivBy5(new int[]{1, 1, 1, 0, 1});
        result.forEach(data -> System.out.print(data));
        System.out.println("");
    }*/
    @Test
    public void fifthBinaryPrefixDivisibleByFive() {
        List<Boolean> result = binaryPrefixDivisibleByFive.prefixesDivBy5(new int[]{1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1});

        result.forEach(data -> System.out.println(data));
        System.out.println("");
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        //System.out.println("");
        List<Boolean> list = new ArrayList<>();

       for (int i = 1; i < A.length; i++) {
            list.add(helper(Arrays.copyOfRange(A,0,i+1)));
        }

       return list;

    }

    public boolean helper(int[] numbers){
        long result = 0;
        int count = 0;
        for(int i=numbers.length-1;i>=0;i--){
            if(numbers[i]==1)
                result+=(long)Math.pow(2, count);
            count++;
        }


        if(result%5==0)return true;
        else return false;

    }
}
//[1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0]