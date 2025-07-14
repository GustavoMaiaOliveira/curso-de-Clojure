(ns self-testing-code.core)

(conj nil "Banana")

(conj () "Banana")

(conj(conj nil "Banana")"Arroz")

(conj [1 2 3] nil)

(pop ["Banana"])

;(pop [])

(pop nil)

(defn imprime-primeiro-nome
  [nomes]
  (println (get nomes 0 "Not found")))

(imprime-primeiro-nome
  ["Gustavo" "Maia" "Oliveira"])

(defn imprime-segundo-nome
  [nomes]
  (println (nomes 1)))

(imprime-segundo-nome
  ["Gustavo" "Maia" "Oliveira"])

(defn imprime-terceiro-nome
  [nomes]
  (println (nomes 2)))

(imprime-terceiro-nome
  ["Gustavo" "Maia" "Oliveira"])

(imprime-primeiro-nome
  [])

(defn substituir-primeiro-nome
  [nome-velho nome-novo]
  (assoc nome-velho 0 nome-novo))

(substituir-primeiro-nome ["marcio" "joao" "maria"] "jose")