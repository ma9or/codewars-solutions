def change(st):
    new_str = ""
    sent = "abcdefghijklmnopqrstuvwxyz"
    st = st.lower()
    for c in sent:
        if c in st:
            new_str += "1"
        else:
            new_str += "0"
    return new_str
        