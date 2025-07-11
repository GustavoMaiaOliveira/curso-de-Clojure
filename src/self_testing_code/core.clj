(ns self-testing-code.core)

(pop ["Batata" "Arroz" "Feijão"])

(defn desistir-ultimo-item-da-compra
  [compras]
  (pop compras))

(desistir-ultimo-item-da-compra ["Arroz" "Feijão" "Batata"])