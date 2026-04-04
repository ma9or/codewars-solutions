class Router(object):
    def __init__(self):
        self.dict = {}
    
    def bind(self, url, method, action):
        self.dict[(url, method)] = action
    
    def runRequest(self, url, method):
        if (url, method) in self.dict:
            return self.dict[(url, method)]()
        else:
             return "Error 404: Not Found"
            
        