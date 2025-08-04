(ns modulo-17-calculadora-imc.logic-test
  (:require [clojure.test :refer :all]
            [modulo-17-calculadora-imc.logic :refer :all]))

(deftest valor-imc-test
  (testing "Uma pessoa muito magra deve ter IMC baixo"
    (is (= :abaixo-do-peso (indicador-imc 1 2))))
  (testing "Uma pessoa com peso ideal deve ter IMC ideal"
    (is (= :peso-ideal (indicador-imc 70 1.70))))
  (testing "Uma pessoa muito com muita massa deve ter IMC alto"
    (is (= :acima-do-peso (indicador-imc 100 1.50)))))

;:abaixo-do-peso
;:peso-ideal
;:acima-do-peso