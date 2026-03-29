def square_digits(num):
    x = [str(int(ch) ** 2) for ch in str(num)]
    x = "".join(x)
    return int(x)
​
    # Your code here