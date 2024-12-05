import streamlit as st
from equacao import Equacao
import pandas as pd
import numpy as np

class EquacaoUI:
    def main():
        st.header("Equação do II Grau: y = ax**2 + bx + c")
        a = st.text_input("A")
        b = st.text_input("B")
        c = st.text_input("C")
        pontos = st.text_input("Digite numero de pontos")

        if st.button("Calcular"):
            e = Equacao(int(a), int(b), int(c))
            st.write(f"Delta = {e.calc_delta()}")
            st.write(f"x1 = {e.calc_x1()}")
            st.write(f"x2 = {e.calc_x2()}")

            menorRaiz = e.calc_x2()
            maiorRaiz = e.calc_x1()
            if e.calc_delta() > 0:
                d = maiorRaiz - menorRaiz
                xmin = menorRaiz - d/2
                xmax = maiorRaiz + d/2
            if e.calc_delta() == 0:
                xmin = 0.5 * menorRaiz 
                xmax = 1.5 * menorRaiz
            if e.calc_delta() < 0:
                xmin = -10
                xmax = 10
            if xmin == 0 and xmax == 0:
                xmin = -5
                xmax = 5
            
            d = (xmax - xmin) / int(pontos)
            x_lista = np.arange(xmin, xmax, d)
            y_lista = [e.calc_y(x) for x in x_lista]
            
            x_lista = np.append(x_lista, xmax)
            y_lista.append(e.calc_y(xmax))
            chart_data = pd.DataFrame(
                {
                    "X": x_lista,
                    "Y": y_lista
                }
            )
            st.line_chart(chart_data, x="X", y="Y", color="#ff007f")