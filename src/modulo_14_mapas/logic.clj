(ns modulo-14-mapas.logic)

{"nome" "Marcio"}

{:nome "Gustavo"
 :sobrenome "Maia"
 :idade 20}

; Carrinho de compras
(defn compras
  []
  {:tomate {:quantidade 2, :preco 5}
   :arroz  {:quantidade 1, :preco 4}
   :feijao {:quantidade 3, :preco 10}}
  )

(defn teste []
  )

(compras)

(get (compras) :tomate)
((compras) :tomate)
(:tomate (compras))


