def high_and_low(numbers):
    total = ""
    numbers = [int(ch) for ch in numbers.split(" ")]
    total += str(max(numbers)) + " " + str(min(numbers))
    return total