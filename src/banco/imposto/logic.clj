(ns banco.imposto.logic)

;(conj nil "Banana")
;
;(conj () "Banana")
;
;(conj(conj nil "Banana")"Arroz")
;
;(conj [1 2 3] nil)
;
;(pop ["Banana"])
;
;;(pop [])
;
;(pop nil)
;
;(defn imprime-primeiro-nome
;  [nomes]
;  (println (get nomes 0 "Not found")))
;
;(imprime-primeiro-nome
;  ["Gustavo" "Maia" "Oliveira"])
;
;(defn imprime-segundo-nome
;  [nomes]
;  (println (nomes 1)))
;
;(imprime-segundo-nome
;  ["Gustavo" "Maia" "Oliveira"])
;
;(defn imprime-terceiro-nome
;  [nomes]
;  (println (nomes 2)))
;
;(imprime-terceiro-nome
;  ["Gustavo" "Maia" "Oliveira"])
;
;(imprime-primeiro-nome
;  [])
;
;(defn substituir-primeiro-nome
;  [nome-velho nome-novo]
;  (assoc nome-velho 0 nome-novo))
;
;(substituir-primeiro-nome ["marcio" "joao" "maria"] "jose")

; tipos

;(defn soma
;  [x y]
;  (+ x y))
;
;(defn imprime-soma
;  []
;  (println(soma nil 2)))
;
;(imprime-soma)

;(type 10) ; type long
;(type 10.0) ; type double
;(type(/ 10 3)) ; type ratio
;(type (* 3 (/ 10 3))) ; type BigInt
;(type 10N) ; type BigInt
;(type 10M) ; type BigDecimal
;(type "Maia") ; type String
;(type nil) ; type nil
;(type []) ; type PersistentVector
;(type [1 2 3]) ; type PersistentVector
;(type println) ; type core$println

(defn- esta-na-faixa-de-isencao?
  [valor]
  (< valor 1000))

(defn imposto-retido-fonte
  [valor]
  (if (esta-na-faixa-de-isencao? valor)
    0
    (* valor 0.1)))

