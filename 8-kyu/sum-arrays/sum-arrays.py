def sum_array(array):
    count = 0
    if len(array) == 0:
        return 0
    for i in array:
        count += i
    return count