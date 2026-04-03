def solution(string):
    new = [ch for ch in string]
    new.reverse()
    new_line = ''.join(new)
    return new_line