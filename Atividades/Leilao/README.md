Problema Proposto: 

Implemente em Java um sistema simples de leilão.

Em um leilão, são leiloados (vendidos) um ou vários produtos que, geralmente, são
separados em lotes. A organização dos lotes de produtos a serem leiloados é feita pelo leiloeiro que
costuma deixar os melhores produtos para os lotes finais. Assim, ele mantém o maior número de pessoas
presentes em todo o leilão e com isso, aumenta a chance de obter maiores ofertas em seus produtos.

Durante o leilão, um produto será declarado vendido pelo leiloeiro quando esgotarem as ofertas de maior
preço feito pelo público presente no leilão. Uma nova oferta, denominada lance, só será aceita se for maior
do que o último lance feito para o produto em leilão. Uma vez declarado vendido, o produto não recebe
mais lances.

Um sistema de leilão funciona basicamente da seguinte maneira:
- Em um leilão podem existir “n” produtos que podem receber vários lances;
- Um lance é caracterizado pela pessoa interessada e o valor do lance;
- Uma pessoa é caracterizada pelo nome e o contato (e-mail ou telefone);
- Um produto é caracterizado apenas por uma descrição e pelo maior lance recebido;
Seu sistema deverá ser capaz de:
- Inserir novos produtos para leilão organizados em lotes;
- Listar os produtos disponíveis para leilão (com o maior lance já oferecido, caso houver);
- Permitir lance de uma pessoa para um determinado produto;
- Encerrar o leilão, exibindo as vendas feitas no leilão – produto, pessoa que adquiriu e valor;
