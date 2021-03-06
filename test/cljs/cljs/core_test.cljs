(ns cljs.core-test)

;clojure-scheme supplemental tests
(assert (= (or nil 0) 0))
(assert (= ((fn ([] 0 1) ([a] 2 3))) 1))
(assert (= ((fn ([] 0 1) ([a] 2 3)) 'a) 3))

;defn test-stuff []
  ;; arithmetic
  (assert (= (+) 0))
  (assert (= (apply + []) 0))
  (assert (= (+ 1) 1))
  (assert (= (apply + [1]) 1))
  (assert (= (+ 1 1) 2))
  (assert (= (apply + [1 1]) 2))
  (assert (= (+ 1 2 3) 6))
  (assert (= (apply + [1 2 3]) 6))

  (assert (= (- 1) -1))
  (assert (= (apply - [1]) -1))
  (assert (= (- 1 1) 0))
  (assert (= (apply - [1 1]) 0))
  (assert (= (- 3 2 1) 0))
  (assert (= (apply - [3 2 1]) 0))

  (assert (= (*) 1))
  (assert (= (apply * []) 1))
  (assert (= (* 2) 2))
  (assert (= (apply * [2]) 2))
  (assert (= (* 2 3) 6))
  (assert (= (apply * [2 3]) 6))

  (assert (= (/ 2) (/ 1 2)))
  (assert (= (apply / [2]) (/ 1 2)))
  (assert (= (/ 6 2) 3))
  (assert (= (apply / [6 2]) 3))
  (assert (= (/ 6 3 2) 1))
  (assert (= (apply / [6 3 2]) 1))

  (assert (= (< 1) true))
  (assert (= (apply < [1]) true))
  (assert (= (< 1 2) true))
  (assert (= (apply < [1 2]) true))
  (assert (= (< 1 1) false))
  (assert (= (apply < [1 1]) false))
  (assert (= (< 2 1) false))
  (assert (= (apply < [2 1]) false))
  (assert (= (< 1 2 3) true))
  (assert (= (apply < [1 2 3]) true))
  (assert (= (< 1 1 3) false))
  (assert (= (apply < [1 1 3]) false))
  (assert (= (< 3 1 1) false))
  (assert (= (apply < [3 1 1]) false))

  (assert (= (<= 1) true))
  (assert (= (apply <= [1]) true))
  (assert (= (<= 1 1) true))
  (assert (= (apply <= [1 1]) true))
  (assert (= (<= 1 2) true))
  (assert (= (apply <= [1 2]) true))
  (assert (= (<= 2 1) false))
  (assert (= (apply <= [2 1]) false))
  (assert (= (<= 1 2 3) true))
  (assert (= (apply <= [1 2 3]) true))
  (assert (= (<= 1 1 3) true))
  (assert (= (apply <= [1 1 3]) true))
  (assert (= (<= 3 1 1) false))
  (assert (= (apply <= [3 1 1]) false))

  (assert (= (> 1) true))
  (assert (= (apply > [1]) true))
  (assert (= (> 2 1) true))
  (assert (= (apply > [2 1]) true))
  (assert (= (> 1 1) false))
  (assert (= (apply > [1 1]) false))
  (assert (= (> 1 2) false))
  (assert (= (apply > [1 2]) false))
  (assert (= (> 3 2 1) true))
  (assert (= (apply > [3 2 1]) true))
  (assert (= (> 3 1 1) false))
  (assert (= (apply > [3 1 1]) false))
  (assert (= (> 1 1 3) false))
  (assert (= (apply > [1 1 3]) false))

  (assert (= (>= 1) true))
  (assert (= (apply >= [1]) true))
  (assert (= (>= 2 1) true))
  (assert (= (apply >= [2 1]) true))
  (assert (= (>= 1 1) true))
  (assert (= (apply >= [1 1]) true))
  (assert (= (>= 1 2) false))
  (assert (= (apply >= [1 2]) false))
  (assert (= (>= 3 2 1) true))
  (assert (= (apply >= [3 2 1]) true))
  (assert (= (>= 3 1 1) true))
  (assert (= (apply >= [3 1 1]) true))
  (assert (= (>= 3 1 2) false))
  (assert (= (apply >= [3 1 2]) false))
  (assert (= (>= 1 1 3) false))
  (assert (= (apply >= [1 1 3]) false))

  (assert (= (dec 1) 0))
  (assert (= (apply dec [1]) 0))
  (assert (= (inc 0) 1))
  (assert (= (apply inc [0]) 1))

  (assert (= (zero? 0) true))
  (assert (= (apply zero? [0]) true))
  (assert (= (zero? 1) false))
  (assert (= (apply zero? [1]) false))
  (assert (= (zero? -11) false))
  (assert (= (apply zero? [-11]) false))
  (assert (= (pos? 0) false))
  (assert (= (apply pos? [0]) false))
  (assert (= (pos? 1) true))
  (assert (= (apply pos? [1]) true))
  (assert (= (pos? -1) false))
  (assert (= (apply pos? [-1]) false))
  (assert (= (neg? -1) true))
  (assert (= (apply neg? [-1]) true))

  (assert (= (max 1) 1))
  (assert (= (apply max [1]) 1))
  (assert (= (max 1 2) 2))
  (assert (= (apply max [1 2]) 2))
  (assert (= (max 2 1) 2))
  (assert (= (apply max [2 1]) 2))
  (assert (= (max 1 2 3) 3))
  (assert (= (apply max [1 2 3]) 3))
  (assert (= (max 1 3 2) 3))
  (assert (= (apply max [1 3 2]) 3))

  (assert (= (min 1) 1))
  (assert (= (apply min [1]) 1))
  (assert (= (min 1 2) 1))
  (assert (= (apply min [1 2]) 1))
  (assert (= (min 2 1) 1))
  (assert (= (apply min [2 1]) 1))
  (assert (= (min 1 2 3) 1))
  (assert (= (apply min [1 2 3]) 1))
  (assert (= (min 2 1 3) 1))
  (assert (= (apply min [3 1 3]) 1))

  (assert (= (mod 4 2) 0))
  (assert (= (apply mod [4 2]) 0))
  (assert (= (mod 3 2) 1))
  (assert (= (apply mod [3 2]) 1))

  (assert (= [4 3 2 1 0] (loop [i 0 j ()]
                 (if (< i 5)
                   (recur (inc i) (conj j (fn [] i)))
                   (map #(%) j)))))

  (assert (= [[1 1] [1 2] [1 3] [2 1] [2 2] [2 3]]
             (map #(%) (for [i [1 2] j [1 2 3]] (fn [] [i j])))))

  (assert (= 2 (:b {:a 1 :b 2})))
  (assert (= 2 ('b '{:a 1 b 2})))
  (assert (= 2 ({:a 1 :b 2} :b)))
  (assert (= 2 ({1 1 2 2} 2)))
  (assert (= 2 (#{1 2 3} 2)))

  (assert (= "baz" (name 'foo/bar/baz)))
  (assert (= "foo/bar" (namespace 'foo/bar/baz)))
  (assert (= "baz" (name :foo/bar/baz)))
  ;(assert (= "foo/bar" (namespace :foo/bar/baz)))

  (assert (= {:a :b} (get {[1 2 3] {:a :b}, 4 5} [1 2 3])))
  (assert (= :a (nth [:a :b :c :d] 0)))
  #_(assert (= :a (nth [:a :b :c :d] 0.1)) )
  (assert (not (= {:a :b :c nil} {:a :b :d nil})))
  (assert (= (list 3 2 1) [3 2 1]))
  (assert (= [3 2 1] (seq (array 3 2 1))))
  (assert (= 9 (reduce + (next (seq (array 1 2 3 4))))))
  (assert (= () (rest nil)))
  (assert (= () (rest [1])))
  (assert (= () (rest (array 1))))
  (assert (= {"x" "y"} (meta ^{"x" "y"} [])))
  (assert (= {:a :b} (dissoc {:a :b :c :d} :c)))
  #_(assert (= (hash-map :foo 5)
             (assoc (cljs.core.ObjMap. nil (array) (js-obj)) :foo 5)))

  (assert (= "[1 true {:a 2, :b 42} [3 4]]" ;"[1 true {:a 2, :b 42} #<Array [3, 4]>]" I equate Scheme vectors with clojure vectors at the moment.
             (pr-str [1 true {:a 2 :b 42} (array 3 4)])))

  ;;this fails in v8 - why?
  ;(assert (= "symbol\"'string" (pr-str (str 'symbol \" \' "string"))))

  (assert (not (= "one" "two")))
  (assert (= 3 (cljs.core/-count "abc")))
  (assert (= 4 (cljs.core/-count (array 1 2 3 4))))
  (assert (= \c (cljs.core/-nth "abc" 2)))
  (assert (= "quux" (cljs.core/-nth "abc" 3 "quux")))
  (assert (= 1 (cljs.core/-nth (array 1 2 3 4) 0)))
  (assert (= "val" (cljs.core/-nth (array 1 2 3 4) 4 "val")))
  (assert (= \b (cljs.core/-lookup "abc" 1)))
  (assert (= "harriet" (cljs.core/-lookup "abcd" 4 "harriet")))
  (assert (= 4 (cljs.core/-lookup (array 1 2 3 4) 3)))
  (assert (= "zot" (cljs.core/-lookup (array 1 2 3 4) 4 "zot")))
  (assert (= 10 (cljs.core/-reduce (array 1 2 3 4) +)))
  (assert (= 20 (cljs.core/-reduce (array 1 2 3 4) + 10)))
  (assert (= "cabd" (let
                        [jumble (fn [a b] (str (apply str (reverse (str a))) b))]
                      (cljs.core/-reduce "abcd" jumble))))
  (assert (= "cafrogbd" (let
                            [jumble (fn [a b] (str (apply str (reverse (str a))) b))]
                          (cljs.core/-reduce "abcd" jumble "frog"))))
  (assert (= [0 0 1 0 1]
               [(bit-and 1 0)
                (bit-and 0 0)
                (bit-and 1 1)
                (bit-and 42 1)
                (bit-and 41 1)]))
  (assert (= [1 0 1 43 41]
               [(bit-or 1 0)
                (bit-or 0 0)
                (bit-or 1 1)
                (bit-or 42 1)
                (bit-or 41 1)]))
  (assert (= [1 0 0 42 40]
               [(bit-and-not 1 0)
                (bit-and-not 0 0)
                (bit-and-not 1 1)
                (bit-and-not 42 1)
                (bit-and-not 41 1)]))
  #_(assert (= [0 2 968 16649 0] ;TODO
               [(bit-clear 1 0)
                (bit-clear 2 0)
                (bit-clear 1000 5)
                (bit-clear 16713 6)
                (bit-clear 1024 10)]))
  #_(assert (= [0 0 992 18761 0] ;TODO
               [(bit-flip 1 0)
                (bit-flip 2 1)
                (bit-flip 1000 3)
                (bit-flip 16713 11)
                (bit-flip 1024 10)]))
  (assert (= [-2 -3 999 -16714 -1025]
               [(bit-not 1)
                (bit-not 2)
                (bit-not -1000)
                (bit-not 16713)
                (bit-not 1024)]))
  #_(assert (= [1 2 1000 18761 1024] ;TODO
               [(bit-set 1 0)
                (bit-set 2 1)
                (bit-set 1000 3)
                (bit-set 16713 11)
                (bit-set 1024 10)]))
  #_(assert (= [true true true false true] ;TODO
               [(bit-test 1 0)
                (bit-test 2 1)
                (bit-test 1000 3)
                (bit-test 16713 11)
                (bit-test 1024 10)]))
  (assert (= [true false true false]
             [(true? true)
              (true? false)
              (false? false)
              (false? true)]))
  ;; apply
  (assert (= 0 (apply + nil)))
  (assert (= 0 (apply + (list))))
  (assert (= 1 (apply + (list 1))))
  (assert (= 3 (apply + 1 (list 2))))
  (assert (= 7 (apply + 1 2 (list 4))))
  (assert (= 15 (apply + 1 2 4 (list 8))))
  (assert (= 31 (apply + 1 2 4 8 (list 16))))
  (assert (= 63 (apply + 1 2 4 8 16 (list 32))))
  (assert (= 127 (apply + 1 2 4 8 16 (list 32 64))))
  (assert (= 4950 (apply + (take 100 (iterate inc 0)))))
  (assert (= () (apply list [])))
  (assert (= [1 2 3] (apply list [1 2 3])))
  (assert (= 6 (apply apply [+ [1 2 3]])))
  ;; apply with infinite sequence ;TODO 
  #_(assert (= 3 (apply (fn [& args]
                        (+ (nth args 0)
                           (nth args 1)
                           (nth args 2)))
                      (iterate inc 0)))
  (assert (= [0 1 2 3 4] (take 5 (apply (fn [& m] m) (iterate inc 0)))))
  (assert (= [1 2 3 4 5] (take 5 (apply (fn [x & m] m) (iterate inc 0)))))
  (assert (= [2 3 4 5 6] (take 5 (apply (fn [x y & m] m) (iterate inc 0)))))
  (assert (= [3 4 5 6 7] (take 5 (apply (fn [x y z & m] m) (iterate inc 0)))))
  (assert (= [4 5 6 7 8] (take 5 (apply (fn [x y z a & m] m) (iterate inc 0)))))
  (assert (= [5 6 7 8 9] (take 5 (apply (fn [x y z a b & m] m) (iterate inc 0))))))
  ;; apply arity tests
  (let [single-arity-non-variadic (fn [x y z] [z y x])
        multiple-arity-non-variadic (fn ([x] x) ([x y] [y x]) ([x y z] [z y x]))
        single-arity-variadic-fixedargs (fn [x y & more] [more y x])
        single-arity-variadic-nofixedargs (fn [& more] more)
        multiple-arity-variadic (fn ([x] x) ([x y] [y x]) ([x y & more] [more y x]))]
    (assert (= [3 2 1] (apply single-arity-non-variadic [1 2 3])))
    (assert (= [3 2 1] (apply single-arity-non-variadic 1 [2 3])))
    (assert (= [3 2 1] (apply single-arity-non-variadic 1 2 [3])))
    (assert (= 42 (apply multiple-arity-non-variadic [42])))
    (assert (= [2 1] (apply multiple-arity-non-variadic [1 2])))
    (assert (= [2 1] (apply multiple-arity-non-variadic 1 [2])))
    (assert (= [3 2 1] (apply multiple-arity-non-variadic [1 2 3])))
    (assert (= [3 2 1] (apply multiple-arity-non-variadic 1 [2 3])))
    (assert (= [3 2 1] (apply multiple-arity-non-variadic 1 2 [3])))
    (assert (= [[3 4 5] 2 1] (apply single-arity-variadic-fixedargs [1 2 3 4 5])))
    (assert (= [[3 4 5] 2 1] (apply single-arity-variadic-fixedargs 1 [2 3 4 5])))
    (assert (= [[3 4 5] 2 1] (apply single-arity-variadic-fixedargs 1 2 [3 4 5])))
    (assert (= [[3 4 5] 2 1] (apply single-arity-variadic-fixedargs 1 2 3 [4 5])))
    (assert (= [[3 4 5] 2 1] (apply single-arity-variadic-fixedargs 1 2 3 4 [5])))
    #_(assert (= [3 4 5] (take 3 (first (apply single-arity-variadic-fixedargs (iterate inc 1)))))) ;TODO
    #_(assert (= [2 1] (rest (apply single-arity-variadic-fixedargs (iterate inc 1))))) ;TODO
    (assert (= [1 2 3 4 5] (apply single-arity-variadic-nofixedargs [1 2 3 4 5])))
    (assert (= [1 2 3 4 5] (apply single-arity-variadic-nofixedargs 1 [2 3 4 5])))
    (assert (= [1 2 3 4 5] (apply single-arity-variadic-nofixedargs 1 2 [3 4 5])))
    (assert (= [1 2 3 4 5] (apply single-arity-variadic-nofixedargs 1 2 3 [4 5])))
    (assert (= [1 2 3 4 5] (apply single-arity-variadic-nofixedargs 1 2 3 4 [5])))
    #_(assert (= [1 2 3 4 5] (take 5 (apply single-arity-variadic-nofixedargs (iterate inc 1))))) ;TODO
    (assert (= 42 (apply multiple-arity-variadic [42])))
    (assert (= [2 1] (apply multiple-arity-variadic [1 2])))
    (assert (= [2 1] (apply multiple-arity-variadic 1 [2])))
    (assert (= [[3 4 5] 2 1] (apply multiple-arity-variadic [1 2 3 4 5])))
    (assert (= [[3 4 5] 2 1] (apply multiple-arity-variadic 1 [2 3 4 5])))
    (assert (= [[3 4 5] 2 1] (apply multiple-arity-variadic 1 2 [3 4 5])))
    (assert (= [[3 4 5] 2 1] (apply multiple-arity-variadic 1 2 3 [4 5])))
    (assert (= [[3 4 5] 2 1] (apply multiple-arity-variadic 1 2 3 4 [5])))
    #_(assert (= [3 4 5] (take 3 (first (apply multiple-arity-variadic (iterate inc 1)))))) ;TODO
    #_(assert (= [2 1] (rest (apply multiple-arity-variadic (iterate inc 1)))))) ;TODO
  (let [a (atom 0)]
    (assert (= 0 (deref a)))
    (assert (= 1 (swap! a inc)))
    (assert (= false (compare-and-set! a 0 42)))
    (assert (= true (compare-and-set! a 1 7)))
    (assert (nil? (meta a)))
    (assert (nil? (get-validator a))))
  (let [a (atom 0)]
    (assert (= 1 (swap! a + 1)))
    (assert (= 4 (swap! a + 1 2)))
    (assert (= 10 (swap! a + 1 2 3)))
    (assert (= 20 (swap! a + 1 2 3 4))))
  (let [a (atom [1] :validator coll? :meta {:a 1})]
    (assert (= coll? (get-validator a)))
    (assert (= {:a 1} (meta a)))
    (alter-meta! a assoc :b 2)
    (assert (= {:a 1 :b 2} (meta a))))
  (assert (nil? (empty nil)))
  (let [e-lazy-seq (empty (with-meta (lazy-seq (cons :a nil)) {:b :c}))]
    (assert (seq? e-lazy-seq))
    (assert (empty? e-lazy-seq))
    (assert (= {:b :c} (meta e-lazy-seq))))
  #_(let [e-list (empty '^{:b :c} (1 2 3))] ;TODO
    (assert (seq? e-list))
    (assert (empty? e-list)))
  #_(let [e-elist (empty '^{:b :c} ())] ;TODO
    (assert (seq? e-elist))
    (assert (empty? e-elist))
    (assert (= :c (get (meta e-elist) :b))))
  (let [e-cons (empty (with-meta (cons :a nil) {:b :c}))]
    (assert (seq? e-cons))
    (assert (empty? e-cons))
    (assert (= {:b :c} (meta e-cons))))
  (let [e-vec (empty ^{:b :c} [:a :d :g])]
    (assert (vector? e-vec))
    (assert (empty? e-vec))
    (assert (= {:b :c} (meta e-vec))))
  (let [e-omap (empty ^{:b :c} {:a :d :g :h})]
    (assert (map? e-omap))
    (assert (empty? e-omap))
    (assert (= {:b :c} (meta e-omap))))
  (let [e-hmap (empty ^{:b :c} {[1 2] :d :g :h})]
    (assert (map? e-hmap))
    (assert (empty? e-hmap))
    (assert (= {:b :c} (meta e-hmap))))

  ;;this fails in v8 advanced mode - what's e?
  #_(let [a (atom nil)]
    (assert (= 1 (try* 1)))
    (assert (= 2 (try* 1 (throw 3) (catch e 2))))
    (assert (= 3 (try* 1 (throw 3) (catch e e))))
    (assert (= 1 (try* 1 (finally (reset! a 42)))))
    (assert (= 42 (deref a))))

  (let [a (atom nil)]
    (assert (= 1 (try 1)))
    (assert (= 2 (try 1 (throw (Error. "")) (catch Error e 2))))
    (assert (= 2 (try 1 (throw (Error. "")) (catch Error e 1 2))))
    #_(assert (= 1 (try 1 (finally (reset! a 42)))))
    #_(assert (= 42 (deref a))))

  (assert (= [3] (nthnext [1 2 3] 2)))
  (let [v [1 2 3]]
    (assert (= v (for [e v] e)))
    (assert (= [[1 1] [2 4] [3 9]] (for [e v :let [m (* e e)]] [e m])))
    (assert (= [1 2] (for [e v :while (< e 3)] e)))
    (assert (= [3] (for [e v :when (> e 2)] e)))
    (assert (= [[1 1] [2 4]] (for [e v :while (< e 3) :let [m (* e e)]] [e m]))))
  (assert (not= 1 2))
  (assert (not (not= 1 1)))
  (assert (not (not-empty [])))
  (assert (boolean (not-empty [1 2 3])))
  (assert (= "joel" (min-key count "joel" "tom servo" "crooooooooow")))
  (assert (= "crooooooooow" (max-key count "joel" "tom servo" "crooooooooow")))
  (assert (= (partition-all 4 [1 2 3 4 5 6 7 8 9])
             [[1 2 3 4] [5 6 7 8] [9]]))
  (assert (= (partition-all 4 2 [1 2 3 4 5 6 7 8 9])
             [[1 2 3 4] [3 4 5 6] [5 6 7 8] [7 8 9] [9]]))
  (assert (= [true true] (take-while true? [true true 2 3 4])))
  (assert (= [[true true] [false false false] [true true]]
             (partition-by true? [true true false false false true true])))
  (assert (= [0 2 4 6 8 10] (take-nth 2 [0 1 2 3 4 5 6 7 8 9 10])))
  (let [a10 (partial + 10)
        a20 (partial + 10 10)
        a21 (partial + 10 10 1)
        a22 (partial + 10 5  4 3)
        a23 (partial + 10 5  4 3 1)]
    (assert (= 110 (a10 100)))
    (assert (= 120 (a20 100)))
    (assert (= 121 (a21 100)))
    (assert (= 122 (a22 100)))
    (assert (= 123 (a23 100))))
  (let [n2 (comp first rest)
        n3 (comp first rest rest)
        n4 (comp first rest rest rest)
        n5 (comp first rest rest rest rest)
        n6 (comp first rest rest rest rest rest)]
    (assert (= 2 (n2 [1 2 3 4 5 6 7])))
    (assert (= 3 (n3 [1 2 3 4 5 6 7])))
    (assert (= 4 (n4 [1 2 3 4 5 6 7])))
    (assert (= 5 (n5 [1 2 3 4 5 6 7])))
    (assert (= 6 (n6 [1 2 3 4 5 6 7]))))
  (let [sf (some-fn number? keyword? symbol?)]
    (assert (sf :foo 1))
    (assert (sf :foo))
    (assert (sf 'bar 1))
    (assert (not (sf [] ()))))
  (let [ep (every-pred number? zero?)]
    (assert (ep 0 0 0))
    (assert (not (ep 1 2 3 0))))
  (assert ((complement number?) :foo))
  (assert (= [1 [2 3] [1 2 3]] ((juxt first rest seq) [1 2 3])))
  (assert (= 5 (max 1 2 3 4 5)))
  (assert (= 5 (max 5 4 3 2 1)))
  (assert (= 5.5 (max 1 2 3 4 5 5.5)))
  (assert (= 1 (min 5 4 3 2 1)))
  (assert (= 1 (min 1 2 3 4 5)))
  (assert (= 0.5 (min 5 4 3 0.5 2 1)))
  #_(let [x (array 1 2 3)] ;no arbitrary fields on arrays.
    (set! (.-foo x) :hello)
    (assert (= (.-foo x) :hello)))

  (assert (set []))
  (assert (= #{} (set [])))

  (assert (= #{"foo"} (set ["foo"])))
  (assert (= #{1 2 3} #{1 3 2}))
  (assert (= #{#{1 2 3} [4 5 6] {7 8} 9 10}
             #{10 9 [4 5 6] {7 8} #{1 2 3}}))
  (assert (not (= #{nil [] {} 0 #{}} #{})))
  (assert (= (count #{nil [] {} 0 #{}}) 5))
  (assert (= (conj #{1} 1) #{1}))
  (assert (= (conj #{1} 2) #{2 1}))
  (assert (= #{} (cljs.core/-empty #{1 2 3 4})))
  (assert (= (reduce + #{1 2 3 4 5}) 15))
  (assert (= 4 (get #{1 2 3 4} 4)))
  (assert (contains? #{1 2 3 4} 4))
  (assert (contains? #{[] nil 0 {} #{}} {}))
  (assert (contains? #{[1 2 3]} [1 2 3]))
  (assert (not (contains? (cljs.core/-disjoin #{1 2 3} 3) 3)))
  (assert (neg? -1))
  (assert (not (neg? 1)))
  (assert (neg? -1.765))
  (assert (not (neg? 0)))
  (assert (= [true false true false true false true false]
             (map integer?
                  [1 1.00001 0x7e7 [] (- 88 1001991881) :foo 0 "0"])))
  (assert (= [true false true false true false]
             (map odd? [1 2 3 4 -1 0])))
  (assert (= [true false true false true true]
             (map even? [2 3 4 5 -2 0])))
  (assert (contains? {:a 1 :b 2} :a))
  (assert (not (contains? {:a 1 :b 2} :z)))
  (assert (contains? [5 6 7] 1))
  (assert (contains? [5 6 7] 2))
  (assert (not (contains? [5 6 7] 3)))
  (assert (contains? (to-array [5 6 7]) 1))
  (assert (contains? (to-array [5 6 7]) 2))
  (assert (not (contains? (to-array [5 6 7]) 3)))
  (assert (not (contains? nil 42)))
  (assert (contains? "f" 0))
  (assert (not (contains? "f" 55)))
  (assert (distinct? 1 2 3))
  (assert (not (distinct? 1 2 3 1)))

  ;; distinct
  (assert (= (distinct ()) ()))
  (assert (= (distinct '(1)) '(1)))
  (assert (= (distinct '(1 2 3 1 1 1)) '(1 2 3)))
  (assert (= (distinct [1 1 1 2]) '(1 2)))
  (assert (= (distinct [1 2 1 2]) '(1 2)))
  (assert (= (distinct "a") [\a])) ; srings are lists of chars
  (assert (= (distinct "abcabab") [\a \b \c]))
  (assert (= (distinct ["abc" "abc"]) ["abc"]))
  (assert (= (distinct [nil nil]) [nil]))
  (assert (= (distinct [0.0 0.0]) [0.0]))
  (assert (= (distinct ['sym 'sym]) '[sym]))
  (assert (= (distinct [:kw :kw]) [:kw]))
  (assert (= (distinct [42 42]) [42]))
  (assert (= (distinct [[] []]) [[]]))
  (assert (= (distinct ['(1 2) '(1 2)]) '[(1 2)]))
  (assert (= (distinct [() ()]) [()]))
  (assert (= (distinct [[1 2] [1 2]]) [[1 2]]))
  (assert (= (distinct [{:a 1 :b 2} {:a 1 :b 2}]) [{:a 1 :b 2}]))
  (assert (= (distinct [{} {}]) [{}]))
  (assert (= (distinct [#{1 2} #{1 2}]) [#{1 2}]))
  (assert (= (distinct [#{} #{}]) [#{}]))

;;regexps
#_(
  (assert (= (str (re-pattern "f(.)o")) (str (js* "/f(.)o/"))))
  (assert (= (re-find (re-pattern "foo") "foo bar foo baz foo zot") "foo"))
  (assert (= (re-find (re-pattern "f(.)o") "foo bar foo baz foo zot") ["foo" "o"]))
  (assert (= (re-matches (re-pattern "foo") "foo") "foo"))
  (assert (= (re-matches (re-pattern "foo") "foo bar foo baz foo zot") nil))
  (assert (= (re-matches (re-pattern "foo.*") "foo bar foo baz foo zot") "foo bar foo baz foo zot"))
  (assert (= (re-seq (re-pattern "foo") "foo bar foo baz foo zot") (list "foo" "foo" "foo")))
  (assert (= (re-seq (re-pattern "f(.)o") "foo bar foo baz foo zot") (list ["foo" "o"] ["foo" "o"] ["foo" "o"]))))

  ;; destructuring
  (assert (= [2 1] (let [[a b] [1 2]] [b a])))
  (assert (= #{1 2} (let [[a b] [1 2]] #{a b})))
  (assert (= [1 2] (let [{a :a b :b} {:a 1 :b 2}] [a b])))
  (assert (= [1 2] (let [{:keys [a b]} {:a 1 :b 2}] [a b])))
  (assert (= [1 2 [1 2]] (let [[a b :as v] [1 2]] [a b v])))
  (assert (= [1 42] (let [{:keys [a b] :or {b 42}} {:a 1}] [a b])))
  (assert (= [1 nil] (let [{:keys [a b] :or {c 42}} {:a 1}] [a b])))
  (assert (= [2 1] (let [[a b] '(1 2)] [b a])))
  (assert (= {1 2} (let [[a b] [1 2]] {a b})))
  (assert (= [2 1] (let [[a b] (seq [1 2])] [b a])))

  ;; update-in
  (assert (= {:foo {:bar {:baz 1}}}
             (update-in {:foo {:bar {:baz 0}}} [:foo :bar :baz] inc)))
  (assert (= {:foo 1 :bar 2 :baz 10}
             (update-in {:foo 1 :bar 2 :baz 3} [:baz] + 7)))
  (assert (= [{:foo 1, :bar 2} {:foo 1, :bar 3}]
               (update-in [{:foo 1 :bar 2}, {:foo 1 :bar 2}] [1 :bar] inc)))
  (assert (= [{:foo {:bar 2}} {:foo {:bar 3}}]
               (update-in [{:foo {:bar 2}}, {:foo {:bar 2}}] [1 :foo :bar] inc)))

  ;; assoc-in
  (assert (= {:foo {:bar {:baz 100}}}
             (assoc-in {:foo {:bar {:baz 0}}} [:foo :bar :baz] 100)))
  (assert (= {:foo 1 :bar 2 :baz 100}
             (assoc-in {:foo 1 :bar 2 :baz 3} [:baz] 100)))
  (assert (= [{:foo [{:bar 2} {:baz 3}]} {:foo [{:bar 2} {:baz 100}]}]
             (assoc-in [{:foo [{:bar 2} {:baz 3}]}, {:foo [{:bar 2} {:baz 3}]}]
                       [1 :foo 1 :baz] 100)))
  (assert (= [{:foo 1, :bar 2} {:foo 1, :bar 100}]
             (assoc-in [{:foo 1 :bar 2}, {:foo 1 :bar 2}] [1 :bar] 100)))

  ;; get-in
  (assert (= 1 (get-in {:foo 1 :bar 2} [:foo])))
  (assert (= 2 (get-in {:foo {:bar 2}} [:foo :bar])))
  (assert (= 1 (get-in [{:foo 1}, {:foo 2}] [0 :foo])))
  (assert (= 4 (get-in [{:foo 1 :bar [{:baz 1}, {:buzz 2}]}, {:foo 3 :bar [{:baz 3}, {:buzz 4}]}]
                       [1 :bar 1 :buzz])))

  ;; arrays
  (let [a (to-array [1 2 3])]
    (assert (= [10 20 30] (seq (amap a i ret (* 10 (aget a i))))))
    (assert (= 6 (areduce a i ret 0 (+ ret (aget a i)))))
    (assert (= (seq a) (seq (to-array [1 2 3]))))
    (assert (= 42 (aset a 0 42)))
    (assert (not= (seq a) (seq (to-array [1 2 3]))))
    (assert (not (identical? a (aclone a))))) ;scheme vectors use value equality

  ;; sort
  (assert (= [1 2 3 4 5] (sort [5 3 1 4 2])))
  (assert (= [1 2 3 4 5] (sort < [5 3 1 4 2])))
  (assert (= [5 4 3 2 1] (sort > [5 3 1 4 2])))

  ;; sort-by
  (assert (= ["a" [ 1 2] "foo"] (sort-by count ["foo" "a" [1 2]])))
  (assert (= ["foo" [1 2] "a"] (sort-by count > ["foo" "a" [1 2]])))

  ;; js->clj
#_( (assert (= {"a" 1, "b" 2} (js->clj (js* "{\"a\":1,\"b\":2}"))))
  (assert (= {:a 1, :b 2} (js->clj (js* "{\"a\":1,\"b\":2}") :keywordize-keys true)))
  (assert (= [[{:a 1, :b 2} {:a 1, :b 2}]]
             (js->clj (js* "[[{\"a\":1,\"b\":2}, {\"a\":1,\"b\":2}]]") :keywordize-keys true)))
  (assert (= [[{:a 1, :b 2} {:a 1, :b 2}]]
             (js->clj [[{:a 1, :b 2} {:a 1, :b 2}]]))))

  ;; last
  (assert (= nil (last nil)))
  (assert (= 3 (last [1 2 3])))

  ;; dotimes
  (let [s (atom [])]
    (dotimes [n 5]
      (swap! s conj n))
    (assert (= [0 1 2 3 4] @s)))

  ;; doseq
  (let [v [1 2 3 4 5]
        s (atom ())]
    (doseq [n v] (swap! s conj n))
    (assert (= @s (reverse v))))

  ;; delay
  ;; (let [d (delay (. (js/Date.) (getTime)))]
  ;;   (assert (false? (realized? d)))
  ;;   (let [d2 (. (js/Date.) (getTime))]
  ;;     (assert (> d2 (deref d))))
  ;;   (assert (true? (realized? d)))
  ;;   (let [d3 (deref d)]
  ;;     (assert (= (deref d) d3))))

  ;; assoc
  (assert (= {1 2 3 4} (assoc {} 1 2 3 4)))
  (assert (= {1 2} (assoc {} 1 2)))
  (assert (= [42 2] (assoc [1 2] 0 42)))

  ;; dissoc
  (assert (= {} (dissoc {1 2 3 4} 1 3)))
  (assert (= {1 2} (dissoc {1 2 3 4} 3)))

  ;; disj
  (assert (= #{1 2 3} (disj #{1 2 3})))
  (assert (= #{1 2} (disj #{1 2 3} 3)))
  (assert (= #{1} (disj #{1 2 3} 2 3)))

  ;; memoize
  (let [f (memoize (fn [] (rand)))]
    (f)
    (assert (= (f) (f))))

  ;; find
  (assert (= (find {} :a) nil))
  (assert (= (find {:a 1} :a) [:a 1]))
  (assert (= (find {:a 1} :b) nil))
  (assert (= (find {:a 1 :b 2} :a) [:a 1]))
  (assert (= (find {:a 1 :b 2} :b) [:b 2]))
  (assert (= (find {:a 1 :b 2} :c) nil))
  (assert (= (find {} nil) nil))
  (assert (= (find {:a 1} nil) nil))
  (assert (= (find {:a 1 :b 2} nil) nil))
  (assert (= (find [1 2 3] 0) [0 1]))

  ;; mod,quot,rem
  (assert (= (quot 4 2) 2))
  (assert (= (quot 3 2) 1))
  (assert (= (quot 6 4) 1))
  (assert (= (quot 0 5) 0))
  (assert (= (quot 42 5) 8))
  (assert (= (quot 42 -5) -8))
  (assert (= (quot -42 -5) 8))
  (assert (= (quot 9 3) 3))
  (assert (= (quot 9 -3) -3))
  (assert (= (quot -9 3) -3))
  (assert (= (quot 2 -5) 0))
  (assert (= (quot -2 5) 0))
  (assert (= (quot 0 3) 0))
  (assert (= (quot 0 -3) 0))

  (assert (= (mod 4 2) 0))
  (assert (= (mod 3 2) 1))
  (assert (= (mod 6 4) 2))
  (assert (= (mod 0 5) 0))
  (assert (= (mod 4.5 2.0) 0.5))
  (assert (= (mod 42 5) 2))
  (assert (= (mod 9 3) 0))
  (assert (= (mod 9 -3) 0))
  (assert (= (mod -9 3) 0))
  (assert (= (mod -9 -3) 0))
  (assert (= (mod 0 3) 0))
  (assert (= (mod 3216478362187432 432143214) 120355456))

  (assert (= (rem 4 2) 0))
  (assert (= (rem 0 5) 0))
  (assert (= (rem 4.5 2.0) 0.5))
  (assert (= (rem 42 5) 2))
  (assert (= (rem 2 5) 2))
  (assert (= (rem 2 -5) 2))
  (assert (= (rem 0 3) 0))

  ;; range
  (assert (= (range 10) (list 0 1 2 3 4 5 6 7 8 9)))
  (assert (= (range 10 20) (list 10 11 12 13 14 15 16 17 18 19)))
  (assert (= (range 10 20 2) (list 10 12 14 16 18)))
  (assert (= (take 20 (range)) (list 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19)))

  ;; group-by
  (let [d (group-by second {:a 1 :b 2 :c 1 :d 4 :e 1 :f 2})]
    (assert (= 3 (count (get d 1))))
    (assert (= 2 (count (get d 2))))
    (assert (= 1 (count (get d 4)))))

  (assert (= {1 2 3 4 5 6} (merge {1 2} {3 4} {5 6})))
  (assert (= {1 2 3 4} (merge {1 2} {3 4} nil)))

  ;; frequencies
  (assert (= {:a 3 :b 2} (frequencies [:a :b :a :b :a])))

  ;; reductions
  (assert (= [1 3 6 10 15] (reductions + [1 2 3 4 5])))

  ;; keep
  (assert (= [1 3 5 7 9] (keep #(if (odd? %) %) [1 2 3 4 5 6 7 8 9 10])))
  (assert (= [2 4 6 8 10] (keep #(if (even? %) %) [1 2 3 4 5 6 7 8 9 10])))

  ;; keep-indexed
  (assert (= [1 3 5 7 9] (keep-indexed #(if (odd? %1) %2) [0 1 2 3 4 5 6 7 8 9 10])))
  (assert (= [2 4 5] (keep-indexed #(if (pos? %2) %1) [-9 0 29 -7 45 3 -8])))

  ;; map-indexed
  (assert (= [[0 :a] [1 :b] [2 :c]] (map-indexed #(vector % %2) [:a :b :c])))

  ;; merge-with
  (assert (= '{"Foo" ("foo" "FOO" "fOo"), "Bar" ("bar" "BAR" "BAr"), "Baz" ["baz"], "Qux" ["qux" "quux"]}
             (merge-with concat
                  {"Foo" ["foo" "FOO"]
                   "Bar" ["bar" "BAR"]
                   "Baz" ["baz"]}
                  {"Foo" ["fOo"]
                   "Bar" ["BAr"]
                   "Qux" ["qux" "quux"]})))
  (assert (= {:a 111, :b 102, :c 13}
             (merge-with +
                         {:a 1 :b 2 :c 3}
                         {:a 10 :c 10}
                         {:a 100 :b 100})))

  (assert (= {:a 3, :b 102, :c 13}
             (apply merge-with [+
                                {:a 1 :b 100}
                                {:a 1 :b 2 :c 3}
                                {:a 1 :c 10}])))

  (assert (= '[a c e] (replace '[a b c d e] [0 2 4])))
  (assert (= [:one :zero :two :zero]
             (replace {0 :zero 1 :one 2 :two} '(1 0 2 0))))

  ;; split-at
  (assert (= [[1 2] [3 4 5]] (split-at 2 [1 2 3 4 5])))

  ;; split-with
  (assert (= [[1 2 3] [4 5]] (split-with (partial >= 3) [1 2 3 4 5])))

  ;; trampoline
  (assert (= 10000 (trampoline (fn f [n] (if (>= n 10000) n #(f (inc n)))) 0)))

  ;; vary-meta
  (assert (= {:a 1} (meta (vary-meta [] assoc :a 1))))
  (assert (= {:a 1 :b 2} (meta (vary-meta (with-meta [] {:b 2}) assoc :a 1))))

  ;; multi-methods
  (swap! global-hierarchy (fn [_] (make-hierarchy))) ;ClojureScript is happy to call make-hierarchy with too many args.

  ;; hierarchy tests
  (derive :user/rect :user/shape)
  (derive :user/square :user/rect)

  (assert (= #{:user/shape} (parents :user/rect)))
  (assert (= #{:user/rect :user/shape} (ancestors :user/square)))
  (assert (= #{:user/rect :user/square} (descendants :user/shape)))
  (assert (true? (isa? 42 42)))
  (assert (true? (isa? :user/square :user/shape)))

  (derive cljs.core/Array :user/collection)
  (derive cljs.core/Set :user/collection)
  (assert (true? (isa? cljs.core/Array :user/collection)))
  (assert (true? (isa? cljs.core/Set :user/collection)))
  (assert (false? (isa? cljs.core/IndexedSeq :user/collection)))
  ;; ?? (isa? String Object)
  (assert (true? (isa? [:user/square :user/rect] [:user/shape :user/shape])))
  ;; ?? (ancestors java.util.ArrayList)

  ;; ?? isa? based dispatch tests

  ;; prefer-method test
  (defmulti bar (fn [x y] [x y]))
  (defmethod bar [:user/rect :user/shape] [x y] :rect-shape)
  (defmethod bar [:user/shape :user/rect] [x y] :shape-rect)

  ;;(bar :user/rect :user/rect)
  ;; -> java.lang.IllegalArgumentException:
  ;;  Multiple methods match dispatch value:
  ;;  [:user/rect :user/rect] -> [:user/rect :user/shape]
  ;;  and [:user/shape :user/rect],
  ;;  and neither is preferred

  (assert (zero? (count (prefers bar))))
  (prefer-method bar [:user/rect :user/shape] [:user/shape :user/rect])
  (assert (= 1 (count (prefers bar))))
  (assert (= :rect-shape (bar :user/rect :user/rect)))
  (assert (= :rect-shape (apply (cljs.core/-get-method bar [:user/rect :user/shape]) [:user/rect :user/shape])))

  ;; nested data structures tests
  (defmulti nested-dispatch (fn [m] (-> m :a :b)))
  (defmethod nested-dispatch :c [m] :nested-a)
  (defmethod nested-dispatch :default [m] :nested-default)
  (assert (= :nested-a (nested-dispatch {:a {:b :c}})))

  (defmulti nested-dispatch2 ffirst)
  (defmethod nested-dispatch2 :a [m] :nested-a)
  (defmethod nested-dispatch2 :default [m] :nested-default)
  (assert (= :nested-a (nested-dispatch2 [[:a :b]])))

  ;; general tests
  (defmulti foo (fn [& args] (first args)))
  (defmethod foo :a [& args] :a-return)
  (defmethod foo :default [& args] :default-return)
  (assert (= :a-return (foo :a)))
  (assert (= :default-return (foo 1)))

  (defmulti area :Shape)
  (defn rect [wd ht] {:Shape :Rect :wd wd :ht ht})
  (defn circle [radius] {:Shape :Circle :radius radius})
  (defmethod area :Rect [r]
    (* (:wd r) (:ht r)))
  (defmethod area :Circle [c]
    (*  Math/PI (* (:radius c) (:radius c))))
  (defmethod area :default [x] :oops)
  (def r (rect 4 13))
  (def c (circle 12))
  (assert (= 52 (area r)))
  (assert (= :oops (area {})))

  ;; remove method tests
  (assert (= 2 (count (methods bar))))
  (remove-method bar [:user/rect :user/shape])
  (assert (= 1 (count (methods bar))))
  (remove-all-methods bar)
  (assert (zero? (count (methods bar))))

  ;; test apply
  (defmulti apply-multi-test (fn ([_] 0) ([_ _] 0) ([_ _ _] 0)))
  (defmethod apply-multi-test 0
    ([x] :one)
    ([x y] :two)
    ([x y & r] [:three r]))
  (assert (= [:three '(2)] (apply apply-multi-test [0 1 2])))

  ;; Range
  (assert (= (range 0 10 3) (list 0 3 6 9)))
  (assert (= (count (range 0 10 3)) 4))
  (assert (= (range 0 -10 -3) (list 0 -3 -6 -9)))
  (assert (= (count (range 0 -10 -3)) 4))
  (assert (= (range -10 10 3) (list -10 -7 -4 -1 2 5 8)))
  (assert (= (count (range -10 10 3)) 7))
  (assert (= (range 0 1 1) (list 0)))
  (assert (= (range 0 -3 -1) (list 0 -1 -2)))
  (assert (= (range 3 0 -1) (list 3 2 1)))
  (assert (= (range 0 10 -1) (list)))
  (assert (= (range 0 1 0) (list)))
  (assert (= (range 10 0 1) (list)))
  (assert (= (range 0 0 0) (list)))
  (assert (= (count (range 0 10 -1)) 0))
  (assert (= (count (range 0 1 0)) 0))
  (assert (= (count (range 10 0 1)) 0))
  (assert (= (count (range 0 0 0)) 0))
  (assert (= (take 3 (range 1 0 0)) (list 1 1 1)))
  (assert (= (take 3 (range 3 1 0)) (list 3 3 3)))

  ;; subvec
  (let [v (vec (range 10))
        s (subvec v 2 8)]
    (assert (= s
               (-> v
                   (subvec 2)
                   (subvec 0 6))))
    (assert (= s (->> v
                    (drop 2)
                    (take 6))))
    (assert (= 6 (count s)))
    (assert (= [2 3 4 5 6] (pop s)))
    (assert (= 7 (peek s)))
    (assert (= [2 3 4 5 6 7 1]
               (assoc s 6 1)))
    (assert (= [2 3 4 5 6 7 1]
               (conj s 1)))
    (assert (= 27 (reduce + s)))
    (assert (= s (vec s))) ; pour into plain vector
    (let [m {:x 1}] (assert (= m (meta (with-meta s m))))))

  ;; defrecord
  
  (defrecord Person [firstname lastname])
  (def fred (Person. "Fred" "Mertz"))
  (assert (= (:firstname fred) "Fred"))
  (def fred-too (Person. "Fred" "Mertz"))
  (assert (= fred fred-too))

  (def ethel (Person. "Ethel" "Mertz" {:married true} {:husband :fred}))
  (assert (= (meta ethel) {:married true}))
  (def ethel-too (Person. "Ethel" "Mertz" {:married true} {:husband :fred}))
  (assert (= ethel ethel-too))

  (assert (= (map->Person {:firstname "Fred" :lastname "Mertz"}) fred))
  (assert (= (->Person "Fred" "Mertz") fred))

  (assert (= (count fred) 2))
  (assert (= (count ethel) 3))

  (defrecord A [])
  (assert (= {:foo 'bar} (meta (with-meta (A.) {:foo 'bar}))))
  (assert (= 'bar (:foo (assoc (A.) :foo 'bar))))


  ;; dot
  #_(let [s "abc"]
    (assert (= 3 (.-length s)))
    (assert (= 3 (. s -length)))
    (assert (= 3 (. (str 138) -length)))
    (assert (= 3 (. "abc" -length)))
    (assert (= "bc" (.substring s 1)))
    (assert (= "bc" (.substring "abc" 1)))
    (assert (= "bc" (. s substring 1)))
    (assert (= "bc" (. s (substring 1))))
    (assert (= "bc" (. s (substring 1 3))))
    (assert (= "bc" (.substring s 1 3)))
    (assert (= "ABC" (. s (toUpperCase))))
    (assert (= "ABC" (. "abc" (toUpperCase))))
    (assert (= "BC" (. (. s (toUpperCase)) substring 1)))
    (assert (= 2 (.-length (. (. s (toUpperCase)) substring 1)))))

  (assert (= (conj fred {:wife :ethel :friend :ricky})
             (map->Person {:firstname "Fred" :lastname "Mertz" :wife :ethel :friend :ricky})))
  (assert (= (conj fred {:lastname "Flintstone"})
             (map->Person {:firstname "Fred" :lastname "Flintstone"})))
  (assert (= (assoc fred :lastname "Flintstone")
             (map->Person {:firstname "Fred" :lastname "Flintstone"})))
  (assert (= (assoc fred :wife :ethel)
             (map->Person {:firstname "Fred" :lastname "Mertz" :wife :ethel})))
  (assert (= (dissoc ethel :husband)
             (map->Person {:firstname "Ethel" :lastname "Mertz"})))
  
  (defrecord A [x])
  (defrecord B [x])
  (assert (not= (A. nil) (B. nil)))



  #_(assert (instance? js/Object 1))
  (assert (instance? cljs.core/Number 1))
  #_(assert (instance? js/Object "foo"))
  (assert (instance? cljs.core/String "foo"))
  #_(assert (instance? js/Object (array)))
  (assert (instance? cljs.core/Array (array)))
  #_(assert (instance? js/Object (fn [])))
  (assert (instance? cljs.core/Procedure (fn [])))



  (defprotocol IFoo (foo [this]))
  #_(assert (= (meta (with-meta (reify IFoo (foo [this] :foo)) {:foo :bar}))
             {:foo :bar}))

  (defmulti foo identity)
  (defmethod foo 0 [x] x)
  (assert (= foo (ffirst {foo 1})))
  
  (defprotocol IMutate
    (mutate [this]))
  
  (deftype Mutate [^:mutable a]
    IMutate
    (mutate [this]
      (set! (.-a this) 'foo))) ;(set! a 'foo) ;;TODO -- we must manually set via member form for now. (fields are values-not mutable locations)

  (def m (Mutate. 4))
  (mutate m)
  (assert (= 'foo (.-a m)))
  
  ;; IFn
  (deftype FnLike []
    IFn
    (-invoke [_ args] (case (count args)
                        0 :a
                        1 :b
                        2 :c)))
  
  (assert (= :a ((FnLike.))))
  (assert (= :b ((FnLike.) 1)))
  (assert (= :c ((FnLike.) 1 2)))

  (assert (= [:b :b :b] (map (FnLike.) [0 0 0])))

  (deftype FnLikeB [a]
    IFn
    (-invoke [_ args] a))

  (assert (= 1 ((FnLikeB. 1))))
  
  ;; hashing bug in many JS runtimes CLJ-118
  (let [g #{(conj #{:2} :alt)}
        h #{#{:2 :alt}}]
    (assert (= g h)))
