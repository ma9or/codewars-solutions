import random
class Ghost(object):
    list = ["white", "yellow", "purple", "red"]
    
    def __init__(self):
        self.color = random.choice(self.list)