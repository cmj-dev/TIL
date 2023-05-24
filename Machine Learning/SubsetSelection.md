# Subset Selection
To get better model, we could use subset of predictors to train model.

And there is some methods for subset selection.

## 1. Best Subset Selection
The optimal way to get best subset is best subset selection.

In best subset selection method, we fit least square regression for all possible combinations of predictors.

Then, there will be $2^p$ number of model to fit.

Because of the **exponential complexity**, we use sub-optimal way to get best subset of predictors.

## 2. Stepwise Selection
We use greedy algorithms to solve this exponential complexity in stepwise selection.

There is two different way to use stepwise selection.

1. ### Forward stepwise selection
    In forward stepwise selection predictor selection starts with null model.

    Let's assume we have to get model with k+1 predictor.

    Then, based on previous model which has k predictor, we could choose one from all models which has one additional predictor from previous k predictors based on RSS or R-square score.

2. ### Backward stepwise selection
    Backward stepwise selection is started from full model which contains all p predictors.

    And choose one of the predictors which could make model better when that predictor was eliminated.

### **How to measure best number of predictors**
To measure the best number of predictors, there is 4 method to assume test error.

In this expressions, $d$ means number of predictors.

$$
C_p = \frac{1}{n}(RSS + 2d\hat\sigma^2)
$$

$$
AIC = \frac{1}{n\hat\sigma^2}(RSS + 2d\hat\sigma^2)
$$

$$
BIC = \frac{1}{n}(RSS + log(n)d\hat\sigma^2)
$$

$$
Adjusted\ R^2 = 1 - \frac{RSS/(n-d-1)}{TSS/(n-1)}
$$

For $C_p$, $AIC$ and $BIC$, when the better model has smaller value. In contrast, for $Adjusted\ R_2$,the better model has larger value.