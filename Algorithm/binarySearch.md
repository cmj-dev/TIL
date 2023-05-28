# Binary Search
Binary search is the basic concept to search target in sorted list (ascending order).

To search target in O(logN) time,

1. Compare middle element of list with target.

2. If target and middle element is equal, stop searching
    
    If target is not equal with middle element, there is two case.
     
    * if target is larger then middle element, set start point of list as middle+1

    * if target is smaller then middle element, set end point of list as middle - 1

    and start compare again.

Here is the python code which emplements binary search.
```python
        def search(nums, target):
            start, end = 0, len(nums)-1
            answer = -1
            while start <= end:
                mid = (start + end) // 2
                if nums[mid] == target:
                    answer = mid
                    break
                elif nums[mid] > target:
                    end = mid-1
                else:
                    start = mid+1
            return answer
```

### There are examples to apply this alogrithm.
- [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=study-plan&id=algorithm-ii)
    - [Answer](https://github.com/cmj-dev/alogStudy/blob/master/leetCode/33.py)
- [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/)
    - [Answer](https://github.com/cmj-dev/alogStudy/blob/master/leetCode/34.py)
- [74. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/description/?envType=study-plan&id=algorithm-ii)
    - [Answer](https://github.com/cmj-dev/alogStudy/blob/master/leetCode/74.py)