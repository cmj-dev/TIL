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
In forward stepwise selection 