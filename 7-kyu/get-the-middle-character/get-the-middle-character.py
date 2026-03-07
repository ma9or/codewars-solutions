def get_middle(s):
    len_s = len(s)
    if len_s % 2 != 0:
        return s[len_s // 2]
    return s[len_s // 2 - 1] + s[len_s // 2]