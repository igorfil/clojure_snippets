(ns snippets.edn-test
  (:require [clojure.test :refer :all]
  			[clojure.edn :as edn]))

; TODO
; Custom type to/from EDN

(defn to-edn 
	"Converts map to EDN"
	[map]
	(pr-str map))

(defn from-edn
	"Reads from EDN to map"
	[edn-str]
	(edn/read-string edn-str))

(deftest to-edn-tests
	(testing "empty map to edn"
		(is (= "{}" (to-edn {}))))
	
	(testing "one element map to edn"
		(is (= "{:key \"value\"}" (to-edn {:key "value"}))))
	
	(testing "two-element map to edn"
		(is (= "{:key1 \"value1\", :key2 \"value2\"}" (to-edn {:key1 "value1" :key2 "value2"}))))

	(testing "complex map to edn"
		(is (= "{:boolean true, :list (1 2 3 4)}" (to-edn {:boolean true :list '(1 2 3 4)})))))

(deftest from-edn-tests
	(testing "empty edn to map"
		(is (= {} (from-edn "{}"))))

	(testing "one-element EDN to map"
		(is (= {:key "value"} (from-edn "{:key \"value\"}"))))

	(testing "two-element edn to map"
		(is (= {:key1 "value1" :key2 "value2"} (from-edn "{:key1 \"value1\", :key2 \"value2\"}"))))

	(testing "complex edn to map"
		(is (= {:boolean true :list '(1 2 3 4)} (from-edn "{:boolean true, :list (1 2 3 4)}")))))


