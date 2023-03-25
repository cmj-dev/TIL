# Primality test
Briefly there are two category of algorithm to determine whether the number is prime or not

---

## 1. Divide from 2 to square root of the target number.
If we just want to determine whether the number is prime or not, we can use this algorithm.

This is because the divisors of a target number are always less than or equal to the square root of the number.

There is a problem to apply this alogrithm.

[4134. 다음 소수](https://www.acmicpc.net/problem/4134)

[My code](https://github.com/cmj-dev/alogStudy/blob/master/baekjoon/4134.py)

---

## 2. Sieve of Eratosthenes
But if there are a lot of number to determine, such as the [problem](https://www.acmicpc.net/problem/1929) of finding the number of primes within a certain range, the first way will not that efficent to apply because of redundant computations.

So for this case, we can apply [sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)

![sieve of Eratosthenes gif](./img/Sieve_of_Eratosthenes_animation.gif)

There is a problem to apply this alogrithm.

[4948. 베르트랑 공준](https://www.acmicpc.net/problem/4948)

[My code](https://github.com/cmj-dev/alogStudy/blob/master/baekjoon/4948.py)

In this algorithm first algorithm(Divide from 2 to square root of the target number) is also applied