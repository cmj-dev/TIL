# **Shrinkage Methods**
Shrinkage methods regularize predictor coefficents for higher model accuracy and interpret models well.

To use regularization, regression model add penalty term at $ RSS $ expression.

And there are two regularization methods.

### **Why shrinkage methods are useful?**
* Because some coefs of predictor are don't have significant coefficents we could get **lower variance** model with shrinkage methods.
* However, trade-off of bias and variance is exist. So, when the penalty term is powerful, the bias will increase.
## **1. Ridge Regression**
In Ridge Regression, penalty term is formed square of coeffiecnets and it looks like the expression below.

$$
\sum_{i=1}^n(y_i-\beta_0-\sum_{j=1}^p{\beta_jx_{ij}})^2 + \lambda\sum_{j=1}^p\beta_j^2
$$

In this expression, $\lambda\sum_{j=1}^p\beta_j^2$ is the **penalty term**.


And with this ridge regression,
* Few $\beta$ have large values and the others shrink toward zero.
* However, it's hard to reduce $ \beta $ to zero.
## **2.Lasso Regression**
So we could use another penalty term for regularlization. ; absolute.

In Lasso Regression, we have to minimize expression below.

$$
\sum_{i=1}^{n}(y_i - \beta_0 - \sum_{j=1}^{p}\beta_jx_{ij})^2 + \lambda\sum_{j=1}^p|\beta_j|
$$

As we can see, Lasso Regression use sum of absolute beta as regression term.

With this Lasso Regression,
* We could minimize $\beta$ to zero.
    
    With only few predictors, it will be easier to interprete.

* Good for sparse model.