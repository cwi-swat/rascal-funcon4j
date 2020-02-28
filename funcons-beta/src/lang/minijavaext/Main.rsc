module lang::minijavaext::Main

import lang::minijavaext::Syntax;
import lang::minijavaext::Translation;

import lang::funcon::ToFCT;

import String;

import IO;

public void main(){
  for (loc l <- |project://rascal-funconb4j/examples/minijava-ext|.ls, endsWith(l.file,".minijava")) 
    generateFCT_file(l);
}

public void generateFCT_file(loc l) {
  l_fct = l.parent + (l.file + ".fct");
  println(l_fct);
  program = load(l);
  writeFile(l_fct, toFCT(sem(program))());
}