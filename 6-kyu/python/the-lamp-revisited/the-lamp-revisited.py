class Lamp:
    def __init__(self, color):
        self.color = color
        self.on = False
        
    def toggle_switch(self):
        if self.on:
            self.on = False
            return self.on
        else:
            self.on = True
            return self.on
    
    def state(self):
        if self.on:
            return "The lamp is on."
        else:
            return "The lamp is off."