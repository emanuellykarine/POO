import math

class Equacao:
    def __init__(self, a, b, c):
        self.set_a(a)
        self.set_b(b)
        self.set_c(c)
    
    def set_a(self, a):
        if a > 0: self.__a = a
        else: raise ValueError("a nao pode ser negativo")

    def set_b(self, b):
        self.__b = b

    def set_c(self, c):
        self.__c = c

    def get_a(self):
        return self.__a

    def get_b(self):
        return self.__b
    
    def get_c(self):
        return self.__c
    
    def __str__(self):
        return f"a = {self.__a} b = {self.__b} c = {self.__c}"
    
    def calc_delta(self):
        return self.__b ** 2 - (4 * self.__a * self.__c)
    
    def calc_y(self, x):
        return (self.__a * (x ** 2)) + self.__b * x + self.__c
    
    def x_plano(self):
        return -self.__b / (2 * self.__a)
    
    def calc_x1(self):
        if self.calc_delta() < 0:
            return None
        else:
            return (-self.__b + math.sqrt(self.calc_delta())) / 2 * self.__a

    def calc_x2(self):
        if self.calc_delta() < 0:
            return None
        else:
            return (-self.__b - math.sqrt(self.calc_delta())) / 2 * self.__a
