# **Shrinkage Methods**
Shrinkage methods regularize predictor coefficents for higher model accuracy and interpret models well.

To use regularization, regression model add penalty term at RSS expression.

And we could classify regularization methods as two methods based on thier penalty term.

### **Then, why shrinkage methods are useful?**
* With shrinkage method, we could get **lower variance** model.
    * Because some coefs of predictor are zero, the 
## **1. Ridge Regression**
In Ridge Regression, penalty term is formed square of coeffiecnets and it looks like the expression below.

$$
\sum_{i=1}^n(y_i-\beta_0-\sum_{j=1}^p{\beta_jx_{ij}})^2 + \lambda\sum_{j=1}^p\beta_j^2
$$

In this expression, $\lambda\sum_{j=1}^p\beta_j^2$ is the **penalty term**.


And with this ridge regression,
* Few $\beta$ have large values and the others shrink toward zero.
* 
