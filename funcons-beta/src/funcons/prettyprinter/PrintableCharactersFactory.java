// GeNeRaTeD fOr: ./Values/Primitive/Characters/Characters.cbs
package funcons.prettyprinter;

import funcons.algebras.CharactersAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableCharactersFactory extends CharactersAlg<IPrint> {
  @Override
  default IPrint unicode_character__(IPrint[] args) {
    return FCTPrinter.variadic("unicode-character",args);
  }
  
  @Override
  default IPrint unicode_char__(IPrint[] args) {
    return FCTPrinter.variadic("unicode-char",args);
  }
  
  @Override
  default IPrint unicode_point__(IPrint[] args) {
    return FCTPrinter.variadic("unicode-point",args);
  }
  
  @Override
  default IPrint unicode__(IPrint[] args) {
    return FCTPrinter.variadic("unicode",args);
  }
  
  @Override
  default IPrint iso_latin_1_points_() {
    return FCTPrinter.nullary("iso-latin-1-points");
  }
  
  @Override
  default IPrint ascii_points_() {
    return FCTPrinter.nullary("ascii-points");
  }
  
  @Override
  default IPrint ascii_character__(IPrint[] args) {
    return FCTPrinter.variadic("ascii-character",args);
  }
  
  @Override
  default IPrint ascii_char__(IPrint[] args) {
    return FCTPrinter.variadic("ascii-char",args);
  }
  
  @Override
  default IPrint utf_8__(IPrint[] args) {
    return FCTPrinter.variadic("utf-8",args);
  }
  
  @Override
  default IPrint utf_16__(IPrint[] args) {
    return FCTPrinter.variadic("utf-16",args);
  }
  
  @Override
  default IPrint utf_32__(IPrint[] args) {
    return FCTPrinter.variadic("utf-32",args);
  }
  
  @Override
  default IPrint backspace_() {
    return FCTPrinter.nullary("backspace");
  }
  
  @Override
  default IPrint horizontal_tab_() {
    return FCTPrinter.nullary("horizontal-tab");
  }
  
  @Override
  default IPrint line_feed_() {
    return FCTPrinter.nullary("line-feed");
  }
  
  @Override
  default IPrint form_feed_() {
    return FCTPrinter.nullary("form-feed");
  }
  
  @Override
  default IPrint carriage_return_() {
    return FCTPrinter.nullary("carriage-return");
  }
  
  @Override
  default IPrint double_quote_() {
    return FCTPrinter.nullary("double-quote");
  }
  
  @Override
  default IPrint single_quote_() {
    return FCTPrinter.nullary("single-quote");
  }
  
  @Override
  default IPrint backslash_() {
    return FCTPrinter.nullary("backslash");
  }
  
  @Override
  default IPrint characters_() {
    return FCTPrinter.nullary("characters");
  }
  
  @Override
  default IPrint chars_() {
    return FCTPrinter.nullary("chars");
  }
  
  @Override
  default IPrint unicode_characters_() {
    return FCTPrinter.nullary("unicode-characters");
  }
  
  @Override
  default IPrint unicode_chars_() {
    return FCTPrinter.nullary("unicode-chars");
  }
  
  @Override
  default IPrint unicode_points_() {
    return FCTPrinter.nullary("unicode-points");
  }
  
  @Override
  default IPrint basic_multilingual_plane_characters_() {
    return FCTPrinter.nullary("basic-multilingual-plane-characters");
  }
  
  @Override
  default IPrint bmp_chars_() {
    return FCTPrinter.nullary("bmp-chars");
  }
  
  @Override
  default IPrint basic_multilingual_plane_points_() {
    return FCTPrinter.nullary("basic-multilingual-plane-points");
  }
  
  @Override
  default IPrint iso_latin_1_characters_() {
    return FCTPrinter.nullary("iso-latin-1-characters");
  }
  
  @Override
  default IPrint latin_1_chars_() {
    return FCTPrinter.nullary("latin-1-chars");
  }
  
  @Override
  default IPrint ascii_characters_() {
    return FCTPrinter.nullary("ascii-characters");
  }
  
  @Override
  default IPrint ascii_chars_() {
    return FCTPrinter.nullary("ascii-chars");
  }
}