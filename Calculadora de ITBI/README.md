# Recebe o valor de transação de um imóvel, o valor venal e a porcentagem do imposto ITBI, calcula e exibe o imposto baseado no maior valor entre o valor de transação e o valor venal.

# Utilizando o JOptionPame

# O programa abre uma caixa de diálogo solicitando ao usuário o valor de transação do imóvel.
# O usuário insere o valor de transação, que é convertido para double.
# O programa abre uma segunda caixa de diálogo solicitando ao usuário o valor venal do imóvel.
# O usuário insere o valor venal, que é convertido para double.
# O programa abre uma terceira caixa de diálogo solicitando ao usuário a porcentagem do imposto ITBI.
# O usuário insere a porcentagem do imposto, que é convertida para double.
# O programa calcula o maior valor entre o valor de transação e o valor venal.
# O programa calcula o valor do imposto ITBI com base no maior valor e na porcentagem fornecida.
# O programa exibe o valor do imposto calculado em uma caixa de diálogo.
Entrada de Dados:

O programa utiliza a classe JOptionPane para exibir caixas de diálogo e coletar três entradas do usuário:
valorTransacaoStr: O valor de transação do imóvel (quanto foi pago na venda).
valorVenalStr: O valor venal do imóvel (valor de mercado determinado pelo governo).
porcentagemImpostoStr: A porcentagem do imposto ITBI aplicada à transação.
Conversão de Dados:

As entradas são inicialmente coletadas como strings e, em seguida, convertidas para valores double:
valorTransacao: Valor de transação convertido para double.
valorVenal: Valor venal convertido para double.
porcentagemImposto: Porcentagem do imposto convertida para double.
Cálculo do Imposto:

O programa determina o maior valor entre o valor de transação e o valor venal usando Math.max(valorTransacao, valorVenal).
Em seguida, calcula o valor do imposto ITBI aplicando a porcentagem fornecida ao maior valor: