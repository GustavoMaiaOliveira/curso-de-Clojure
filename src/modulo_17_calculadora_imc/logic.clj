(ns modulo-17-calculadora-imc.logic)

;Dado um peso e altura de uma pessoa, retorna o indicador de seu IMC(Indice de Massa Corporal)

; imc = (peso / altura^2)

(defn- valor-imc
  [peso altura]
  (/ peso (* altura altura)))

(defn indicador-imc [peso altura]
  (let [resultado-calculo-imc (valor-imc peso altura)]
    (if (< resultado-calculo-imc 18.5)
      :abaixo-do-peso
      (if (< resultado-calculo-imc 24.9)
        :peso-ideal
        :acima-do-peso))))
