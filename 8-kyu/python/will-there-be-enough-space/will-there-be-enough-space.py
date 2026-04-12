def enough(cap, on, wait):
    free_sits = cap - on
    if free_sits < wait:
        return wait - free_sits
    return 0
    