# Inner Product (Dot Product)
Inner Product (Dot Product) of n-vector $a$ and $b$ is
$$ a^Tb = a_1b_1 + a_2b_2 + ... + a_nb_n $$
$ a \cdot b $ is also used for notation of dot product

## Python use
```python
np.inner(x,y)
x@y
sum(x*y)
```

## Properties of inner product
- **Commutativity**

$$ a^Tb = b^Ta $$

- **Associativity** (with scalar multiplication)

$$ (\gamma a)^Tb = \gamma (a^Tb) $$

- **Distributivity**

$$ (a+b)^Tc = a^Tc + b^Tc $$