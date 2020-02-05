// GeNeRaTeD fOr: ./Values/Composite/Maps/Maps.cbs
package funcons.algebras;

public interface MapsAlg<E> {
  E map__(E[] args);
  E map_elements__(E[] args);
  E map_lookup__(E[] args);
  E lookup__(E[] args);
  E map_domain__(E[] args);
  E dom__(E[] args);
  E map_override__(E[] args);
  E map_unite__(E[] args);
  E map_delete__(E[] args);
  E maps__(E[] args);
}