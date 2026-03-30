def abbrev_name(name):
    x = [word[0].upper() for word in name.split(" ")]
    return '.'.join(x)