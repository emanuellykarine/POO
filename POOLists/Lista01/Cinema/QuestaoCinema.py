class Cinema:
    def __init__(self):
        self.dia = ""
        self.horario = 0

    def ingressoDia(self):
        if (self.dia == "Segunda" or self.dia == "Terça" or self.dia == "Quinta"):
            if (self.horario >=17):
                return 24
            else:
                return 16
        elif (self.dia == "Sexta" or self.dia == "Sábado" or self.dia == "Domingo"):
            if (self.horario >= 17):
                return 30
            else:
                return 20;
        else:
            return 8
        

c = Cinema()
c.dia = input("Digite o dia da sessão (ex: Domingo): ")
horarioString = input("Digite o horário da sessão (ex: 15:30): ")
horario = list(horarioString.split(":"))
c.horario = int(horario[0])

print (f"Valor do ingresso = R$ {c.ingressoDia():.2f}")

