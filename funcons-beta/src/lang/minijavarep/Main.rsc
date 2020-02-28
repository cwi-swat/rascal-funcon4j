module lang::minijavarep::Main

import lang::minijavarep::Syntax;
import lang::minijavarep::Translation;

import lang::funcon::ToFCT;

import String;

import IO;

public void main(){
  for (loc l <- |project://rascal-funconb4j/examples/minijava-rep|.ls, endsWith(l.file,".minijava")) 
    generateFCT_file(l);
}

public void generateFCT_file(loc l) {
  l_fct = l.parent + (l.file + ".fct");
  println(l_fct);
  program = load(l);
  writeFile(l_fct, toFCT(sem(program))());
}