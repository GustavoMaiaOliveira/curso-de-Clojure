(ns self-testing-code.core-test
  (:require [clojure.test :refer :all]
            [self-testing-code.core :refer :all]))

(deftest nao-sei-o-nome-ainda-test
  (testing "Dado um valor abaixo de 100 reais, então a taxa de entrega deve ser de 15 reais"
    (is (= 15 (taxa-de-entrega 1)))
    (is (= 15 (taxa-de-entrega 100))))
  (testing "Se for maior que 100 e menor que 200, 5 reais"
    (is (= 5 (taxa-de-entrega 100.01)))
    (is (= 5 (taxa-de-entrega 200))))
  (testing "Se for acima de 200, a taxa é gratuita"
    (is (= 0 (taxa-de-entrega 200.01)))
    (is (= 0 (taxa-de-entrega 1999.99)))))