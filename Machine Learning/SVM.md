# Support Vector Machine

Support Vector Machine is one of the way to classify the dataset.

When we classify the data, many hyperplane will exist. So, we could get the best hyperplane which has largest margin from the observations.

And here is the expression to get that hyperplane.

$$

y_i(\beta_0 + \beta_1x_{i1} + \beta_2x_{i2} + ...\ + \beta_px_{ip}) \ge M

$$

However, when we got the hyperplane by this way, 
1. hyperplane has risk of overfitting because it will depend on few samples. 
2. And when the observations are not possible to seperated with linear hyperplane, the hyperplane coludn't exist.

So, we have to fix the expression to allow some errors.

$$

y_i(\beta_0 + \beta_1x_{i1} + \beta_2x_{i2} + ...\ + \beta_px_{ip}) \ge M(1-\epsilon_i) \\
 \ \\
\sum_{i=1}^n\epsilon_i \le C

$$

So, with large C, we could get low variance and large bias hyperplane.

And with kernel trick, we could get non-linear hyperplane.
