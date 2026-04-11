def fuel_price(litres, price_per_litre):
    if litres >= 10:
        discount = 0.25
    elif litres >= 8:
        discount = 0.20
    elif litres >= 6:
        discount = 0.15
    elif litres >= 4:
        discount = 0.10
    elif litres >= 2:
        discount = 0.05
    else:
        discount = 0
    
    return round(litres * (price_per_litre - discount), 2)