from random import randint


senha = '12345'

def controle_v1():
    """
    :return final, tenta descobrir a senha utilizando sequências aleatórias, mas por conta da alta quantidade de possíveis
    valores, se torna muito difícil utilizar brute force.
    """

    valores_teste = []
    while True:
        valores = [str(randint(0, 9)), str(randint(0, 9)),
               str(randint(0, 9)), str(randint(0, 9)),
               str(randint(0, 9)), str(randint(0, 9)),
               str(randint(0, 9)), str(randint(0, 9)),
               ]
        final = valores[0] + valores[1] + valores[2] + valores[3] + valores[4] + valores[5] + valores[6] + valores[7]
        print(final)

        if final in valores_teste:
            pass
        if final == senha:
            return final

def controle_v2():
    """
    :return é o valor de senha, ele tenta chegar até o final das possibilidades, é válido para senha numéricas
    O problema é que esse sistema é estático
    """

    for n1  in range(10):
        for n2  in range(10):
            for n3  in range(10):
                for n4  in range(10):
                    for n5  in range(10):
                        final = str(n1) + str(n2) + str(n3) + str(n4) + str(n5)
                        print(final)
                        if final == senha:

                            return final
    

print(controle_v2())


    