def calculate_age(year_of_birth, current_year):
    date = abs(current_year - year_of_birth)
    if date == 0:
            return f"You were born this very year!"
    if current_year >= year_of_birth:
        if date == 1:
            return f"You are {date} year old."
        return  f"You are {date} years old."
    else:
        if date == 1:
            return f"You will be born in {date} year."
        return f"You will be born in {date} years."