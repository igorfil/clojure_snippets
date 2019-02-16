(ns snippets.edn-test
  (:require [clojure.test :refer :all]
            ))

(defn to-edn 
	"Converts map to EDN"
	[map]
	(pr-str map))

(deftest end-tests
	(testing "empty map to edn"
		(is (= "{}" (to-edn {}))))
	
	(testing "one element map to edn"
		(is (= "{:key \"value\"}" (to-edn {:key "value"}))))
	
	(testing "two-element map to edn"
		(is (= "{:key1 \"value1\", :key2 \"value2\"}" (to-edn {:key1 "value1" :key2 "value2"})))))