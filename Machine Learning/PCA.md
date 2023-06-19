# Principal Components Analysis

PCA is a unsupervised learning method for dimension reduction.

Here are some steps to find principal components.

1. Find the first principal component which could explain largest variance of original dataset.

    That component $Z$ could satisfing the expression below.

    $$

    \begin{align}

    z_{i1} = \sum_{j=1}^p\phi_{j1}x_{ij}\\

    maximize\{\frac{1}{n}\sum_{i=1}^nz_{i1}^2\} \\

    subject\ to \sum_{j=1}^p\phi^2_{j1} = 1

    \end{align}

    $$
2. Find second principal component which is orthogonal with first principal component and explain the largest variance of original dataset.

With these steps we could find the principal components to explain the original dataset.