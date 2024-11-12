class Venda:
    def __init__(self, id, data, carrinho, total, idCliente):
        self.set_id(id)
        self.set_data(data)
        self.set_carrinho(carrinho)
        self.set_total(total)
        self.set_idCliente(idCliente)

    def set_id(self, id):
        self.id = id
    
    def set_data(self, data):
        self.data = data

    def set_carrinho(self, carrinho):
        self.carrinho = carrinho
    
    def set_total(self, total):
        self.total = total
    
    def set_idCliente(self, idCliente):
        self.idCliente = idCliente

    def __str__(self):
        return f"{self.id} - {self.data} - {self.carrinho} - {self.total} - {self.idCliente}"