(ns modulo-12.funcoes-primeira-ordem.logic)

(defn imposto-retido
  "Se salário abaixo de 1000 reais não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
  [salario]
  (let [ímposto-padrao 0.2]
    (if (< salario 1000)
      0
      (* salario ímposto-padrao))))

;(imposto-retido 1000)
;(defn consulta-taxa-padrao-por-http
;  "Imagine que este código faz uma requisição http para obter a taxa padrão."
;  []
;  0.20)
;
;(defn imposto-retido
;  "Se salário abaixo de 1000 reais não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
;  [salario]
;    (if (< salario 1000)
;      0
;      (* salario (consulta-taxa-padrao-por-http))))
;
;(imposto-retido 1000)
;
;(defn imposto-retido
;  "Se salário abaixo de 1000 reais não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
;  [taxa-padrao salario]
;  (if (< salario 1000)
;    0
;    (* salario taxa-padrao)))
;
;(imposto-retido 0.2 1000)
;

(defn consulta-taxa-padrao-por-http
  "Imagine que este código faz uma requisição http para obter a taxa-padrao."
  []
  0.30)

(defn imposto-retido
  "Se salário abaixo de 1000 reais não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
  [taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario taxa-padrao)))

;(imposto-retido consulta-taxa-padrao-por-http 1000)

(defn imposto-retido
  "Se salário abaixo de 1000 reais não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão."
  [consulta-taxa-padrao salario ]
  (if (< salario 1000)
    0
    (* salario (consulta-taxa-padrao))))

(defn consulta-taxa-padrao-fixa
  []
  0.10)

(imposto-retido consulta-taxa-padrao-por-http 1000)
(imposto-retido consulta-taxa-padrao-fixa 1000)

;(defn minha-taxa-padrao
;  []
;consulta-taxa-padrao-fixa)
;
;(minha-taxa-padrao)
;
;(imposto-retido (minha-taxa-padrao) 2000)

(defn escolhe-consulta-taxa-padrao
  [ambiente]
(if (= ambiente :teste)
  consulta-taxa-padrao-por-http
  consulta-taxa-padrao-fixa))

(imposto-retido
  (escolhe-consulta-taxa-padrao :producao)2000)

;(defn crie-meu-nome
;  [user]
;  (str "Seu nome: " (:name user) " " (:middle-name user) " " (:last-name user)))
;
;
;(def user-data
;  {:last-name "Oliveira"
;   :name  "Gustavo"
;   :middle-name "Maia"})
;
;(crie-meu-nome user-data))