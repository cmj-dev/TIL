## **Cross Validation**
To estimate the test error rate, we hold out a subset of training dataset and use them as a validation data.

And there are three method to make validation dataset.

### **1. Validation set approach**

In validation set approach, 
1. randomly split data into training and validation data
2. fit the model using trainind data
3. apply fitted model to the validation data and get validation accuracy

There is some disadvantages in this approach:
1. Validation MSE has high variance depend on validation data
2. Because we use a subset only for validation, there are only few samples to train model.

### **2. Leave-One-Out Cross Validation(LOOCV)**

To get lower variance of validation score and larger training set, we use LOOCV method.

In LOOCV method, when there is n-samples, we use n-1 samples for training set and use a single sample for validation.

And repeat this for n times.

So we could get MSE like the expression below

$$
CV_{(n)} = \frac{1}{n}\sum_{i=1}^n MSE_i
$$

By this method,
1. We could get **low bias** because we could use all dataset for training.
2. We could get **low variability** of MSE
3. However, because we have to train model for n times and calculate MSE for n times, this method is **computaionally intensive**

### **3. k-fold Cross Validation**
So we use k-fold cross validation method to cover the cons of LOOCV.

In k-fold Cross Validation method, we divide dataset as k partial subset and use one subset for validation and use the others for train.

And repeat that for k times.

So we could get MSE like the expression below

$$
CV_{(k)} = \frac{1}{k}\sum_{i=1}^k MSE_i
$$