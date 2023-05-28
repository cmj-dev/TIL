# Greate Common Divisor
To calculate the greatest common divisor (gcd) of two numbers there is one useful algorithm called '[Euclidean Algorithm](https://en.wikipedia.org/wiki/Euclidean_algorithm)'

## Euclidean Algorithm

Euclidean algortihm is run like this image below

<img src="./img/340px-Euclidean_algorithm_1071_462.gif" width="100px">

There is rectangle which is size of 1071 by 462.

Then we can divide that rectangle to two of 462X462 and one 462X147 rectangle.

And when we do this continuously, the size of last square is 21X21 and it will be the greatest
common divisor of 462 and 1071.

So we can code this in python as follows.

```python
def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
```

### There are examples to apply this alogrithm.

- [13241. 최소공배수](https://www.acmicpc.net/problem/13241)

    [My code](https://github.com/cmj-dev/alogStudy/blob/master/baekjoon/13241.py)

- [1735. 분수합](https://www.acmicpc.net/problem/1735)

    [My code](https://github.com/cmj-dev/alogStudy/blob/master/baekjoon/1735.py)

- [2485. 가로수](https://www.acmicpc.net/problem/2485)

    [My code](https://github.com/cmj-dev/alogStudy/blob/master/baekjoon/2485.py)