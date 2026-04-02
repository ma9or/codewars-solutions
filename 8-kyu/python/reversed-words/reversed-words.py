def reverse_words(s):
    new_list = s.split()
    new_list.reverse()
    return ' '.join(new_list)