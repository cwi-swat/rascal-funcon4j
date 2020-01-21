module lang::funcon::String

data FunCon
  = string(str s)
  | char_(str c) // java.lang.Character
  | camlLightString(str s)
  | camlLightChar(str s)
  | stringAppend(FunCon str1, FunCon str2)
  ;