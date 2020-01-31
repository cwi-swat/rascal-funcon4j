#!/bin/bash

run_test() {
  out=$(dist/build/cbs2imls/cbs2imls "$1" /tmp/fake.iml Core --siml --unify-only --csv --generate-congruences);
  if [[ $out ]]
    then  echo "$out";
  fi
}
export -f run_test
echo "funcon, relation, #S, #D, #R, #V/R..., #D/R..."
find ../../CBS/FCT-Editor/cbs/Funcons -name "*.cbs" | xargs -n1 -I{} bash -c 'run_test "$@"' _ {} 
