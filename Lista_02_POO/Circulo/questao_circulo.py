class Circulo:
    def __init__(self):
        self.__raio = 0
    
    def set_raio(self, r):
        if r > 0: self.__raio = r
        else: raise ValueError("o raio nao pode ser negativo")
        
    def get_raio (self):
        return self.__raio 
    
    def area(self):
        return 3.14 * (self.__raio * self.__raio)
    
    def circunferencia(self):
        return 2 * 3.14 * self.__raio
    

class UI:
    @staticmethod
    def main():
        c = Circulo()
        c.set_raio(float(input("informe raio do circulo: ")))

        print (f"Raio = {c.get_raio()}")
        print (f"Area = {c.area():.2f}")
        print (f"Circunferencia = {c.circunferencia():.2f}")

UI.main()