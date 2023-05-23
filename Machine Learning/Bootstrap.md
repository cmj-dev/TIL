# **Bootstrap**
Bootstrap is also the method for resampling.

In real world, we could't get many samples from the true model.

So, with the sample already exist, we have to generate new sample for extra works with that model.

And bootstrap method works well with that purpose.

We also call this method as monte carlo method

## How bootstrap works
1. With given dataset which have n elements, we randomly select *n* elements **with replacement**
2. Repeat random selection for B times
3. Then we could get B samples which have similer Standard Error with true model samples.