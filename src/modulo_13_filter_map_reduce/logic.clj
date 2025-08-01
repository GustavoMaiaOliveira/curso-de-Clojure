(ns modulo-13-filter-map-reduce.logic)

; Imagine que tenhamos um vetor de números onde cada número representa o ano que o estudante está.
; Exemplo: [5 6 6] ; Te,ps 1 estudante no quinto ano e dois no sexto

; Desafio 1: crie uma função que recebe este vetor como entrada e retornar e a quantidade de estudantes que estão no quinto ano.

; [5 5 6 7 8 6 5 5] -> ... -> 4

(defn quantidade-estudantes-no-quinto-ano
  [estudantes]
  (count (filter #(= 5 %) estudantes)))

(quantidade-estudantes-no-quinto-ano [5 6 7 5])

;DESAFIO 2: crie uma função que recebe um vetor de idades e retorna como soma
; Ex: (soma-das-idades [5 10 5]) ; deve retornar 20
;

;(defn soma-as-idades
;  [idade1 idade2 idade3]
;  (+ idade1 idade2 idade3))
;
;(soma-as-idades 5 10 5)

(5 + 10 + 5)

(+(+ 5 10)5 )

(defn soma-das-idades
  [idades]
  (reduce + idades))

(soma-das-idades [])

;Desafio 3: crie uma função que recebe um vetor de nomes e retorne o tamanho médio dos nomes
;Ex: (tamanho-médio-dos-nomes["Márcio" "João"]) ; deve retornar 5

(defn contar-letras
  [nomes]
  (count nomes))

(contar-letras "teste")

(defn somar-letras-dos-nomes
  [numeros]
  (reduce + (contar-letras["joao"])))

;["Marcio" "João"] -> [6 4] -> 5

(count "teste")

(defn tamanhp-medio-dos-nomes
  [nomes]
  (map count nomes))

(tamanhp-medio-dos-nomes ["marcio" "joao"])