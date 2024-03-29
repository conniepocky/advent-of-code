(ns waffles.day-one)

(def puzzle-input
 [141496
  50729
  52916
  98133
  93839
  107272
  142069
  67632
  75009
  74371
  69081
  91480
  102664
  105221
  130656
  90946
  72792
  148049
  70881
  145510
  105035
  149880
  117058
  149669
  59725
  122995
  74449
  96690
  140220
  59294
  142524
  139379
  107322
  57832
  66101
  105801
  59189
  58687
  61454
  116490
  125198
  116264
  103459
  145734
  98738
  62783
  138935
  143958
  87769
  100410
  112567
  131008
  96648
  62022
  84654
  135197
  104771
  116477
  58956
  83449
  71150
  86343
  69346
  100858
  146224
  142933
  135930
  99671
  97840
  145286
  55577
  88347
  75169
  73059
  144308
  110284
  117688
  146396
  75934
  92370
  124781
  133506
  134441
  98229
  100872
  75249
  108598
  106277
  80388
  138398
  143521
  74189
  72945
  79918
  132770
  78616
  91499
  124595
  89042
  90715])

(defn fuel-for-module [module-mass]
  #_(/ module-mass 3)
  (- (quot module-mass 3) 2))

(defn solve-part-1
  [puzzle-input]
  (reduce + (map fuel-for-module puzzle-input)))

(println (solve-part-1 puzzle-input))


;; part two


(defn fuel-required [mass]
  (-quot mass 3) 2)

(reduce +
        (map fuel-required puzzle-input))

(def xform
  (comp
    (map fuel-required)))
        
(transduce (map fuel-required) + puzzle-input)





