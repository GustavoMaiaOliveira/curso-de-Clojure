(ns modulo-13-filter-map-reduce.logic)

; Imagine que tenhamos um vetor de números onde cada número representa o ano que o estudante está.
; Exemplo: [5 6 6] ; Te,ps 1 estudante no quinto ano e dois no sexto

; Desafio 1: crie uma função que recebe este vetor como entrada e retornar e a quantidade de estudantes que estão no quinto ano.

; [5 5 6 7 8 6 5 5] -> ... -> 4

(defn quantidade-estudantes-no-quinto-ano
  [estudantes]
  (filter predicato estudantes))
