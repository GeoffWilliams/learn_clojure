# Learn Clojure
Not a tutorial, just sparse programming notes and techniques.  Plenty on youtube if your interested though.

This stuff makes my brain hurt!

Best bit of advice I've had so far was to not worry about the '((()))' :)

basically you need to mentally remap:

```
f(n)
```

to:

```
(f n)
```

...And your set!

## Writing code
Quickest way I've found to be up and running:  [Light Table](http://lighttable.com/).  Open a .clj file and start coding, go to run it and it downloads clojure and runs it all on its own - wow!

There is live evaluation of functions which you can get in a live evaluation buffer (how to open? I know there is one!) or by pressing (command)(enter) on a mac.  Note that if evaluating on demand you have to manually update your function before attempting to call it!

## Running code
Quick and dirty way to run a .clj file on the command line (if you ran clojure the easy way above, then it should have downloaded to your ~/m2 directory - good old maven.

```
java -jar ~/./.m2/repository/org/clojure/clojure/1.6.0/clojure-1.6.0.jar  ~/filename_to_run.clj
```

More complicated/robust way to run code: [Leningen](http://leiningen.org/) - produces a thing called an uberjar which is your code + all dependences + clojure itself which you can then run with `java -jar ...`.
