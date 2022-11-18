package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class FizzBuzz
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fizzBuzz(n);
    }

    public static List<String> fizzBuzz(int n) {
        String[] fizz_buzz = new String[n];
        for(int i = 0; i < n; i++){
            fizz_buzz[i] = Integer.toString(i + 1);
            int n_i = i + 1;
            if(n_i % 3 == 0 && n_i % 5 == 0){
                fizz_buzz[i] = "FizzBuzz";
            }else if(n_i % 3 == 0){
                fizz_buzz[i] = "Fizz";
            }else if(n_i % 5 == 0){
                fizz_buzz[i] = "Buzz";
            }
        }
        List<String> res = new ArrayList<>(Arrays.asList(fizz_buzz));
        return res;
    }
}
