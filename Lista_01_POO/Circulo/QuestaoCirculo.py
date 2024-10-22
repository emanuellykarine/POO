class Circulo:
    def __init__(self):
        self.raio = 0

    def area(self):
        return 3.14 * (self.raio * self.raio)
    
    def circunferencia(self):
        return 2 * 3.14 * self.raio


c = Circulo()

c.raio = int(input("Digite o raio do circulo: "))

print(f"Área do circulo = {c.area():.2f}")
print(f"Circunferência do círculo = {c.circunferencia():.2f}")
    