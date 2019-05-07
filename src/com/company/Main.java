package com.company;

public class Main {

    private static long limit = 4000000;
    public static void main(String[] args) {
				Long num1 = 1L;
				Long num2 = 1L;
				Long answer = 0L;
				System.out.println(recursiveFib(num1, num2, answer));
				System.out.println("****");
				System.out.println(iterativeFib(limit));
    }


    private static Long iterativeFib (Long limit) {
        if (limit < 2) {
            return 0L;
        }
        long num1 = 0, num2 = 2;
        long sum = num1 + num2;
        while (num2 <= limit) {
            long num3 = 4 * num2 + num1;
            if (num3 > limit) {
                break;
            }
            num1 = num2;
            num2 = num3;
            sum += num2;
        }
        return sum;
    }

    private static Long recursiveFib (Long num1, Long num2, Long answer) {
        if (num2 >= limit) {
            return answer;
        } else if (num2 % 2 == 0) {
            answer = answer + num2;
        }
        return recursiveFib(num2, (num1 + num2), answer);
    }
}
