# Dimension Reduction
When there are many predictors and all of that predictor's coef are not zero, we could use dimension reduction

## Steps of dimension reduction

$$

\begin{align}
1.\ &Z_m = \sum_{j = 1}^{p}\phi_{jm} X_j\\
2.\ & \hat y_i = \theta_0 + \sum_{m=1}^M\theta_m z_{im}
\end{align}

$$

And in expression 2, $ z_{im} =  \sum_{j = 1}^{p}\phi_{jm} x_{ij}$

So,
$$

\begin{align}
&\sum_{m=1}^M\theta_m\sum_{j = 1}^{p}\phi_{jm} x_{ij}\\
=& \sum_{j = 1}^{p}\sum_{m=1}^M\theta_m\phi_{jm} x_{ij}\\
=& \sum_{j = 1}^{p}\beta_jx_{ij}
\end{align}

$$

With this expressions, we could recognize that dimension reduction is good for all predictors have non-zero coefs.