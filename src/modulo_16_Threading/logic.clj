(ns modulo-16-Threading.logic
  (:require [clojure.string :refer [upper-case join]]))

; Desafio: precisamos criar uma função que, dada um conjunto (vetor) de disciplinas e o semestre da discente, deve:
; - filtrar a lista para exibir disciplinas restantes (que sejam do semestre atual ou superior)
; - transformar nome da disciplina para maiúsculo e descartar demais informações
; - criar uma String concatenando o nome de todas as disciplinas filtradas
; Exemplo de entrada:
; [{:nome "Estrutura de dados" :semestre 2}
;   {:nome "Algoritmos" :semestre 1}
;   {:nome "Inteligência Artificial" :semestre 3}] 2
; Saída esperada: "ESTRUTURA DE DADOS, INTELIGÊNCIA ARTIFICIAL"

; Parte 1

(defn disciplinas
   []
     [{:nome "Estrutura de dados" :semestre 2}
     {:nome "Algoritmos" :semestre 1}
     {:nome "Inteligência Artificial" :semestre 3}])

(:semestre {:nome "Estrutura de dados" :semestre 2})

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (filter #(>= (:semestre %) semestre-atual) disciplinas))

(nomes-disciplinas-restantes (disciplinas) 2)

; Parte 2


; => {:nome "Estrutura de dados", :semestre 2} -> "Estrutura de dados"

(:nome {:nome "Estrutura de dados", :semestre 2})

(:nome [{:nome "Estrutura de dados", :semestre 2} {:nome "Inteligência Artificial", :semestre 3}])
; Não funciona pois não da pra pegar nome de vetor, e sim de mapa, lembrando de sempre pensar em filter, map e reduce.

(map :nome [{:nome "Estrutura de dados", :semestre 2} {:nome "Inteligência Artificial", :semestre 3}])
; Aplicando o map para usar o :nome como "get :nome"

(defn disciplinas
  []
  [{:nome "Estrutura de dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligência Artificial" :semestre 3}])

(:semestre {:nome "Estrutura de dados" :semestre 2})

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (map :nome (filter #(>= (:semestre %) semestre-atual) disciplinas)))

(nomes-disciplinas-restantes (disciplinas) 2)

; Parte 3

(clojure.string/upper-case "teste")
;
(map clojure.string/upper-case ["Estrutura de dados" "Inteligência Artificial"])
;
;
(clojure.string/join ", " ["ESTRUTURA DE DADOS" "INTELIGÊNCIA ARTIFICIAL"])

(defn disciplinas
  []
  [{:nome "Estrutura de dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligência Artificial" :semestre 3}])

(:semestre {:nome "Estrutura de dados" :semestre 2})

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (join ", "(map upper-case (map :nome (filter #(>= (:semestre %) semestre-atual) disciplinas)))))

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (->> disciplinas
       (filter #(>= (:semestre %) semestre-atual))
       (map :nome)
       (map upper-case)
       (join ", ")))

(nomes-disciplinas-restantes (disciplinas) 2)