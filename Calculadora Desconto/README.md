# Recebe o valor de um produto e uma porcentagem de desconto, calcula e exibe o valor do desconto e o preço final do produto.

# Utilizando scanner
Coleta de Dados do Usuário:

O programa solicita ao usuário que insira o valor do produto.
Em seguida, solicita ao usuário que insira a porcentagem de desconto a ser aplicada.
Conversão de Dados:

As entradas do usuário são lidas como double para permitir cálculos precisos com números decimais.
Cálculo do Desconto:

O valor do desconto é calculado usando a fórmula:
valorDesconto
=
(valorProduto × porcentagemDesconto/100)

Cálculo do Preço Final:

O preço final do produto, após aplicar o desconto, é calculado subtraindo o valor do desconto do valor original do produto:
precoFinal=valorProduto − valorDesconto

Exibição dos Resultados:

O programa exibe o valor do desconto e o preço final do produto formatados para duas casas decimais para melhor legibilidade.
Passo a Passo da Funcionalidade
O programa abre um prompt no console solicitando ao usuário o valor do produto.
O usuário insere o valor do produto, que é lido e convertido para um tipo double.
O programa solicita ao usuário a porcentagem de desconto.
O usuário insere a porcentagem de desconto, que é lida e convertida para um tipo double.
O programa calcula o valor do desconto multiplicando o valor do produto pela porcentagem de desconto e dividindo por 100.
O programa calcula o preço final do produto subtraindo o valor do desconto do valor do produto.
O programa exibe o valor do desconto e o preço final do produto no console, formatados para duas casas decimais.
O programa fecha o scanner para liberar os recursos.