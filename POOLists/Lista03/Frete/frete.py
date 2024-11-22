class Frete:
    def __init__(self, peso, distancia):
        self.set_distancia(distancia)
        self.set_peso(peso)
        
    def set_peso(self, p):
        if p > 0: self.__peso = p
        else: raise ValueError("O peso nao pode ser negativo.")

    def set_distancia(self, d):
        if d > 0: self.__distancia = d
        else:raise ValueError("A distancia nao pode ser negativa.")
    
    def get_distancia(self):
        return self.__distancia

    def get_peso(self):
        return self.__peso
    
    def calc_frete(self):
        return (self.__peso / self.__distancia) * 0.01
    
    def __str__(self):
        return f"Peso = {self.__peso}Kg, Distancia = {self.__distancia}Km"


class UI:
    @staticmethod
    def main():
        peso = float(input("Digite o peso: "))
        distancia = float(input("Digite a distancia: "))

        f = Frete(peso, distancia)
        print(f)
        print(f"Frete = {f.calc_frete()}")

UI.main()