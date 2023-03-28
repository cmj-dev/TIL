# Simple Linear Regression

In the following expression when we regress $Y$ onto $X$
$$ Y \approx \beta_0 + \beta_1X $$
$Y$ is true value, $X$ is a predictor, $\beta_0$ is intercept and $\beta_1$ is slope.


By Training Data, we can train the simple linear regression model looks like this; $\hat{y} = \hat{\beta_0} + \hat{\beta_1}x $

## How to train

To train the model, we have to find $\beta_1$ and $\beta_0$ which could minimize the RSS(Residual sum of squares)

> ### Residual Sum of Squares
> Residual could be breifly understood as error of prediction
>
> *i* th residual can be represented like this; $e_i = y_i - \hat{y_i}$
>
>So, Residual sum of squares is 
>$$ RSS = \sum_{i=1}^{n} e_i^2 = \sum_{i=1}^{n}(y_i -\hat{\beta_0} - \hat{\beta_1}x_i)^2$$

## How to check the accuracy of our model
Because we trained the model to minimize the RSS in our train dataset, when the train dataset changes, model will also changed.

So we use **Standard Error** to measure how estimate varies under repeated sampling.

### Standard Error
There are three values which affect Standard Error
- sample size ($n$)
- Variation of sample ($\sum_{i=1}^n(x_i - \bar x)^2$)
- Varience of irreducible error ($\sigma ^2$)

Standard Error of intercept and slope are represented like this
$$SE(\hat\beta_0)^2 = \sigma^2[\frac1n+ \frac{\bar x^2}{\sum_{i=1}^n(x_i - \bar x)^2}]$$
$$SE(\hat\beta_1)^2 =\frac {\sigma^2} {\sum_{i=1}^n(x_i - \bar x)^2}$$

So we can see that
1. The larger the sample size, the lower SE is.
2. The larger the variation of sample, the lower SE is.
3. Ther lagrger the varience of irreducible error, the higher SE is.

