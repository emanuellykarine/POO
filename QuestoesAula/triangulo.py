class Triangulo:
    def __init__(self):
        self.__b = 0
        self.__h = 0

    def set_base(self, v):
        if v > 0: self.__b = v
        else: raise ValueError("a base nao pode ser negativa")
    
    def set_altura(self, v):
        if v > 0: self.__h = v
        else: raise ValueError("a altura nao pode ser negativa")

    def get_base(self):
        return self.__b
    
    def get_altura(self):
        return self.__h

    def calc_area(self):
        return self.__b * self.__h / 2  
    

class UI:
    @staticmethod
    def main():
        x = Triangulo()  # Triangulo() cria um objeto da classe
                        # x é uma referência para esse objeto
        #x.b = float(input("Informe o valor da base do triângulo: "))
        #x.h = float(input("Inform o valor da altura: "))
        x.set_base(float(input("Informe o valor da base do triângulo: ")))
        x.set_altura(float(input("Informe o valor da altura do triângulo: ")))
        
        print(f"Base= {x.get_base()} Altura = {x.get_altura()}")
        print(f"Área = {x.calc_area():.2f}")

UI.main()