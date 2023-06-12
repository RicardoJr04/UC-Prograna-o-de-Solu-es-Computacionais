def calculadora_professor(nome, regime):
    if regime == "CLT":
        salario_mensal = float(input("Informe o salário mensal do professor: R$ "))
        valor_a_receber = salario_mensal
    elif regime == "Horista":
        horas_trabalhadas = float(input("Informe o número de horas trabalhadas pelo professor: "))
        valor_hora = float(input("Informe o valor da hora de trabalho: R$ "))
        valor_a_receber = horas_trabalhadas * valor_hora
    elif regime == "PJ":
        valor_contrato = float(input("Informe o valor do contrato do professor: R$ "))
        valor_a_receber = valor_contrato
    else:
        print("Regime de pagamento inválido!")
        return

    print("Nome do professor: ", nome)
    print("Valor a receber: R$", valor_a_receber)


# Solicitar informações do usuário
nome_professor = input("Digite o nome do professor: ")
regime_pagamento = input("Digite o regime de pagamento (CLT, Horista ou PJ): ")

# Chamar a função para calcular e exibir o valor a receber
calcular_valor_a_receber(nome_professor, regime_pagamento)
