(ns modulo-15-mais-sobre-mapas.logic)

(conj [1 2 3] 4)
(conj [1 2 3] 4 5 6)
(conj [1 2 3] "teste" true)
(conj [1 2 3] [4 5])
(pop [1 2 3])
(peek [1 2 3])

(defn compras
  []
  {:tomate {:quantidade 2, :preco 5}
   :arroz {:quantidade 1, :preco 4}
   :feijao {:quantidade 2. :preco 10}})

(compras)

;(peek (compras))

(conj (compras) {:alface {:quantidade 2, :preco 8}})
(assoc (compras) :alface {:quantidade 2, :preco 10})

(dissoc(compras) :tomate)
(dissoc(compras) :tomate :arroz)

(assoc (compras) :tomate {:quantidade 3, :preco 5})

{:nome "Gustavo Maia", :idade 20}

(inc 39)

(update {:nome "Gustavo Maia", :idade 20} :idade inc)

(update-in (compras) [:tomate, :preco] inc)

(update-in (compras) [:tomate, :preco] * 2)