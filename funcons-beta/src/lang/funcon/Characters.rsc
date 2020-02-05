// GeNeRaTeD fOr: ./Values/Primitive/Characters/Characters.cbs
module lang::funcon::Characters

data FunCon
  = unicode_character__(list[FunCon] args)
  | unicode_char__(list[FunCon] args)
  | unicode_point__(list[FunCon] args)
  | unicode__(list[FunCon] args)
  | iso_latin_1_points_()
  | ascii_points_()
  | ascii_character__(list[FunCon] args)
  | ascii_char__(list[FunCon] args)
  | utf_8__(list[FunCon] args)
  | utf_16__(list[FunCon] args)
  | utf_32__(list[FunCon] args)
  | backspace_()
  | horizontal_tab_()
  | line_feed_()
  | form_feed_()
  | carriage_return_()
  | double_quote_()
  | single_quote_()
  | backslash_()
  | characters_()
  | chars_()
  | unicode_characters_()
  | unicode_chars_()
  | unicode_points_()
  | basic_multilingual_plane_characters_()
  | bmp_chars_()
  | basic_multilingual_plane_points_()
  | iso_latin_1_characters_()
  | latin_1_chars_()
  | ascii_characters_()
  | ascii_chars_()
  ;
FunCon unicode_character_(FunCon args...) = unicode_character__(args);
FunCon unicode_char_(FunCon args...) = unicode_char__(args);
FunCon unicode_point_(FunCon args...) = unicode_point__(args);
FunCon unicode_(FunCon args...) = unicode__(args);
FunCon ascii_character_(FunCon args...) = ascii_character__(args);
FunCon ascii_char_(FunCon args...) = ascii_char__(args);
FunCon utf_8_(FunCon args...) = utf_8__(args);
FunCon utf_16_(FunCon args...) = utf_16__(args);
FunCon utf_32_(FunCon args...) = utf_32__(args);