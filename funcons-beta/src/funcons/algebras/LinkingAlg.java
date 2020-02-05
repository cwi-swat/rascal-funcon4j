// GeNeRaTeD fOr: ./Computations/Normal/Linking/Linking.cbs
package funcons.algebras;

public interface LinkingAlg<E> {
  E link__(E[] args);
  E initialise_linking__(E[] args);
  E fresh_link__(E[] args);
  E fresh_initialised_link_(E arg1,E arg2);
  E fresh_init_link_(E arg1,E arg2);
  E set_link__(E[] args);
  E follow_link__(E[] args);
  E follow_if_link__(E[] args);
  E links_();
}