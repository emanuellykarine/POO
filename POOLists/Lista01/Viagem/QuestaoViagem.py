class Viagem:
    def __init__(self):
        self.distancia = 0
        self.tempo = 0
    
    def velocidade(self):
        return self.distancia / self.tempo
    

v = Viagem()

v.distancia = int(input("Informe a distância: "))
v.tempo = int(input("Digite o tempo: "))
print(f"Velocidade média = {v.velocidade():.2f}")