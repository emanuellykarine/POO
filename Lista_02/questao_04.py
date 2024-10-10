base, altura = map(float, input("Digite a base e a altura do retângulo: ").split())

area = (base * altura)
perimetro = (base * 2) + (altura * 2)
diagonal = ((base ** 2) + (altura ** 2)) ** 0.5

print (f"Área = {area:.2f} - Perímetro = {perimetro:.2f} - Diagonal = {diagonal:.2f}")